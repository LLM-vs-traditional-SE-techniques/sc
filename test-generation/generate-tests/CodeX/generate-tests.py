import re
import os
import time
import json
import openai
import random
import argparse
import subprocess
import numpy as np
import pandas as pd

from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import linear_kernel

from transformers import GPT2Tokenizer

parser = argparse.ArgumentParser()
parser.add_argument(
    "--model", help="Name of model: code-davinci-002, code-cushman-001", required=True)
parser.add_argument(
    "--prompt_type", help="Type of prompt: NL-description-and-similar-examples, NL-description, similar-examples, random-examples, NL-description-and-random-examples", required=True)
parser.add_argument(
    "--methods2test_path", help="Directory with jsons containing methods to be tested", required=True)

# Add your openai token (https://beta.openai.com/account/api-keys)
openai.api_key = ""

tokenizer = GPT2Tokenizer.from_pretrained("gpt2")
  
############################################## Prompts ###########################################
def generate_prompt_with_NL(method_signature, method):
  return """Suggest a test for a method with the {} signature.\n\nInput: {}\nOutput:
  """.format(method_signature, method)
  return prompt
  
def generate_prompt_with_examples(method, examples):
  examples_str = ""
  for example in examples:
    examples_str += "Input: " + example[0] + "\nOutput: " + example[1] + "\n\n"
  return """{}Input: {}\nOutput:
  """.format(examples_str, method)
  return prompt
  
def generate_prompt_with_NL_and_examples(method_signature, method, examples):
  examples_str = ""
  for example in examples:
    examples_str += "\nInput: " + example[0] + "\nOutput: " + example[1] + "\n"
  return """Suggest a test for a method with the {} signature.\n{}\nInput: {}\nOutput:
  """.format(method_signature, examples_str, method)

#################################################################################################

def get_similar_examples_idx(method, examples, k=1):
    vectorizer = TfidfVectorizer()
    examples_tfidf = vectorizer.fit_transform(examples)
    method_tfidf = vectorizer.transform([method])
    
    similarities = linear_kernel(method_tfidf, examples_tfidf).flatten()
    top_idx = similarities.argsort()[-k:][::-1]
    return top_idx
  
def get_random_examples_idx(projects, project_of_origin, k=1, seed=0):
    considered_idx = []
    for i in range(len(projects)):
      if projects[i] != project_of_origin:
        considered_idx.append(i)
    random.seed(seed)
    random.shuffle(considered_idx)
    return considered_idx[0:k]
    
def send_test_query(model, prompt, temperature):
  print(prompt)
  if model == "code-davinci-002":
    max_tokens = 4000
  else:
    max_tokens = 2048

  response = openai.Completion.create(
    engine=model,
    prompt=prompt,
    # The maximum number of tokens to generate in the completion.
    # davinci: up to 4000
    # cushman: up to 2048
    # max_tokens=max_tokens-len(tokenizer(prompt)['input_ids']),
    max_tokens=500,
    temperature=temperature,
    top_p=1,
    n=1,
    frequency_penalty=0,
    presence_penalty=0,
    stop=["\n\nInput:"]
  )
  return response

def generate_tests(model, method_signature, method, examples, prompt_type, file_name, package, imports, seed):
  if prompt_type == "NL-description":
    prompt = generate_prompt_with_NL(method_signature, method)
  elif prompt_type == "similar-examples" or prompt_type == "random-examples":
    prompt = generate_prompt_with_examples(method, examples)
  elif prompt_type == "NL-description-and-similar-examples" or prompt_type == "NL-description-and-random-examples":
    prompt = generate_prompt_with_NL_and_examples(method_signature, method, examples)
    
  # prompt = generate_prompt_with_examples(method, examples)

  generated_tests = {}
  temperatures = list(np.arange(0, 1, 0.1))

  for temperature in temperatures:
    generated_tests[temperature] = []

    for i in range(1, 11):
      while True:
        try:
          response = send_test_query(model, prompt, temperature)
          break
        except Exception as e:
          print(e)
          # Rate limit achieved
          time.sleep(60)

      completion = response.choices[0].text
      print(completion)

      # More than a test case may be returned, keep only the first one
      test = completion.split('\n\n')[0]
      if test:
        # Add annotation to compile with JUnit
        if "@Test" not in test:
          test_ = "@Test\n  " + test
        else:
          test_ = test

        # Keep only unique tests
        test_exists = False
        for temperature_, unique_tests in generated_tests.items():
          if test_ in unique_tests:
            test_exists = True
            break

        if not test_exists:
          generated_tests[temperature].append(test_)

  for temperature, tests in generated_tests.items():
    counter = 1
    for test in tests:
      # Create test class
      test_class_name = 'CodexTest_0_' + str(int(temperature*10)) + '_' + str(counter) 
      junit_imports = 'import static org.junit.Assert.*;\nimport org.junit.Test;\n\nimport org.junit.*;'
      source = imports + '\n' + junit_imports + '\n\n\npublic class ' + test_class_name + ' { \n  ' + test + '\n}'
      
      # save prompt and test to CSV
      data = {'prompt': [prompt], 'output': [source]}
      df = pd.DataFrame(data=data)
      df.to_csv(f'./generated-tests/{model}/{file_name}/{prompt_type}/{len(examples)}_examples/{str(seed)}_seed/all/{test_class_name}.csv', index=False)
       
      # Check if code is compilable and save on appropriate folder.
      output_class_path = f'../generated-tests/{model}/{file_name}/{prompt_type}/{len(examples)}_examples/{str(seed)}_seed/'
      subprocess.call(f"cd ./compile/ && ./s '{package}' '{test_class_name}' '{source}' '{output_class_path}'", 
        shell=True)
      
      counter += 1
      
