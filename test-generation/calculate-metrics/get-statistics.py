import pandas as pd

df = pd.read_csv('./compilation_errors.csv')
df = df.groupby(['identifier', 'prompt_type', 'temperature', 'compilation_error']).size().reset_index(name='counts')
df.to_csv(f'./detailed_compilation_errors_statistics.csv', index=False)

df = pd.read_csv('./compilation_errors.csv')
df = df.groupby(['compilation_error']).size().reset_index(name='counts')
df.to_csv(f'./compilation_errors_statistics.csv', index=False)

df = pd.read_csv('./compilation_errors.csv')
df = df.groupby(['compilation_error', 'temperature']).size().reset_index(name='counts')
df.to_csv(f'./compilation_errors_per_temperature_statistics.csv', index=False)

