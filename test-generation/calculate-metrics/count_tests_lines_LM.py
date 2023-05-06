import re
import fnmatch, os
import csv
import pandas as pd

path = "../generate-tests/CodeX/generated-tests/number_of_examples_variation/"

total_number_of_compilable_tests = 0
total_number_of_test_lines = 0

directory_contents = os.listdir(path)

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

                        directory_contents____ = os.listdir(path____)

                        number_of_compilable_tests = len(fnmatch.filter(directory_contents____, '*.java'))
                        number_of_test_lines = 0

                        for file in directory_contents____:
                            if '.java' in file:
                                with open(path____ + '/' + file, 'r', encoding='latin-1') as f:
                                    test_found = False
                                    num_lines = 0
                                    for line in f:
                                        if test_found:
                                            num_lines += 1
                                        else:
                                            test = re.search(r'^  @Test', line)
                                            if test:
                                                test_found = True

                                    number_of_test_lines += num_lines - 3

                        total_number_of_compilable_tests += number_of_compilable_tests
                        total_number_of_test_lines += number_of_test_lines

                        print(item)
                        #print(number_of_test_lines)
                        print(number_of_compilable_tests)
                        print(f"Avg. number of lines: {int(number_of_test_lines/number_of_compilable_tests)}")

print(f"\n\nTotal number of compilable tests: {int(total_number_of_compilable_tests)}")
print(f"\n\nTotal Avg. number of lines: {int(total_number_of_test_lines/total_number_of_compilable_tests)}")