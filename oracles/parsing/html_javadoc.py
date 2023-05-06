'''

@author: Andrew Habib

'''

import codecs
import json
import os
import re
import sys
import subprocess
import math
import random
import traceback
from collections import OrderedDict
from joblib import Parallel, delayed
from subprocess import TimeoutExpired, CalledProcessError
from joblib import Parallel, delayed
from bs4 import BeautifulSoup
from  bs4 import element

#from ArtifactInfo import ArtifactInfo
import shutil
# from MethodDoc import ConstructorDoc, MethodDoc

MAVEN_REPOS = os.getenv("MAVEN_REPOS")
MAVEN_ART_WITH_CP = os.getenv("MAVEN_ART_WITH_CP")
MAVEN_DOCS_JSON = os.getenv("MAVEN_DOCS_JSON")

JAVADOC_TIMEOUT = 180  # 3 mins
CORES = int(os.cpu_count())

MODIFIERS = ["abstract", "static", "final", "public", "protected", "private", "synchronized"]
DIAMOND_WITH_COMMA_RE = r"(?<!(?=(?:(?:<(?:(?:<(?:[^<>])*>)|(?:[^<>]))*>)|(?:[^<>]))*>)),"
DIAMOND_WITH_SPACE_RE = r"(?<!(?=(?:(?:<(?:(?:<(?:[^<>])*>)|(?:[^<>]))*>)|(?:[^<>]))*>)) "


def custom_comma_split(s):
    return re.split(DIAMOND_WITH_COMMA_RE, s)

    
def custom_space_split(s):
    return re.split(DIAMOND_WITH_SPACE_RE, s)


def traverse_inner_most_of_nested_div(tree):
    if not tree:
        return
    previous = tree
    while tree.div:
        previous = tree.div
        tree = tree.div
    return previous


def extract_class_typeParams(tree):
    paramDic = OrderedDict()
    # type params from declaration
    decl = tree.find("span", {"class": "typeNameLabel"}).getText()
#     if "<" in decl:
#         _, _, tparams = decl.partition("<") 
#         tparams, _, _ = tparams.rpartition(">")
#         for p in custom_comma_split(tparams):
#             paramDic[p] = ""
#             
#     # documentation of type params
#     paramBlock = tree.find("span", {"class": "paramLabel"})
#     if paramBlock:
#         paramBlock = paramBlock.parent.parent
#         for entry in paramBlock.findAll("dd"):
#             name, _, desc = entry.getText().partition(" - ")
#             paramDic[name] = clean_text(desc)
#     
    ######

    if "<" in decl:
        _, _, tparams = decl.partition("<") 
        tparams, _, _ = tparams.rpartition(">")
        types = custom_comma_split(tparams)
#         for p in custom_comma_split(tparams):
#             paramDic[p] = ""
            
        # documentation of type params
        paramBlock = tree.find("span", {"class": "paramLabel"})
        if paramBlock:
            paramBlock = paramBlock.parent.parent
            for entry in paramBlock.findAll("dd"):
                name, _, desc = entry.getText().partition(" - ")
                paramDic[name] = clean_text(desc)
        
        for tp_doc in list(paramDic.keys()):
            t = match_typeparamname_with_typedef(tp_doc, types)
            if t:
                types.remove(t)
                paramDic[t] = paramDic[tp_doc]
                if t != tp_doc:
                    del paramDic[tp_doc]
        
        for t in types:
            paramDic[t] = ""
            
    return paramDic


def extract_class_all_implemented_interface(tree):
    impl_tree = tree.parent.find("dt", text="All Implemented Interfaces:")
    if impl_tree: 
        impl_txt = extract_declaration_from_htmltag_contents(impl_tree.parent.find("dd").contents)
        impl = []
        for i in custom_comma_split(impl_txt):
            impl.append(i.replace(" ", ""))
    else:
        impl = []
    return impl

    
def extract_class_extends_implements_from_declaration(tree):
        
    decl = extract_declaration_from_htmltag_contents(tree)
    if "public " not in decl:# or "abstract "in decl:
        return False
    
    extended = ""
    implemented = ""
    if "extends" in decl:
        extended = decl.split("extends")[1]
        
        if "implements" in extended:
            extended, implemented = extended.split("implements")
    
    elif "implements" in decl:
        implemented = decl.split("implements")[1]
    
    if extended:
        extended = custom_comma_split(extended.replace(" ", "").strip("\n"))  # .split(",")
    else:
        extended = []
        
    if implemented:
        implemented = custom_comma_split(implemented.replace(" ", "").strip("\n"))  # .split(",")
    else:
        implemented = []
        
    return {"extends": extended, "implements": implemented}


