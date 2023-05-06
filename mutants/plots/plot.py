import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# Prompt impact
df = pd.read_csv("prompt_impact.csv")
df['prompt'] = ['n=2', 'n=4', 'n=8', 'n=16', 'Similar\n(n=8)', '+ NL\n(n=8)']

plt.rcParams.update({'font.size':40})
df.plot.bar(x='prompt', y='compilable mutants', color='g', alpha=0.4, rot=0, legend=None, hatch=['/', '/', '/', '*', '/', '/'])
plt.xlabel("")
plt.ylabel("Compilable mutants")
plt.gcf().set_size_inches(16, 7)
plt.savefig("prompt_impact_mutants.pdf", bbox_inches = "tight")

# Model size impact
df = pd.read_csv("model_size_impact.csv")

plt.rcParams.update({'font.size':40})
df.plot.bar(x='size', y='compilable mutants', color='g', alpha=0.4, rot=0, legend=None, hatch=['/', '*'])
plt.xlabel("")
plt.ylabel("Compilable mutants")
plt.gcf().set_size_inches(6, 7)
plt.savefig("model_size_impact_mutants.pdf", bbox_inches = "tight")

# Temperature impact
df = pd.read_csv("temperature_impact.csv")

plt.rcParams.update({'font.size':40})
df.plot.bar(x='temperature', y='compilable mutants', color='g', alpha=0.4, rot=0, legend=None, hatch=['/', '/', '/', '/', '/', '/', '/', '/', '*', '/'])
plt.xlabel("Temperature")
plt.ylabel("Compilable mutants")
plt.gcf().set_size_inches(16, 7)
plt.savefig("temperature_impact_mutants.pdf", bbox_inches = "tight")