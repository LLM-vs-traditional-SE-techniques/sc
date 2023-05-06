import os
import subprocess
import pandas as pd
from TestParser import TestParser

def parse_test_cases(parser, test_file):
	"""
	Parse source file and extracts test cases
	"""
	parsed_classes = parser.parse_file(test_file)

	test_cases = list()

	for parsed_class in parsed_classes:
		for method in parsed_class['methods']:
			if 'test' in method['identifier'].lower():
				abstract_method = method['body']
				for var in method['var_names']:
					abstract_method = abstract_method.replace(f" {var} ", " var ")
					abstract_method = abstract_method.replace(f"{var}.", "var.")  
					abstract_method = abstract_method.replace(f"{var},", "var,")  

				for type in method['var_types']:
					splited_type = type.split('.')
					if len(splited_type) > 1:
						abstract_method = abstract_method.replace(type, splited_type[-1])
                                                
				abstract_method = ''.join(abstract_method.split('\n')[2:-1])
                                                          
				test_cases.append(abstract_method)
	
	return test_cases

grammar_file = './java-grammar.so'
language = 'java'
parser = TestParser(grammar_file, language)

path = "../../generate-tests/CodeX/generated-tests/number_of_examples_variation/"

directory_contents = os.listdir(path)

model_test_cases = []
test_cases_files = []
projects = []

root_path = os.getcwd()

for item in directory_contents:
    path_ = path + item
    directory_contents_ = os.listdir(path_)

    for item_ in directory_contents_:
        path__ = path_ + '/'+ item_
        directory_contents__ = os.listdir(path__)

        for item__ in directory_contents__:
            if item__ == "8_examples":
                path___ = path__ + '/'+ item__
                directory_contents___ = os.listdir(path___)

                for item___ in directory_contents___:

                    if item___ == "compilable":
                        path____ = path___ + '/'+ item___

                        os.chdir(path____)

                        output = subprocess.check_output(r'find . -type f -name "*Test*.java"', shell=True)
                        test_files = output.decode('ascii').splitlines()

                        for test_file in test_files:
                            file_test_cases = parse_test_cases(parser, test_file)
                            model_test_cases.extend(file_test_cases)
                            test_cases_files.extend([test_file] * len(file_test_cases))
                            projects.extend([item] * len(file_test_cases))

    os.chdir(root_path)

model_tests = pd.DataFrame({
	'test': model_test_cases,
	'file': test_cases_files,
	'project': projects
})
model_tests.to_csv(f'./model_tests.csv', index=False)