def extract_declaration_from_htmltag_contents(tree):
    decl = ""
    i = 0;
    while i < len(tree):
        
        if isinstance(tree[i], str): 
            decl += tree[i]
        
        elif tree[i].name == "span" and "class" in tree[i].attrs.keys():
            if tree[i]["class"][0] == "typeNameLabel":
                decl += tree[i].contents[0]
            
        elif tree[i].name == "a":
            if "title" in tree[i].attrs.keys():
                if "type parameter" not in tree[i]["title"]:
                    _decl = tree[i]["title"]
                    _decl += "." + tree[i].contents[0]
                    decl += _decl
                else:
                    decl += tree[i].contents[0]
            else:  # handles annotations special case @annotation(v=k)
                decl += tree[i].contents[0]
                
        i += 1

    decl = decl.replace("type parameter in ", "").replace("class or interface in ", "").replace("interface in ", "").replace("class in ", "").replace("enum in ", "").replace("annotation in ", "").replace("method in ", "")
    decl = clean_text(decl)

    # Type parameters are not seperated just by a comma, we need a comma and a space
    decl = re.sub(",(?=\S)", ", ", decl)

    return decl
                    
                    
def extract_public_or_interface_methods_info(lst, is_interface):
    methods = {}
    for block in lst:
        decl = block.pre
        if decl:
            raw_decl = extract_declaration_from_htmltag_contents(decl.contents)
            decl = get_processed_method_decl(raw_decl, is_interface)

            if decl and "<any>" not in decl:  # when javadoc does not find dependencies, it uses <any> as a type placeholder
                throws = {}
                params = OrderedDict()
                paramsList = []
                if "throws" in decl:
                    decl, _, throws = decl.partition(" throws ") 
                    throws = {t: "" for t in throws.replace(" ", "").split(",")}    
            
                # extract documentation
                doc = extract_method_doc(block)

                # Check if static
                doc["static"] = "static " in raw_decl
                
                # extract signature
                tparams_ret_name, _, params = decl.rpartition("(")

                params = params[:-1].strip(" ")
                if params:
                    params = custom_comma_split(params)
                for p in params:
                    p = p.strip(" ")
                    p_type, _, p_name = p.rpartition(" ")
                    paramsList.append((p_name, p_type))
                tparams_ret, _, name = tparams_ret_name.rpartition(" ")

                params = {}
                for p_name, p_type in paramsList:
                    if '@' in p_type:
                        p_annotation, _, p_type = p_type.partition(' ')
                    else:
                        p_annotation = ""
                    params[p_name] = (p_type, doc["params"].get(p_name, ""), p_annotation)
                signature = name + "(" + ", ".join(type for name, (type, comment, annotation) in params.items()) + ")"
                doc["params"] = params
                
                tparams_ret = custom_space_split(tparams_ret)

                # There are annotations we don't care about
                if len(tparams_ret) > 2:
                    tparams_ret = tparams_ret[-2:]
                
                if len(tparams_ret) == 2:  # there is a return and typeparams
                    types = custom_comma_split(tparams_ret[0][1:-1])
                    for tp_doc in list(doc["typeparams"].keys()):
                        t = match_typeparamname_with_typedef(tp_doc, types)
                        if t:
                            types.remove(t)
                            doc["typeparams"][t] = doc["typeparams"][tp_doc]
                            if t != tp_doc:
                                del doc["typeparams"][tp_doc]
                    for t in types:
                        doc["typeparams"][t] = ""
                            
                    doc["returns"] = (tparams_ret[1], doc["returns"])
                     
                elif len(tparams_ret) == 1:  # there is NO return; i.e. is a constructor OR a simple return value
                    
                    if tparams_ret[0] == "":
                        doc["typeparams"] = {}
                        doc["returns"] = ()
                    
                    elif '<' in tparams_ret[0][0]:
                        types = custom_comma_split(tparams_ret[0][1:-1])
                        for tp_doc in list(doc["typeparams"].keys()):
                            t = match_typeparamname_with_typedef(tp_doc, types)
                            if t:
                                types.remove(t)
                                doc["typeparams"][t] = doc["typeparams"][tp_doc]
                                if t != tp_doc:
                                    del doc["typeparams"][tp_doc]
                        for t in types:
                            doc["typeparams"][t] = ""
                        
                        doc["returns"] = ()
                    
                    else:
                        doc["typeparams"] = {}
                        doc["returns"] = (tparams_ret[0], doc["returns"])

                for qualifited_thr in list(throws.keys()):
                    found = False
                    for thr in list(doc["throws"].keys()):
                        if thr in qualifited_thr:
                            found = True
                            doc["throws"][qualifited_thr] = doc["throws"][thr]
                            del doc["throws"][thr]
                    if not found:
                        doc["throws"][qualifited_thr] = ''
                        
                if doc["comment"] or doc["returns"] :     
                    methods[signature] = doc
                else:
                    continue

    return methods