def run_experiment():
  pass
    
if __name__ == "__main__":

    args = parser.parse_args()

    model = args.model
    prompt_type = args.prompt_type
    methods2test_path = args.methods2test_path
    
    projects = []
    methods = []
    methods_id = []
    methods_signature = []
    packages = []
    imports = []
    
    examples_input = []
    examples_output = []
    
    seeds = [x for x in range(1, 30)]

    for file_name in [file for file in os.listdir(methods2test_path) if file.endswith('.json')]:
      method_id = file_name.split(".")[0]
      subprocess.call(f'mkdir ./generated-tests/{model}', shell=True)
      subprocess.call(f'mkdir ./generated-tests/{model}/{method_id}', shell=True)
        
      subprocess.call(f'mkdir ./generated-tests/{model}/{method_id}/{prompt_type}', shell=True)
      
      for n in [8]:
        subprocess.call(f'mkdir ./generated-tests/{model}/{method_id}/{prompt_type}/{n}_examples', shell=True)
                
        # temperatures = list(np.arange(0, 1, 0.1))
        
        # for temperature in temperatures:
        #   subprocess.call(f'mkdir ./generated-tests/{model}/{method_id}/{prompt_type}/{n}_examples/0_{str(int(temperature*10))}_temperature/', shell=True)
        
        #   subprocess.call(f'mkdir ./generated-tests/{model}/{method_id}/{prompt_type}/{n}_examples/0_{str(int(temperature*10))}_temperature/compilable', shell=True)
        #   subprocess.call(f'mkdir ./generated-tests/{model}/{method_id}/{prompt_type}/{n}_examples/0_{str(int(temperature*10))}_temperature/uncompilable', shell=True)
        #   subprocess.call(f'mkdir ./generated-tests/{model}/{method_id}/{prompt_type}/{n}_examples/0_{str(int(temperature*10))}_temperature/all', shell=True)
        
        for seed in seeds:
          subprocess.call(f'mkdir ./generated-tests/{model}/{method_id}/{prompt_type}/{n}_examples/{str(seed)}_seed/', shell=True)
        
          subprocess.call(f'mkdir ./generated-tests/{model}/{method_id}/{prompt_type}/{n}_examples/{str(seed)}_seed/compilable', shell=True)
          subprocess.call(f'mkdir ./generated-tests/{model}/{method_id}/{prompt_type}/{n}_examples/{str(seed)}_seed/uncompilable', shell=True)
          subprocess.call(f'mkdir ./generated-tests/{model}/{method_id}/{prompt_type}/{n}_examples/{str(seed)}_seed/all', shell=True)
        
          
      with open(methods2test_path + file_name) as json_file:
        data = json.load(json_file, strict=False)
        projects.append(data['project'])
        methods.append(data['method'])
        methods_id.append(file_name)
        methods_signature.append(data['method_signature'])
        packages.append(data['package'])

        method_class_imports = data['method_class_imports']
        test_class_imports = data['test_class_imports']
        imports.append(method_class_imports + '\n\n' + test_class_imports)
        
        examples_input.append(data['example_same_class']['method'])
        examples_output.append(data['example_same_class']['test'])
                    
    print("Generating tests with {} for the {} prompt.".format(model, prompt_type))
    methods_idx = [idx for idx in range(len(methods))]
    for i in methods_idx:   
      print(f"MUT: {methods_signature[i]}")   
      if prompt_type == "NL-description":
        examples = []
        generate_tests(model, methods_signature[i], methods[i], examples, prompt_type, file_name.split('.')[0], packages[i], imports[i])
      else:
        for n in [8]:
          for seed in seeds:
            if prompt_type == "similar-examples" or prompt_type == "NL-description-and-similar-examples":
              similar_examples_idx = get_similar_examples_idx(methods[i], examples_input, n)
              examples = [(examples_input[idx], examples_output[idx]) for idx in similar_examples_idx]
            elif prompt_type == "random-examples" or prompt_type == "NL-description-and-random-examples":
              random_examples_idx = get_random_examples_idx(projects, projects[i], n, seed)
              examples = [(examples_input[idx], examples_output[idx]) for idx in random_examples_idx]
            else:
              print("Invalid prompt")
              exit()
              
            generate_tests(model, methods_signature[i], methods[i], examples, prompt_type, methods_id[i].split('.')[0], packages[i], imports[i], seed)
