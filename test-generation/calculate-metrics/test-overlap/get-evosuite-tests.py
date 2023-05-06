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

path = "../../generate-tests/EvoSuite/generated-tests/"

directory_contents = os.listdir(path)

evosuite_test_cases = []
test_cases_files = []
projects = []

root_path = os.getcwd()

for item in directory_contents:	
	if "colt" in item:
		remaining_path = "/cern/colt/matrix/impl"
	elif "elasticsearch" in item:
		remaining_path = "/org/elasticsearch/action/index"
	elif "graphstream" in item:
		remaining_path = "/org/graphstream/graph"
	elif "guava" in item:
		remaining_path = "/com/google/common/hash"
	elif "gwt" in item:
		remaining_path = "/com/google/gwt/core/client"
	elif "hibernate" in item:
		remaining_path = "/org/hibernate/type/descriptor/java"
	elif "jdk" in item:
		remaining_path = "/newjdkname"
	elif "math" in item:
		remaining_path = "/org/apache/commons/math3/geometry/euclidean/oned"
	elif "weka" in item:
		remaining_path = "/weka/core"
		
	path____ = path + item + remaining_path
	
	os.chdir(path____)

	output = subprocess.check_output(r'find . -type f -name "*.java"', shell=True)
	test_files = output.decode('ascii').splitlines()

	for test_file in test_files:
		if 'scaffolding' not in test_file:
			file_test_cases = parse_test_cases(parser, test_file)
			evosuite_test_cases.extend(file_test_cases)
			test_cases_files.extend([test_file] * len(file_test_cases))
			projects.extend([item] * len(file_test_cases))

	os.chdir(root_path)
	
evosuite_tests = pd.DataFrame({
	'test': evosuite_test_cases,
	'file': test_cases_files,
	'project': projects
})
evosuite_tests.to_csv(f'./evosuite_tests.csv', index=False)
    