def match_typeparamname_with_typedef(name, types):
    
    for t in types:
        if name in t.split(' '):
            return t
    

def extract_node_text(node):
    if isinstance(node, str):
        return str(node)
    else:
        return node.text

def previous_sibling_text(tag):
    text = ''

    for sib in reversed(list(tag.previous_siblings)):
        text += extract_node_text(sib)

    return text

def text_extents(tag, root = None):
    previous_text = ''

    # For all parents we add the text of their previous siblings
    for parent in tag.parents:
        # If we have reached our root, we can stop early
        if parent == root:
            break

        previous_text += previous_sibling_text(parent)

    # The text of the previous siblings for our current tag has to be added as well
    previous_text += previous_sibling_text(tag)

    start = len(previous_text)
    end = start + len(extract_node_text(tag))

    return start, end

def extract_code_snippets(tag):
    snippet_tags = tag.select('code, tt')

    snippets = []
    for snippet_tag in snippet_tags:
        start, end = text_extents(snippet_tag, root = tag)

        # Sometimes there are stacked html tags. We only want the outer ones.
        if snippet_tag.parent.name in ['code', 'tt']:
            continue

        if snippet_tag.parent.name == 'a':
            link = snippet_tag.parent['href']
        else:
            link = None

        snippet = {
            "text": snippet_tag.text,
            "start": start,
            "end": end,
            "link": link
        }

        snippets.append(snippet)

    return snippets

def extract_method_doc(block):
    body = ""
    snippets = []
    if block.select('div.block'):
        #body = clean_text(block.div)
        node = block.select('div.block')[-1]
        body = extract_node_text(node)
        snippets = extract_code_snippets(node)

    try:
        fragment = block.parent.find_previous_sibling('a')['name']
    except:
        fragment = None
    
    ret, overrides = "", ""
    tparams, params, throws = OrderedDict(), OrderedDict(), {}
    if block.dl:
        dl = block.dl
        
        dt_idxs = list(
            filter(lambda y: y >= 0,
                   map(lambda x: dl.index(x) if x in dl else -1,
                       dl.findAll("dt"))))
        
        dd_idxs = list(
            filter(lambda y: y >= 0,
                   map(lambda x: dl.index(x) if x in dl else -1,
                       dl.findAll("dd"))))
        
        for i, dt_idx in enumerate(dt_idxs):
            dt = dl.contents[dt_idx]
            
            if dt.text == "Specified by:":
#                 overrides = clean_text(dt.findNext("dd"))
                #body += " specified by " + clean_text(dt.findNext("dd"))          
                pass
            elif dt.text == "Returns:":
                ret = clean_text(dt.findNext("dd"))
                
            elif dt.text == "Type Parameters:":
                if i < len(dt_idxs) - 1:
                    next_dt_idx = dt_idxs[i + 1]
                else:
                    next_dt_idx = math.inf
                for dd_idx in dd_idxs:
                    if dd_idx > dt_idx and dd_idx < next_dt_idx:
                        name, _, desc = dl.contents[dd_idx].getText().partition(" - ")
                        tparams[name] = clean_text(desc)                    
                
            elif dt.text == "Parameters:":
                if i < len(dt_idxs) - 1:
                    next_dt_idx = dt_idxs[i + 1]
                else:
                    next_dt_idx = math.inf
                for dd_idx in dd_idxs:
                    if dd_idx > dt_idx and dd_idx < next_dt_idx:
                        name, _, desc = dl.contents[dd_idx].getText().partition(" - ")
                        params[name] = clean_text(desc)
            
            elif dt.text == "Throws:":
                if i < len(dt_idxs) - 1:
                    next_dt_idx = dt_idxs[i + 1]
                else:
                    next_dt_idx = math.inf
                for dd_idx in dd_idxs:
                    if dd_idx > dt_idx and dd_idx < next_dt_idx:
                        name, _, desc = dl.contents[dd_idx].getText().partition(" - ")
                        throws[name] = clean_text(desc)
                        
    return {
        "comment": body,
        "snippets": snippets,
        "fragment": fragment,
        "typeparams": tparams,
        "params": params,
        "returns": ret,
        "throws": throws,
    }

