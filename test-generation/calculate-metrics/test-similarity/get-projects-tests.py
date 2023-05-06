import os
import subprocess
import pandas as pd
from TestParser import TestParser
from subprocess import CalledProcessError, STDOUT

def parse_test_cases(parser, test_file):
	"""
	Parse source file and extracts test cases
	"""
	parsed_classes = parser.parse_file(test_file)

	test_cases = list()

	for parsed_class in parsed_classes:
		for method in parsed_class['methods']:
			if 'test' in method['identifier'].lower():
				test_cases.append(method['body'])
	
	return test_cases

path = "../../projects_"
grammar_file = './java-grammar.so'
language = 'java'
parser = TestParser(grammar_file, language)

projects = os.listdir(path)

for project in projects:
	print(f'Getting tests for project {project}')

	project_path = f"{path}/{project}"
	os.chdir(project_path)

	project_test_cases = []
	test_cases_files = []

	try:
		output = subprocess.check_output(r'find . -type f -name "*Test*.java"', shell=True, stderr=STDOUT)
		test_files = output.decode('ascii').splitlines()

		for test_file in test_files:
			file_test_cases = parse_test_cases(parser, test_file)

			project_test_cases.extend(file_test_cases)
			test_cases_files.extend([test_file] * len(file_test_cases))

	except CalledProcessError as e:
		output = e.output.decode()
		print(f'Trying for project {project}')
		print(output)
		print(e)
		
	project_tests = pd.DataFrame({
		'test': project_test_cases,
		'file': test_cases_files,
		'project': [project] * len(project_test_cases)
	})
	project_tests.to_csv(f'./{project}_tests.csv', index=False)