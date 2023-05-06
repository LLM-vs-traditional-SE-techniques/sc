import fnmatch, os
import csv
import re
import pandas as pd

path = '../generate-tests/CodeX/generated-tests/'

identifier = []
prompt_type = []
temperature = []
request_id = []
compilation_error = []

directory_contents = os.listdir(path)
#print(directory_contents)

mix_nl_pl_erros = ['illegal character: \'#\'', 'illegal character: \'\\\'', 'illegal start of type', '<identifier> expected', '\';\' expected', '\'(\' expected', '\')\' expected', '\'{\' expected', '> expected', 'not a statement', 'unclosed string literal', 'unclosed comment']

for item in directory_contents:
    path_ = path + item
    directory_contents_ = os.listdir(path_)
    #print(directory_contents_)

    for item_ in directory_contents_:
        path__ = path_ + '/'+ item_
        directory_contents__ = os.listdir(path__)
        #print(directory_contents__)

        for item__ in directory_contents__:
            if item__ == "uncompilable":
                compilation_error_logs = fnmatch.filter(os.listdir(path__ + '/' + item__), '*.txt')

                for log_file in compilation_error_logs:
                    aux = log_file.split("_")
                    errors = []

                    with open(path__ + '/' + item__ + '/' + log_file, 'r') as file:
                        for line in file:
                            error = re.search(r'^CodexTest_(\d+)_(\d+)_(\d+).java:(\d+): error: (.+)', line)
                            if error:
                                if error.group(5) in mix_nl_pl_erros:
                                    error = 'mix of NL and PL'
                                else:
                                    error = error.group(5)

                                if error not in errors:
                                    errors.append(error)

                    for error in errors:
                        identifier.append(item)
                        prompt_type.append(item_)
                        temperature.append(int(aux[2])/10)
                        request_id.append(int(aux[3]))
                        compilation_error.append(error.replace(';', ','))

# Export data to CSV file
if not os.path.isfile('./compilation_errors.csv'):
    columns = ['identifier', 'prompt_type', 'temperature', 'request_id', 'compilation_error']

    with open('./compilation_errors.csv', 'a') as csvFile:
        writer = csv.writer(csvFile)
        writer.writerow(columns)

df = pd.read_csv('./compilation_errors.csv')
df_new_data = pd.DataFrame({
    'identifier': identifier,
    'prompt_type': prompt_type,
    'temperature': temperature,
    'request_id': request_id,
    'compilation_error': compilation_error
})
df = df.append(df_new_data)
df.to_csv(f'./compilation_errors.csv', index=False)