def get_processed_method_decl(decl, is_interface):
    for mod in MODIFIERS:
        decl = decl.replace(mod + " ", "")
    return decl.strip()
    

def clean_text(s):
    if isinstance(s, element.Tag):
        s = s.getText()
    
    if s is None:
        return ""
    else:
        s = s.replace(u"\xa0", " ")
        s = re.sub(r"\n{2,}", "", s)
        s = re.sub(r" *\n +", " ", s)
        s = re.sub(r" {2,}", " ", s)
        s = s.replace("\n", " ")
        return bytes(s, 'utf-8').decode('utf-8', 'ignore') 

def extract_qualified_class_name(html):
    type_tree = html.body.find("span", {"class": "typeNameLabel"})

    package = html.body.find("div", { "class": "header"}).find_all("div", { "class": "subTitle"})[-1].text
    return package + '.' + type_tree.text.replace('.', '$')

def parse_class_html_doc_file(path):
    try: 
        with open(path, "r", encoding="utf8") as f:
            html = BeautifulSoup(f.read(), "html.parser")

        return extract_class_html_doc(html)
                        
    except (TypeError, KeyError, AttributeError) as e:
        print(path, traceback.format_exc())
    except Exception as ee:
        print("#####", path, traceback.format_exc())

def extract_class_html_doc(html):
    if not html or not html.body:
        return

    title_tree = html.body.find("h2", {"class": "title"})
    if title_tree and title_tree.has_attr("title"):
#             title = title_tree["title"].lower()
        title = title_tree["title"]
        type_tree = html.body.find("span", {"class": "typeNameLabel"})
        if type_tree:
            class_implements = extract_class_all_implemented_interface(type_tree.parent)
            decl = type_tree.parent.contents

            if decl:
                modifier_and_type = type_tree.previous_sibling

                if "public" in modifier_and_type:
                    doc = {}
                    content = html.body.find("div", {"class": "contentContainer"})
                    
                    """
                    inheritance = content.find("ul", {"class": "inheritance"})
                    classQualifiedName = inheritance.findAll("li")[-1].contents[0]
                    className = re.sub("<.*>", "", re.sub("Class ", "", title))  # we need this for inner classes
                    classQualifiedName = classQualifiedName.replace(className, className.replace('.', '$'))
#                         print(className)
#                         print(classQualifiedName)
#                         print()  
                    """
                    package = html.body.find("div", { "class": "subTitle"}).text
                    doc["class"] = package + '.' + type_tree.text.replace('.', '$')

                    is_interface = "interface" in modifier_and_type
                    is_class = "class" in modifier_and_type
                    is_enum = "enum" in modifier_and_type

                    doc["class_type"] = "class" if is_class else ("interface" if is_interface else "enum")
                    
                    description = content.find("div", {"class": "description"})
                    classTypeParams = extract_class_typeParams(description)
                    doc["typeparams"] = classTypeParams
                    
                    classDeclaration = extract_class_extends_implements_from_declaration(decl)
                    if classDeclaration:  # makes sure class is public and concrete
                        doc.update(classDeclaration)
                    else:
                        return

                    doc.update({"implements": list(set(doc["implements"]).union(class_implements))})
                    
                    classDoc = description.find("div", {"class": "block"})
                    if classDoc:
                        classDoc = clean_text(classDoc)
                        doc["comment"] = classDoc

        
                    details = content.find("div", {"class": "details"})
                    
                    if details:
                        constructors_tree = details.find("a", {"name": "constructor.detail"})
                        if constructors_tree:
                            constructors = constructors_tree.parent.findAll("li")
                            constructors = extract_public_or_interface_methods_info(constructors, is_interface)
                        
                            if constructors:
