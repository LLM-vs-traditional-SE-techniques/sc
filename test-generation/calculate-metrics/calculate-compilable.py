import fnmatch, os
import csv
import pandas as pd

path = '../generate-tests/CodeX/generated-tests/code-davinci-001/'

identifier = []
prompt_type = []
num_compilable_tests = []
num_uncompilable_tests = []

directory_contents = os.listdir(path)
#print(directory_contents)

for item in directory_contents:
    path_ = path + item
    directory_contents_ = os.listdir(path_)
    #print(directory_contents_)

    for item_ in directory_contents_:
        path__ = path_ + '/'+ item_
        directory_contents__ = os.listdir(path__)
        #print(directory_contents__)

        identifier.append(item)
        prompt_type.append(item_)

        for item__ in directory_contents__:
            if item__ == "compilable":
                number_of_compilable_tests = len(fnmatch.filter(os.listdir(path__ + '/' + item__), '*.java'))    
                num_compilable_tests.append(number_of_compilable_tests)
                #print(f"{item} {item_} {item__} {number_of_compilable_tests}")
            elif item__ == "uncompilable":
                number_of_uncompilable_tests = len(fnmatch.filter(os.listdir(path__ + '/' + item__), '*.java'))
                num_uncompilable_tests.append(number_of_uncompilable_tests)

zipped_lists = zip(num_compilable_tests, num_uncompilable_tests)
total_num_tests = [int(x + y) for (x, y) in zipped_lists]
zipped_lists = zip(num_compilable_tests, num_uncompilable_tests)
percentage_compilable_tests = [x/(x + y) for (x, y) in zipped_lists]

# Export data to CSV file
if not os.path.isfile('./compilation_info.csv'):
    columns = ['identifier', 'prompt_type', 'num_compilable_tests', 'num_uncompilable_tests']

    with open('./compilation_info.csv', 'a') as csvFile:
        writer = csv.writer(csvFile)
        writer.writerow(columns)

df = pd.read_csv('./compilation_info.csv')
df_new_data = pd.DataFrame({
    'identifier': identifier,
    'prompt_type': prompt_type,
    'num_compilable_tests': num_compilable_tests,
    'num_uncompilable_tests': num_uncompilable_tests,
    'total_num_tests': total_num_tests,
    'percentage_compilable_tests': percentage_compilable_tests
})
df = df.append(df_new_data)
df.to_csv(f'./compilation_info.csv', index=False)
