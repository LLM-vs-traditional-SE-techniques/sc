import re
import fnmatch, os
import csv
import pandas as pd

path = "../generate-tests/CodeX/generated-tests/number_of_examples_variation/"

total_number_of_compilable_tests = 0
total_number_of_uncompilable_tests = 0

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
                        total_number_of_compilable_tests += number_of_compilable_tests

                    elif item___ == "uncompilable":
                        path____ = path___ + '/'+ item___

                        directory_contents____ = os.listdir(path____)

                        number_of_uncompilable_tests = len(fnmatch.filter(directory_contents____, '*.java'))
                        total_number_of_uncompilable_tests += number_of_uncompilable_tests

print(f"Uncompilable tests: {total_number_of_uncompilable_tests / (total_number_of_compilable_tests + total_number_of_uncompilable_tests)}")