#                                     for constructor, d in constructors.items():
#                                         try:
#                                         processed_doc = ConstructorDoc(constructor, d["comment"], d["params"], d["typeparams"], d["throws"])
#                                         d["processed"] = processed_doc.get_txt()
#                                         except IndexError as e:
#                                             print(path, traceback.format_exc())
                                doc["constructors"] = constructors
                        
                        methods_tree = details.find("a", {"name": "method.detail"})
                        if methods_tree:
                            methods = methods_tree.parent.findAll("li")
                            methods = extract_public_or_interface_methods_info(methods, is_interface)
                        
                            if methods:
#                                     for method, d in methods.items():
#                                         try:
#                                         processed_doc = MethodDoc(method, d["comment"], d["params"], d["typeparams"], d["throws"], d["returns"])
#                                         d["processed"] = processed_doc.get_txt()
#                                         except IndexError as e:
#                                             print(path, traceback.format_exc())
                                doc["methods"] = methods
                    
                        if doc.get("constructors") or doc.get("methods"):                          
                            return doc
                    


def parse_html_doc_dir(path):
    if os.path.exists(path):
        docs = {}
        for dirName, subDirList, fileList in os.walk(path):
            for f in fileList:
                if f.endswith("html"):
                    doc = parse_class_html_doc_file("{}/{}".format(dirName, f))

                    if doc:
                        # Remove the class entry from the dict as it becomes the name anyway
                        class_name = doc["class"]
                        del doc["class"]

                        docs[class_name] = doc
                    
        return docs

def build_bytecode_signature(docs):
    test_methods = []
    for cl in docs:
        clName = re.sub(r"<.*>", '', cl["class"])
        if "constructors" in cl:
            for constructor, doc in cl["constructors"].items():
                stripped_decl = strip_parametrized_types_from_decl(constructor, doc["typeparams"], cl["typeparams"])
                stripped_decl = stripped_decl.split("(")[1]
#                 if not doc["typeparams"] and not cl["typeparams"]: # not typeparams
                test_methods.append(clName + "(" + stripped_decl)
#                 else:
#                     pass
                
        if "methods" in cl:         
            for method, doc in cl["methods"].items():
                stripped_decl = strip_parametrized_types_from_decl(method, doc["typeparams"], cl["typeparams"])
#                 if not doc["typeparams"] and not cl["typeparams"]: # not typeparams
                test_methods.append(clName + "." + stripped_decl)
#                 else:
#                     pass
    
    return test_methods

                
def strip_parametrized_types_from_decl(decl, mth_tparams={}, cl_tparams={}):
    name, _, params = decl.partition('(')
    params = params[:-1]
    ret = name + '('

    for p in custom_comma_split(params):
        stripped_name = re.sub("\.\.\.", "[]", re.sub("<.*>", "", p))
        qualified_name, dot, simple_name = stripped_name.rpartition('.')
        resolved_name = guess_typebound(simple_name, mth_tparams.keys(), cl_tparams.keys())
#         if resolved_name == "java.lang.Object" or resolved_name == "java.lang.Object[]":
        if "java.lang" in resolved_name:
            _p = resolved_name
        else:    
            _p = qualified_name + dot + resolved_name
        ret += re.sub("\.\.\.", "[]", re.sub("<.*>", "", _p)) + ","
    ret = ret[:-1] + ')'

    return ret 


def guess_typebound(t, mth_tparams, cl_tparams):
    isArrayOfArrays = False
    isArray = False
    
    if "[][]" in t:
        isArrayOfArrays = True
        t = t.replace("[][]", "")
    elif "[]" in t:
        isArray = True
        t = t.replace("[]", "")
        
    t_bound = None
    for tp in mth_tparams:
        if t == tp.split(' ')[0]:
            if 'extends' in tp:
                t_bound = tp.split(" extends ")[1]
            else:
                t_bound = "java.lang.Object"
            break
    # search in class type params
    if not t_bound:
        for tp in cl_tparams:
            if t == tp.split(' ')[0]:
                if 'extends' in tp:
                    t_bound = tp.split(" extends ")[1]
                else:
                    t_bound = "java.lang.Object"
                break
    
    if t_bound:
        if len(t_bound) == 1:  # heuristic
            ret = "java.lang.Object"
        else:
            ret = t_bound
    elif len(t) == 1:  # heuristic
        ret = "java.lang.Object"
    else:
        ret = t
    
    if isArrayOfArrays:
        return ret + "[][]"
    elif isArray:
        return ret + "[]"
    else:
        return ret

  
