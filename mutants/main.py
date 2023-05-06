import os
import re
import glob
import openai
import logging
import numpy as np
import pandas as pd
from tqdm import tqdm
from scipy.stats import mode
from krippendorff import alpha
from process import OpenAIProcessor
from sklearn.metrics.pairwise import linear_kernel
from sklearn.feature_extraction.text import TfidfVectorizer

logging.basicConfig(filename='mutants.log', encoding='utf-8', level=logging.DEBUG)

tqdm.pandas()

openai.api_key_path = '../.openai_key'


# Utility functions

def get_line(javafile_path, line):
    with open(javafile_path, 'r') as f:
        line_source = f.readlines()
        
    code_snippet = line_source[int(line) - 1]
    
    return code_snippet.strip()


def does_mutation_compile(file, line, original, replacement):
    cp_jars = glob.glob('./artifacts/**/*.jar', recursive=True)
    class_path = ':'.join(cp_jars)

    with open(file, 'r') as f:
        source = f.read()
        
    lines = source.split('\n')
    
    relevant_line_idx = line - 1
    
    if replacement == '<NO-OP>':
        del lines[relevant_line_idx]
    else:
        lines[relevant_line_idx] = lines[relevant_line_idx].replace(original, replacement)
    
    import tempfile
    with tempfile.TemporaryDirectory() as temp_dir:
        mutated_path = os.path.join(temp_dir, os.path.basename(file))
    
        with open(mutated_path, 'w') as f:
            f.write('\n'.join(lines))
        
        return os.system(f'javac -cp {class_path} -source 8 -target 8 {mutated_path} > /dev/null 2>&1') == 0

