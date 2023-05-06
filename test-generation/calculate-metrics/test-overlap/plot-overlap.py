import pandas as pd

import matplotlib
import matplotlib.pyplot as plt
from matplotlib_venn import venn3, venn3_circles

matplotlib.rcParams.update({'font.size': 18})

LLM_tests = set()
LLM_tests_path = "./model_tests.csv"
generated_tests = pd.read_csv(LLM_tests_path)

for index, row in generated_tests.iterrows():
    LLM_tests.add(row[0])

Evosuite_tests = set()
Evosuite_tests_path = "./evosuite_tests.csv"
generated_tests = pd.read_csv(Evosuite_tests_path)

for index, row in generated_tests.iterrows():
    Evosuite_tests.add(row[0])

Randoop_tests = set()
Randoop_tests_path = "./randoop_tests.csv"
generated_tests = pd.read_csv(Randoop_tests_path)

for index, row in generated_tests.iterrows():
    Randoop_tests.add(row[0])

a, b, c = len(set(LLM_tests) - set(Evosuite_tests)), len(set(Evosuite_tests) - set(LLM_tests)), len(set(LLM_tests) & set(Evosuite_tests))

d, e, f = len(set(LLM_tests) - set(Randoop_tests)), len(set(Randoop_tests) - set(LLM_tests)), len(set(LLM_tests) & set(Randoop_tests))

g, h, i = len(set(Evosuite_tests) - set(Randoop_tests)), len(set(Randoop_tests) - set(Evosuite_tests)), len(set(Evosuite_tests) & set(Randoop_tests))

subsets = (
    len(Evosuite_tests) - c - i,
    len(Randoop_tests) - f - i,
    i,
    len(LLM_tests) - c - f,
    c,
    f,
    0
)

ax = venn3(subsets=subsets, normalize_to=1.0, set_labels=['EvoSuite', 'Randoop', 'LLM'], set_colors=['#add8e6', '#17cefa', '#87cefa'], alpha=0.7)
venn3_circles(subsets=subsets, linestyle='dashed', linewidth=1, color='black')

plt.savefig('tests_overlap.pdf', bbox_inches='tight', pad_inches=0.1)
plt.clf()