import util
import os
from pathlib import Path
from box import Box
from parsing.html_javadoc import scrape_javadoc_from_path, parse_class_html_doc_file

class CodeDictionary:
    """
    An interface for Javadoc parsed by the parsing module (from DocRT) and also some source code
    """

    def __init__(self, code_path, lazy = False):
        self.code_path = code_path
        self.lazy = lazy

        if not lazy:
            json = scrape_javadoc_from_path(code_path)
            self.dictionary = Box(json)
        else:
            self.dictionary = Box()

    @property
    def dict(self):
        return self.dictionary

    def find_class(self, name):
        genericless_name = name.split('<')[0]
        raw_entry = self.dictionary.get(name, None)

        if raw_entry is None:
            actual_name = util.find(self.dictionary, lambda n: name == n.split('<')[0])
            raw_entry = self.dictionary.get(actual_name, None)

        # If we can't find it, we can still try to load it
        if self.lazy and raw_entry is None:
                path = genericless_name.replace('.', '/').replace('$', '.') + '.html'
                full_path = os.path.join(self.code_path, path)

                if Path(full_path).exists():
                    raw_entry = parse_class_html_doc_file(full_path)

                    class_name = raw_entry['class']
                    del raw_entry['class']

                    self.dictionary[class_name] = raw_entry

        if raw_entry is None:
            return None

        name_entry = self._create_class_name_entry(name)

        return raw_entry | name_entry

    def find_class_methods(self, class_name):
        cls = self.find_class(class_name)

        if not cls:
            return None

        methods = []
        for method_name in cls.methods:
            methods.append(self.find_method(class_name, method_name))

        return methods

    def find_method(self, class_name, name):
        cls = self.find_class(class_name)

        if not cls:
            return None

        raw_entry = cls.methods.get(name, None)

        if raw_entry is None:
            return None

        name_entry = self._create_method_name_entry(name)
        class_name_entry = {
            'class_name': self._create_class_name_entry(class_name)
        }

        return raw_entry | name_entry | class_name_entry

    def find_source(self, class_name):
        cls = self.find_class(class_name)

        # There is no javadoc for this, but the source might be there
        if cls is None:
            raw_name = class_name.split('<')[0]
        else:
            raw_name = cls.no_generics_name

        path = raw_name.replace('.', '/').split('$')[0] + '.java'
        full_path = os.path.join(self.code_path, path)

        if not Path(full_path).exists():
            return None

        with open(full_path, 'r', encoding='UTF-8') as f:
            return f.read()

    def _create_class_name_entry(self, full_name):
        return Box({
            "name": full_name,
            "no_generics_name": full_name.split('<')[0],
            "base_name": full_name.split('.')[-1]
        })

    def _create_method_name_entry(self, full_name):
        return Box({
            "name": full_name,
            "base_name": full_name.split('(')[0]
        })
