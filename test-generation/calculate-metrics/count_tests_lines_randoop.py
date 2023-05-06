import re
import fnmatch, os
import csv
import pandas as pd

# Randoop

path = "../generate-tests/Randoop/generated-tests/"

total_number_of_compilable_tests = 0
total_number_of_test_lines = 0

directory_contents = os.listdir(path)

for item in directory_contents:
    path_ = path + item
    directory_contents_ = os.listdir(path_)
    
    number_of_compilable_tests = len(fnmatch.filter(directory_contents_, '*.java')) - 1
    number_of_test_lines = 0

    for file in directory_contents_:
        if "ErrorTest" in file:
            number_of_compilable_tests -= 1
            break

    for file in directory_contents_:
        if '.java' in file:
            if file != "ErrorTest.java" and file != 'RegressionTest.java':
                with open(path + item + '/' + file, 'r', encoding='latin-1') as f:
                    test_found = False
                    num_lines = 0
                    for line in f:
                        if test_found:
                            num_lines += 1
                        else:
                            test = re.search(r'^    @Test', line)
                            if test:
                                test_found = True

                number_of_test_lines += num_lines - 1

    total_number_of_compilable_tests += number_of_compilable_tests
    total_number_of_test_lines += number_of_test_lines

    print(item)
    #print(number_of_test_lines)
    print(number_of_compilable_tests)
    print(f"Avg. number of lines: {int(number_of_test_lines/number_of_compilable_tests)}")

print(f"\n\nTotal number of compilable tests: {int(total_number_of_compilable_tests)}")
print(f"\n\nTotal Avg. number of lines: {int(total_number_of_test_lines/total_number_of_compilable_tests)}")