def get_decompiled_signature(file, line, original, replacement):
    cp_jars = glob.glob('./artifacts/**/*.jar', recursive=True)
    class_path = ':'.join(cp_jars)

    with open(file, 'r') as f:
        source = f.read()
        
    lines = source.split('\n')
    
    relevant_line_idx = line - 1
    
    if replacement == '<NO-OP>':
        del lines[relevant_line_idx]
    else:
        lines[relevant_line_idx] = lines[relevant_line_idx].replace(original, replacement)
    
    import tempfile
    with tempfile.TemporaryDirectory() as temp_dir:
        mutated_path = os.path.join(temp_dir, os.path.basename(file))
    
        with open(mutated_path, 'w') as f:
            f.write('\n'.join(lines))
        
        os.system(f'javac -cp {class_path} -source 8 -target 8 {mutated_path} > /dev/null 2>&1')

        import subprocess
        
        compiled_path = mutated_path.replace('.java', '.class')
        try:
            decompiled_source = subprocess.check_output(f'java -jar artifacts/procyon.jar {compiled_path}', shell=True, stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as ex:
            return None
        
        import hashlib
        
        return hashlib.md5(decompiled_source).hexdigest()


def minimal_string_difference(str1, str2):
    while len(str1) > 0 and len(str2) > 0 and str1[0] == str2[0]:
        str1 = str1[1:]
        str2 = str2[1:]
        
    while len(str1) > 0 and len(str2) > 0 and str1[-1] == str2[-1]:
        str1 = str1[:-1]
        str2 = str2[:-1]
    
    return str1, str2


def is_literal(s):
    # Integer (decimal, octal, hexadecimal, binary)
    integer = r"^[-+]?(0|[1-9][0-9]*|0[0-7]*|0x[a-fA-F0-9]+|0b[01]+)(l|L)?$"
    # Floating point (float, double)
    floating = r"^[-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)?[fFdD]?$"
    # Boolean
    boolean = r"^(true|false)$"
    # String
    string = r'^"([^"\\]|\\.)*"$'
    # Char
    char = r"^'([^'\\]|\\.)'$"
    patterns = [integer, floating, boolean, string, char]
    
    for pattern in patterns:
        if re.match(pattern, s):
            return True
    return False


def is_variable(s):
    java_keywords = {
        'abstract', 'assert', 'boolean', 'break', 'byte', 'case', 'catch', 'char', 'class', 'const',
        'continue', 'default', 'do', 'double', 'else', 'enum', 'extends', 'final', 'finally', 'float',
        'for', 'goto', 'if', 'implements', 'import', 'instanceof', 'int', 'interface', 'long', 'native',
        'new', 'package', 'private', 'protected', 'public', 'return', 'short', 'static', 'strictfp', 'super',
        'switch', 'synchronized', 'this', 'throw', 'throws', 'transient', 'try', 'void', 'volatile', 'while',
    }
    pattern = r'^[a-zA-Z_$][a-zA-Z\d_$]*$'
    return bool(re.match(pattern, s)) and s not in java_keywords and not is_literal(s)

    
def is_operator(code_string):
    return code_string in ['+', '-', '*', '/', '%', '^', '|', '&', '~', '||', '&&', '!', '==', '!=', '>=', '<=', '>', '<', '>>', '>>>', '<<', '<<<', '+=', '*=', '/=', '%=', '=']

def is_noop(code_string):
    return code_string == '<NO-OP>'

def get_mutation_type(original, replacement):
    min_orig, min_repl = minimal_string_difference(original, replacement)

    is_sd = is_noop(replacement)
    is_or = is_operator(min_orig) and is_operator(min_repl)
    is_lr = is_literal(min_repl) or is_literal(replacement)

    
    if is_sd:
        mutant_type = 'SD'
    elif is_or:
        mutant_type = 'OR'
    elif is_lr:
        mutant_type = 'VR'
    else:
        mutant_type = 'UNKNOWN'

    # Manually fix some edge cases that slip the cracks
    if min_orig == 'tru' and min_repl == 'fals' or min_orig == 'fals' and min_repl == 'tru':
        mutant_type = 'VR'

    if min_orig.strip() == '!' and min_repl == '' or min_orig == '' and min_repl.strip() == '!':
        mutant_type = 'OR'

    if min_orig.strip() == '=' and min_repl == '' or min_orig == '' and min_repl.strip() == '=':
        mutant_type = 'OR'

    return mutant_type


# Mutation processors (this is where the llm is called)

class MutationProcessor(OpenAIProcessor):

    def __init__(self, base_prompt, **kwargs):
        self.base_prompt = base_prompt
        super().__init__(**kwargs)

    def preprocess(self, slot):
        if callable(self.base_prompt):
            prompt = self.base_prompt(slot.prompt_input, slot)
        else:
            prompt = self.base_prompt

        return slot, prompt.format(slot.prompt_input)

    def process_many(self, xs):
        slots, prompts = zip(*xs)

        completions = super().process_many(prompts)

        return zip(slots, completions)

    def postprocess(self, x):
        slot, completion = x
        try:
            original, replacement = completion.strip().split('\n')
        except:
            original, replacement = '<FAILED>', '<FAILED>'

        original, replacement = original.strip(), replacement.strip()


        compiles = does_mutation_compile(slot.file, int(slot.line), original, replacement)

        signature = None if not compiles else get_decompiled_signature(slot.file, int(slot.line), original, replacement)

        return {
            'file': slot.file,
            'line': slot.line,
            'original': original,
            'replacement': replacement,
            'compiles': compiles,
            'modifies': original in get_line(slot.file, slot.line) and original != replacement,
            'type': get_mutation_type(original, replacement),
            'signature': signature
        }


# Prompt construction

def construct_prompt(inputs, outputs, prefix=''):
    prompt = prefix
    for i, o in zip(inputs, outputs):
        prompt += f'Input:\n{i}\nOutput:\n{o}\n\n'

    prompt += 'Input:\n{}\nOutput:'

    return prompt

def construct_similarity_prompt(input_pool, output_pool, k=3, **kwargs):
    vectorizer = TfidfVectorizer()
    example_tfidf = vectorizer.fit_transform(input_pool)

    def prompt(input, slot):
        input_tfidf = vectorizer.transform([input])

        similarities = linear_kernel(input_tfidf, example_tfidf).flatten()
        top_idx = similarities.argsort()[-k:]

        similar_inputs, similar_outputs = zip(*[(input_pool[i], output_pool[i]) for i in top_idx])

        return construct_prompt(similar_inputs, similar_outputs, **kwargs)

    return prompt

def construct_other_project_prompt(input_pool, output_pool, projects_of_origin, k=3, **kwargs):

    def prompt(input, slot):
        project = slot.project_name

        different_project_inputs, different_project_outputs = [], []
        for i, o, p in zip(input_pool, output_pool, projects_of_origin):
            if p == project:
                continue

            different_project_inputs.append(i)
            different_project_outputs.append(o)

            if len(different_project_inputs) >= k:
                break

        return construct_prompt(different_project_inputs, different_project_outputs, **kwargs)

    return prompt

def construct_similarity_other_project_prompt(input_pool, output_pool, projects_of_origin, k=3, **kwargs):
    vectorizer = TfidfVectorizer()
    example_tfidf = vectorizer.fit_transform(input_pool)

    def prompt(input, slot):
        input_tfidf = vectorizer.transform([input])

        similarities = linear_kernel(input_tfidf, example_tfidf).flatten()
        top_idx = similarities.argsort()[::-1]

        similar_inputs, similar_outputs, similar_projects = zip(*[(input_pool[i], output_pool[i], projects_of_origin[i]) for i in top_idx])

        different_project_inputs, different_project_outputs = [], []
        for i, o, p in zip(similar_inputs, similar_outputs, similar_projects):
            project = slot.project_name
            if p == project:
                continue

            different_project_inputs.append(i)
            different_project_outputs.append(o)

            if len(different_project_inputs) >= k:
                break


        return construct_prompt(different_project_inputs, different_project_outputs, **kwargs)

    return prompt


# Results generation

def generate_results(slots, prompt='', **kwargs):
    mutation_processor = MutationProcessor(
        prompt, 
        max_process_n=20,
        max_prepostprocess_n=20,
        parallel_postprocessing=True,
        **kwargs
    )

    results = mutation_processor.run_many([slot for _, slot in slots.iterrows()], show_progress=True)

    return pd.DataFrame(results)

def usable_percentage(results):
    return results[results.compiles & results.modifies].drop_duplicates().shape[0] / results.shape[0]

def usable_total(results):
    return results[results.compiles & results.modifies].drop_duplicates().shape[0]

def distinct_replacement_percentage(results, filter_usable=True):
    if filter_usable:
        results = results[results.compiles & results.modifies].drop_duplicates()

    min_replacements = results.apply(lambda x: minimal_string_difference(x.original, x.replacement)[1], axis=1)

    return min_replacements.drop_duplicates().shape[0] / results.replacement.shape[0]



# Bug data specific util functions

def get_added_lines(git_patch):
    lines = []
    for line in git_patch.split('\n'):
        if line.startswith('+') and not line.startswith('+++'):
            lines.append(line[1:])

    return lines

def get_fixed_lines(git_patch, fix_snippet):
    added_lines = get_added_lines(git_patch)

    fixed_lines = []
    for line in added_lines:
        if fix_snippet in line:
            fixed_lines.append(line)

    return fixed_lines



# Loading the data

bugs = pd.read_json('./data/bug_dataset')
major_result = pd.read_json('./results/all_major.json')
major_result['file'] = major_result['file'].apply(lambda x: x.replace('\\', '/'))

## Enrich the major results and bugs data with coherent project data
PACKAGE_TO_PROJECT = {
    'java': 'JDK',
    'sun': 'JDK',
    'com.sun': 'JDK',
    'cern': 'Colt',
    'hep': 'Colt',
    'com.google.common': 'Guava',
    'com.google.gwt': 'GWT',
    'com.google.web': 'GWT',
    'org.graphstream': 'GraphStream',
    'org.apache.commons': 'CommonsMath',
    'org.hibernate': 'Hibernate',
    'org.elasticsearch': 'Elasticsearch',
    'weka': 'Weka'
}

# Only Guava is in both
BUGS_PROJECT_TO_OUR_FORMAT = {
    'google.guava': 'Guava',
}


def get_mutation_package(mutation):
    with open(mutation.file, 'r') as f:
        source = f.read()

    match = re.search('package (.+?);', source)

    if not match:
        return None

    package = match.group(1)

    return package

def package_to_project(package):
    for package_prefix, project in PACKAGE_TO_PROJECT.items():
        if package.startswith(package_prefix):
            return project

    return None

major_result['project_package'] = major_result.apply(get_mutation_package, axis=1)
major_result['project_name'] = major_result.project_package.apply(package_to_project)
bugs['project_name'] = bugs.apply(lambda row: BUGS_PROJECT_TO_OUR_FORMAT.get(row.projectName, row.projectName), axis=1)



# Running the experiments


# Use either this to use the bug dataset as an example pool
example_pool = bugs
fixed_lines = example_pool.apply(lambda row: get_fixed_lines(row.fixPatch, row.sourceAfterFix), axis=1)
example_pool = example_pool[fixed_lines.apply(len) == 1]
example_pool['fixed_line'] = fixed_lines[fixed_lines.apply(len) == 1].apply(lambda x: x[0].strip())
example_pool['prompt_input'] = example_pool.apply(lambda row: row.fixed_line.replace('{', '{{').replace('}', '}}'), axis=1)
example_pool['prompt_output'] = example_pool.apply(lambda row: (row.sourceAfterFix + '\n' + row.sourceBeforeFix).replace('{', '{{').replace('}', '}}'), axis=1)
example_pool.index = range(len(example_pool))

# Or this to use the major mutants
"""
example_pool = major_result
example_pool['file'] = example_pool['file'].apply(lambda x: x.replace('\\', '/'))
example_pool['prompt_input'] = example_pool.apply(lambda row: get_line(row.file, row.line).replace('{', '{{').replace('}', '}}') , axis=1)
example_pool['prompt_output'] = example_pool.apply(lambda row: (row.original + '\n' + row.replacement).replace('{', '{{').replace('}', '}}'), axis=1)
"""


similarity_pool = example_pool.sample(64, random_state=0)
similarity_pool.index = range(len(similarity_pool))


slots = major_result
slots['prompt_input'] = slots.apply(lambda row: get_line(row.file, row.line).replace('{', '{{').replace('}', '}}') , axis=1)


def run_experiment(prompt_type='other_project', prompt_params={}, model_params={}, random_state=0, save_path=None):
    if prompt_type == 'other_project':
        prompt = construct_other_project_prompt(
            example_pool.sample(frac=1, random_state=random_state).prompt_input,
            example_pool.sample(frac=1, random_state=random_state).prompt_output,
            example_pool.sample(frac=1, random_state=random_state).project_name,
            **prompt_params
        )
    elif prompt_type == 'similarity':
        prompt = construct_similarity_prompt(
            similarity_pool.prompt_input,
            similarity_pool.prompt_output,
            **prompt_params
        )
    elif prompt_type == 'similarity_other_project':
        prompt = construct_similarity_other_project_prompt(
            similarity_pool.prompt_input,
            similarity_pool.prompt_output,
            similarity_pool.project_name,
            **prompt_params
        )
    elif prompt_type == 'similarity_other_project_all_examples':
        prompt = construct_similarity_other_project_prompt(
            example_pool.prompt_input,
            example_pool.prompt_output,
            example_pool.project_name,
            **prompt_params
        )
    elif prompt_type == 'regular':
        prompt = construct_prompt(
            example_pool.sample(frac=1, random_state=random_state).iloc[:prompt_params['k']].prompt_input,
            example_pool.sample(frac=1, random_state=random_state).iloc[:prompt_params['k']].prompt_output
        )
    else:
        raise ValueError(f'Unknown prompt type {prompt_type}')

    try:
        results = generate_results(slots, prompt=prompt, **model_params)
    except:
        return run_experiment(prompt_type=prompt_type, prompt_params=prompt_params, model_params=model_params, random_state=random_state, save_path=save_path)

    if save_path:
        results.to_csv(save_path, index=False)

    return results

# Naive run
results_naive = run_experiment(prompt_type='other_project', prompt_params={'k': 1}, model_params={'model': 'code-davinci-002', 'temperature': 0}, save_path='results/results_naive.csv')

# Default run
results_default = run_experiment(prompt_type='other_project', prompt_params={'k': 8}, model_params={'model': 'code-davinci-002', 'temperature': 1}, save_path='results/results_default.csv')

# Vary length
results_length = [
    run_experiment(prompt_type='other_project', prompt_params={'k': 2**k}, model_params={'model': 'code-davinci-002', 'temperature': 1}, save_path=f'results/results_length_{2**k}.csv')
    for k in range(1, 6)
]

# Vary NL description
results_nl_desc = run_experiment(
    prompt_type='other_project',
    prompt_params={'k': 8, 'prefix': 'Mutate the following snippets of code:\n\n'},
    model_params={'model': 'code-davinci-002', 'temperature': 1},
    save_path='results/results_nl_desc.csv'
)

# Vary model size
results_cushman = run_experiment(
    prompt_type='other_project',
    prompt_params={'k': 8},
    model_params={'model': 'code-cushman-001', 'temperature': 1},
    save_path='results/results_cushman.csv'
)

# Vary temperature
results_temp = [
    run_experiment(prompt_type='other_project', prompt_params={'k': 8}, model_params={'model': 'code-davinci-002', 'temperature': t}, save_path=f'results/results_temp_{t}.csv')
    for t in [i / 10 for i in range(0, 11)]
]

# Vary example selection

## Most similar
results_sim = run_experiment(prompt_type='similarity', prompt_params={'k': 8}, model_params={'model': 'code-davinci-002', 'temperature': 1}, save_path='results/results_sim.csv')  

results_sim_op = run_experiment(prompt_type='similarity_other_project', prompt_params={'k': 8}, model_params={'model': 'code-davinci-002', 'temperature': 1}, save_path='results/results_sim_op.csv')

results_sim_op_ae = run_experiment(prompt_type='similarity_other_project_all_examples', prompt_params={'k': 8}, model_params={'model': 'code-davinci-002', 'temperature': 1}, save_path='results/results_sim_op_ae.csv')

## Random from other project
results_op = [
    run_experiment(prompt_type='other_project', prompt_params={'k': 8}, model_params={'model': 'code-davinci-002', 'temperature': 1}, random_state=i, save_path=f'results/results_op_{i}.csv')
    for i in range(30)
]

def print_results():
    print('RQ3 Results\n')
    for k, res in zip(range(1, 6), results_length):
        print(f'Length n={2**k}:', usable_total(res))

    print('Similarity-based:', usable_total(results_sim_op))

    print('With NL desc:', usable_total(results_nl_desc))

    print('\n\n')

    print('RQ4 Results\n')

    print('Small model:', usable_total(results_cushman))

    print('Large model:', usable_total(results_default))

    print('\n\n')

    print('RQ5 Results\n')

    for t, res in zip([i / 10 for i in range(0, 10)], results_temp):
        print(f'Temp {t}:', usable_total(res))

    print('Temp mix: none')

print_results()


# Investigate a sample of mutants that are usable (check how many are equivalent)

## Creating the annotation entries

### Size chosen based on: https://www.calculator.net/sample-size-calculator.html?type=1&cl=90&ci=10&pp=50&ps=1212&x=63&y=25
usable_sample = results_default.drop_duplicates()[results_default.drop_duplicates().compiles & results_default.drop_duplicates().modifies].sample(65, random_state=0)

def create_annotation_entry(mutant):
    with open(mutant.file, 'r') as f:
        source = f.read()

    lines = source.split('\n')

    relevant_line = lines[mutant.line - 1]

    return {
        'Mutation': relevant_line.strip() + '\nMUTATES INTO\n' + relevant_line.replace(mutant.original, mutant.replacement).strip(),
        'Modifies': '',
        'Does not modify': '',
        'Unsure': ''
    }

annotation_entries = pd.DataFrame([create_annotation_entry(mutant) for _, mutant in usable_sample.iterrows()])
annotation_entries.to_excel('data/survey/mutants_to_annotate.xlsx', index=False)

## Calculating the annotation results
def load_annotations(annotations_path):
    x = pd.read_excel(annotations_path)
    x = x.set_axis(['mutation', 'changes', 'doesnt_change', 'unsure'], axis=1)
    
    x.changes[~x.changes.isna()] = 'changes'
    x.doesnt_change[~x.doesnt_change.isna()] = 'doesnt_change'
    x.unsure[~x.unsure.isna()] = 'unsure'
    
    x['label'] = x.changes.combine_first(x.doesnt_change).combine_first(x.unsure)
    
    x = x.drop(['changes', 'doesnt_change', 'unsure'], axis=1)
    
    return x

annotations_pb = load_annotations('data/survey/mutants_to_annotate_PB.xlsx').iloc[:65]
annotations_mp = load_annotations('data/survey/mutants_to_annotate_MP.xlsx').iloc[:65]
annotations_bs = load_annotations('data/survey/mutants_to_annotate_BS.xlsx').iloc[:65]

combined_annotation_labels = pd.DataFrame([annotations_pb.label, annotations_mp.label, annotations_bs.label])

alpha(combined_annotation_labels.replace('changes', 1).replace('unsure', np.nan).replace('doesnt_change', 2).to_numpy())

majority_vote = combined_annotation_labels.apply(lambda x: mode(x)[0][0], axis=0)
majority_vote.value_counts() / len(majority_vote)




# Inspecting non-compiling mutants

## https://www.calculator.net/sample-size-calculator.html?type=1&cl=90&ci=10&pp=50&ps=872&x=73&y=19 <= 65 so just sample using that to for some consistency
non_compiling_sample = results_default.drop_duplicates()[~results_default.drop_duplicates().compiles].sample(65, random_state=0)

def get_compilation_error(file, line, original, replacement):
    cp_jars = glob.glob('./artifacts/**/*.jar', recursive=True)
    class_path = ':'.join(cp_jars)

    with open(file, 'r') as f:
        source = f.read()
        
    lines = source.split('\n')
    
    relevant_line_idx = line - 1
    
    if replacement == '<NO-OP>':
        del lines[relevant_line_idx]
    else:
        lines[relevant_line_idx] = lines[relevant_line_idx].replace(original, replacement)
    
    import tempfile
    with tempfile.TemporaryDirectory() as temp_dir:
        mutated_path = os.path.join(temp_dir, os.path.basename(file))
    
        with open(mutated_path, 'w') as f:
            f.write('\n'.join(lines))
        
        import subprocess
        try:
            subprocess.check_output(['javac', mutated_path, '-cp', class_path, '-source', '8', '-target', '8'], stderr=subprocess.STDOUT)
        except subprocess.CalledProcessError as e:
            return e.output.decode('utf-8')


def determine_javac_error_reason(error_message):
    error_patterns = [
        (r"(syntax error|((';')|('\)')|(:)) expected|illegal start of expression|unexpected type.+required:.+variable.+found:.+value|not a statement)", 'syntax error', re.MULTILINE | re.DOTALL),
        (r'variable.+might not have been initialized.+(.+) = \1;', 'syntax error', re.MULTILINE | re.DOTALL),
        (r'cannot find symbol', 'non-existing variable'),
        (r'class not found', 'class not found'),
        (r'unhandled exception', 'unhandled exception'),
        (r'incompatible types|(constructor .+ cannot be applied to given types|no suitable constructor found)', 'incompatible arg type'),
        (r'bad operand type', 'bad operand types for operators'),
        (r'cannot be dereferenced', 'calling method on primitive')
    ]

    for pattern, reason, *flags in error_patterns:
        if re.search(pattern, error_message, *(flags or [re.IGNORECASE])):
            return reason

    return 'unknown error'

errors = non_compiling_sample.apply(lambda x: get_compilation_error(x.file, x.line, x.original, x.replacement), axis=1)
error_types = errors.apply(determine_javac_error_reason)
error_types.value_counts() / len(error_types)