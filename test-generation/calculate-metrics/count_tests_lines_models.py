import re
import fnmatch, os
import csv
import pandas as pd

path = "../generate-tests/CodeX/generated-tests/code-cushman-001/"

total_number_of_compilable_tests_NL_description = 0
total_number_of_test_lines_NL_description = 0

total_number_of_compilable_tests_same_class_example = 0
total_number_of_test_lines_same_class_example = 0

total_number_of_compilable_tests_NL_description_and_same_class_example = 0
total_number_of_test_lines_NL_description_and_same_class_example = 0

total_number_of_compilable_tests_NL_description_and_different_project_example = 0
total_number_of_test_lines_NL_description_and_different_project_example = 0

directory_contents = os.listdir(path)

for item in directory_contents:
    print(item)
    path_ = path + item
    directory_contents_ = os.listdir(path_)
    #print(directory_contents_)

    for item_ in directory_contents_:
        path__ = path_ + '/'+ item_
        directory_contents__ = os.listdir(path__)

        print(item_)

        for item__ in directory_contents__:
            if item__ == "compilable":
                directory_contents_ = os.listdir(path__ + '/' + item__)

                number_of_compilable_tests = len(fnmatch.filter(directory_contents_, '*.java'))
                number_of_test_lines = 0

                for file in directory_contents_:
                    if '.java' in file:
                        with open(path__ + '/' + item__ + '/' + file, 'r', encoding='latin-1') as f:
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

                #print(number_of_compilable_tests)
                #print(number_of_test_lines)
                if number_of_compilable_tests:
                    print(f"Avg. number of lines: {int(number_of_test_lines/number_of_compilable_tests)}")
                else:
                    print(f"Avg. number of lines: {0}")


                if item_ == "NL-description":
                    total_number_of_compilable_tests_NL_description += number_of_compilable_tests
                    total_number_of_test_lines_NL_description += number_of_test_lines
                elif item_ == "same-class-example":
                    total_number_of_compilable_tests_same_class_example += number_of_compilable_tests
                    total_number_of_test_lines_same_class_example += number_of_test_lines
                elif item_ == "NL-description-and-same-class-example":
                    total_number_of_compilable_tests_NL_description_and_same_class_example += number_of_compilable_tests
                    total_number_of_test_lines_NL_description_and_same_class_example += number_of_test_lines
                elif item_ == "NL-description-and-different-project-example":
                    total_number_of_compilable_tests_NL_description_and_different_project_example += number_of_compilable_tests
                    total_number_of_test_lines_NL_description_and_different_project_example += number_of_test_lines

print("\n\n")
print(f"Total Avg. number of lines (NL-description-and-same-class-example): {int(total_number_of_test_lines_NL_description_and_same_class_example/total_number_of_compilable_tests_NL_description_and_same_class_example)}")

print("\n\n")
print(f"Total Avg. number of lines (NL-description): {int(total_number_of_test_lines_NL_description/total_number_of_compilable_tests_NL_description)}")

print("\n\n")
print(f"Total Avg. number of lines (Same class example): {int(total_number_of_test_lines_same_class_example/total_number_of_compilable_tests_same_class_example)}")

print("\n\n")
print(f"Total Avg. number of lines (NL-description-and-different-project-example): {int(total_number_of_test_lines_NL_description_and_different_project_example/total_number_of_compilable_tests_NL_description_and_different_project_example)}")