def generate_artifact_doc(art):

#     cp_arg = []
#     if art.cp:
#         cp_arg = ["-cp", art.cp]
#     
#     with subprocess.Popen(["javadoc",
#                            "-encoding", "UTF-8",
#                            "-public"] + cp_arg + [
#                            "-sourcepath", art.getArtifactSourcePath(),
#                            "-subpackages", art.package,
#                            "-d", art.getArtifactDocPath(),
#                            "-nosince", "-nodeprecatedlist", "-notree", "-noindex", "-nohelp"                  
#                            ],
#                           stdout=subprocess.PIPE, stderr=subprocess.PIPE, universal_newlines=True) as jdoc_process:
#         try:
#             _, err = jdoc_process.communicate(timeout=JAVADOC_TIMEOUT)
#             print(jdoc_process.args)
#             print("\njavadoc process for artifacct {} returns has exit code {} with stderr being\n{}."
#                   .format(art.getArtifact(), jdoc_process.returncode, err))

    docs = parse_html_doc_dir(art.getArtifactDocPath())
    if docs:
        docs_file_name = "{}/{}-doc.json".format(MAVEN_DOCS_JSON, art.artifact.replace(':', '#'))
        with codecs.open(docs_file_name, "w", encoding="utf-8") as fh:
            json.dump(docs, fh, indent=1, ensure_ascii=False)
        
        methods = build_bytecode_signature(docs)
        if methods:
            methods_file_name = "{}/{}-methods.txt".format(MAVEN_DOCS_JSON, art.artifact.replace(':', '#'))
            with open(methods_file_name, "w") as fh:
                for m in methods:
                    fh.write(m + "\n")
                        
#         except TimeoutExpired as e:
#             print("Killing javadoc for artifact {} for exceeding timeout of {} seconds.".format(art.getArtifact(), JAVADOC_TIMEOUT))
#             jdoc_process.kill()

def scrape_javadoc_from_path(doc_path):#
    docs = parse_html_doc_dir(doc_path)

    if not docs:
        return None

    return docs

def scrape_class_html_doc(path):
    doc = parse_class_html_doc_file(path)

    if doc:
        # Remove the class entry from the dict as it becomes the name anyway
        del doc["class"]

        return doc


def main():
    docs, methods = scrape_javadoc_from_path('data/maven-artifacts-with-cp')

    docs_file_name = "{}/{}-doc.json".format(MAVEN_DOCS_JSON, 'test')
    with codecs.open(docs_file_name, "w", encoding="utf-8") as fh:
        json.dump(docs, fh, indent=1, ensure_ascii=False)
    
    if methods:
        methods_file_name = "{}/{}-methods.txt".format(MAVEN_DOCS_JSON, 'test')
        with open(methods_file_name, "w") as fh:
            for m in methods:
                fh.write(m + "\n")

def main3():

    if os.path.exists(MAVEN_DOCS_JSON):
        shutil.rmtree(MAVEN_DOCS_JSON)
    os.makedirs(MAVEN_DOCS_JSON)

    artifacts = []
    
    for f in os.listdir(MAVEN_ART_WITH_CP):
        with open(os.path.join(MAVEN_ART_WITH_CP, f), "r") as fh:
            for l in fh:
                try:
#                     l = l.partition(':')[2].replace('\n', '') # l has file path in it, so strip it; also remove \n char
                    #artifact = ArtifactInfo(l, MAVEN_REPOS)
                    artifacts.append(artifact)
                except Exception  as e:
                    print("Failed parsing artifact {} with error:\n{}".format(l.partition(';')[0], e))
    random.shuffle(artifacts)
    
    Parallel(n_jobs=CORES)(delayed(generate_artifact_doc) (art) for art in artifacts if os.path.exists(art.getArtifactSourcePath()))

  
def main2():
    print(json.dumps(parse_html_doc_dir(sys.argv[1]), indent=1))


if __name__ == '__main__':
    methods = parse_class_html_doc_file('./test_data/maven-artifacts-with-cp/com/google/common/collect/ForwardingMultimap.html')['methods']
    print(methods.keys())
    

    
