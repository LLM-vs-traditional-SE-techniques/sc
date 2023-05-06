import openai
import logging
import pandas as pd
from tqdm import tqdm
from statistics import mean, stdev
from process import OpenAIProcessor
from pipeline import ApproachPipeline
from baselines import memo_generate as memo
from translation.context import CodeContext
from translation.misc import contextualize_node
from sklearn.metrics.pairwise import linear_kernel
from sklearn.feature_extraction.text import TfidfVectorizer


logging.basicConfig(filename='oracles.log', encoding='utf-8', level=logging.DEBUG)

tqdm.pandas()

openai.api_key_path = '../.openai_key'

pipeline = ApproachPipeline('./data/src')


# Utility methods

# Setup the instance selection using MeMo
# Use this to do the selection on the fly...
def memo_predicts_oracle(memo_preds, method):
    result, x = memo.generate_results_for_method(method.class_name.name, method.name)
    print(x)
    return len(result['oracles']) > 0

# Or use this version that just uses the precomputed results instead...
def memo_predicts_oracle(memo_preds, method):
    results = memo_preds[(memo_preds.class_name == method.class_name.name) & (memo_preds.method_name == method.name)]
    return len(results) > 0 and len(results.iloc[0].oracles) > 0


def to_basic_desc(method):
    return f'public{" static" if method.static else ""} {method.returns[0]} {method.base_name}({", ".join(ptype[0] + " " + pname for pname, ptype in method.params.items())})'


# Oracle processor (this is where calling the llm happens)

class OracleProcessor(OpenAIProcessor):

    def __init__(self, base_prompt, **kwargs):
        self.base_prompt = base_prompt
        super().__init__(**kwargs)

    def preprocess(self, method):
        prompt_input = to_basic_desc(method) + '\n' + method.comment
        if callable(self.base_prompt):
            prompt = self.base_prompt(prompt_input, method)
        else:
            prompt = self.base_prompt

        prompt = prompt.format(prompt_input)

        return method, prompt

    def process_many(self, xs):
        methods, prompts = zip(*xs)

        completions = super().process_many(prompts)

        return zip(methods, completions)

    def postprocess(self, x):
        code_dict = pipeline.code_dict
        method, completion = x
        extracted_equiv = self._extract_raw_equivalence(completion)

        if extracted_equiv is None:
            return []

        raw_condition, raw_ent1, raw_ent2 = extracted_equiv

        try:
            code_context = CodeContext(code_dict, method)

            condition = str(contextualize_node(code_context.embed_code_string(raw_condition), code_context))
            ent1 = str(contextualize_node(code_context.embed_code_string(raw_ent1), code_context))
            ent2 = str(contextualize_node(code_context.embed_code_string(raw_ent2), code_context))
        except:
            condition = raw_condition
            ent1 = raw_ent1
            ent2 = raw_ent2

        if ent1 == 'None' or ent2 == 'None':
            return []

        serialized_oracle = {
            'condition': condition,
            'entities': sorted([ent1, ent2])
        }

        return [serialized_oracle]

    def _extract_raw_equivalence(self, completion):
        equiv = 'true', *completion.strip().split('\n')

        if len(equiv) != 3:
            return None

        return equiv


# Prompt construction

def construct_prompt(inputs, outputs, prefix=''):
    prompt = prefix
    for i, o in zip(inputs, outputs):
        prompt += f'Input:\n{i}\nOutput:\n{o}\n\n'

    prompt += 'Input:\n{}\nOutput:'

    return prompt


def construct_similarity_prompt(input_pool, output_pool, k=3, **kwargs):
    vectorizer = TfidfVectorizer()
    example_tfidf = vectorizer.fit_transform(input_pool)

    def prompt(input, method):
        input_tfidf = vectorizer.transform([input])

        similarities = linear_kernel(input_tfidf, example_tfidf).flatten()
        top_idx = similarities.argsort()[-k:]

        similar_inputs, similar_outputs = zip(*[(input_pool[i], output_pool[i]) for i in top_idx])

        return construct_prompt(similar_inputs, similar_outputs, **kwargs)

    return prompt

def construct_other_project_prompt(input_pool, output_pool, projects_of_origin, k=3, **kwargs):

    def prompt(input, method):
        project = package_to_project(method.class_name.name)

        different_project_inputs, different_project_outputs = [], []
        for i, o, p in zip(input_pool, output_pool, projects_of_origin):
            if p == project:
                continue

            different_project_inputs.append(i)
            different_project_outputs.append(o)

            if len(different_project_inputs) >= k:
                break

        return construct_prompt(different_project_inputs, different_project_outputs, **kwargs)

    return prompt

def construct_similarity_other_project_prompt(input_pool, output_pool, projects_of_origin, k=3, **kwargs):
    vectorizer = TfidfVectorizer()
    example_tfidf = vectorizer.fit_transform(input_pool)

    def prompt(input, method):
        input_tfidf = vectorizer.transform([input])

        similarities = linear_kernel(input_tfidf, example_tfidf).flatten()
        top_idx = similarities.argsort()[::-1]

        similar_inputs, similar_outputs, similar_projects = zip(*[(input_pool[i], output_pool[i], projects_of_origin[i]) for i in top_idx])

        different_project_inputs, different_project_outputs = [], []
        for i, o, p in zip(similar_inputs, similar_outputs, similar_projects):
            project = package_to_project(method.class_name.name)
            if p == project:
                continue

            different_project_inputs.append(i)
            different_project_outputs.append(o)

            if len(different_project_inputs) >= k:
                break


        return construct_prompt(different_project_inputs, different_project_outputs, **kwargs)

    return prompt


# Result generation

def generate_results(ground_truth, memo_preds, prompt='', **kwargs):
    methods = ground_truth.apply(lambda row: pipeline.code_dict.find_method(row.class_name, row.method_name), axis=1)

    methods_to_look_at = methods.apply(lambda m: m is not None and memo_predicts_oracle(memo_preds, m))

    predicted_methods = methods[methods_to_look_at]

    oracle_processor = OracleProcessor(base_prompt=prompt, max_process_n=20, **kwargs)
    oracles = oracle_processor.run_many(predicted_methods, show_progress=True)

    pred = ground_truth.copy()
    pred['oracles'] = [[] for _ in range(len(pred))]
    pred.loc[methods_to_look_at, 'oracles'] = oracles

    results = pipeline.evaluate_approach(ground_truth, pred)

    return results


def calculate_prec_rec_f1(results):
    prec = results.tp.sum() / (results.tp.sum() + results.fp.sum())
    rec = results.tp.sum() / (results.tp.sum() + results.fn.sum())
    f1 = 2 * prec * rec / (prec + rec)

    return prec, rec, f1


# Load the data

gt = pd.read_json('./data/truth.json')

# Use this if you want to regenerate the original memo results instead of using the cached ones
#memo_preds = memo.generate_for_method_list(gt)
# Or this if not...
memo_preds = pd.read_json('./results/memo_results.json')

## Enrich the data with project information
PACKAGE_TO_PROJECT = {
    'java': 'JDK',
    'sun': 'JDK',
    'com.sun': 'JDK',
    'cern': 'Colt',
    'hep': 'Colt',
    'com.google.common': 'Guava',
    'com.google.gwt': 'GWT',
    'com.google.web': 'GWT',
    'org.graphstream': 'GraphStream',
    'org.apache.commons': 'CommonsMath',
    'org.hibernate': 'Hibernate',
    'org.elasticsearch': 'Elasticsearch',
    'weka': 'Weka'
}

def package_to_project(package):
    for package_prefix, project in PACKAGE_TO_PROJECT.items():
        if package.startswith(package_prefix):
            return project

    return None

gt['project_name'] = gt.apply(lambda row: package_to_project(row.class_name), axis=1)

# Run the experiments

example_pool = gt[gt.oracles.apply(len) > 0].sample(frac=1, random_state=0)
example_pool['method_info'] = example_pool.apply(lambda row: pipeline.code_dict.find_method(row.class_name, row.method_name), axis=1)
example_pool = example_pool[example_pool.method_info.notna()]
example_pool['prompt_input'] = example_pool.apply(lambda row: to_basic_desc(row.method_info) + '\n' + row.method_info.comment, axis=1).apply(lambda x: x.replace('{', '{{').replace('}', '}}'))
example_pool['prompt_output'] = example_pool.apply(lambda row: '\n'.join(row.oracles[0]['entities']).replace('{', '{{').replace('}', '}}'), axis=1)

example_pool = example_pool[example_pool.oracles.apply(lambda x: x[0]['entities'] != ['un', 'translatable'] and not any(e == 'None' for e in x[0]['entities']))]
example_pool.index = range(len(example_pool))


similarity_pool = example_pool.sample(64, random_state=0)
similarity_pool.index = range(len(similarity_pool))

def run_experiment(prompt_type='other_project', prompt_params={}, model_params={}, random_state=0, save_path=None):
    if prompt_type == 'other_project':
        prompt = construct_other_project_prompt(
            example_pool.sample(frac=1, random_state=random_state).prompt_input,
            example_pool.sample(frac=1, random_state=random_state).prompt_output,
            example_pool.sample(frac=1, random_state=random_state).project_name,
            **prompt_params
        )
    elif prompt_type == 'similarity':
        prompt = construct_similarity_prompt(
            similarity_pool.prompt_input,
            similarity_pool.prompt_output,
            **prompt_params
        )
    elif prompt_type == 'similarity_other_project':
        prompt = construct_similarity_other_project_prompt(
            similarity_pool.prompt_input,
            similarity_pool.prompt_output,
            similarity_pool.project_name,
            **prompt_params
        )
    elif prompt_type == 'similarity_other_project_all_examples':
        prompt = construct_similarity_other_project_prompt(
            example_pool.prompt_input,
            example_pool.prompt_output,
            example_pool.project_name,
            **prompt_params
        )
    elif prompt_type == 'regular':
        prompt = construct_prompt(
            example_pool.sample(frac=1, random_state=random_state).iloc[:prompt_params['k']].prompt_input,
            example_pool.sample(frac=1, random_state=random_state).iloc[:prompt_params['k']].prompt_output
        )
    else:
        raise ValueError(f'Unknown prompt type {prompt_type}')

    try:
        results = generate_results(gt, memo_preds, prompt=prompt, **model_params)
    except:
        import traceback
        traceback.print_exc()
        return run_experiment(prompt_type=prompt_type, prompt_params=prompt_params, model_params=model_params, random_state=random_state, save_path=save_path)

    if save_path:
        results.to_csv(save_path, index=False)

    return results

# Naive run
results_naive = run_experiment(prompt_type='other_project', prompt_params={'k': 1}, model_params={'model': 'code-davinci-002'}, save_path='results/results_naive.csv')

# Default run
results_default = run_experiment(prompt_type='other_project', prompt_params={'k': 8}, model_params={'model': 'code-davinci-002'}, save_path='results/results_default.csv')

# Vary length
results_length = [
    run_experiment(prompt_type='other_project', prompt_params={'k': 2**k}, model_params={'model': 'code-davinci-002'}, save_path=f'results/results_length_{2**k}.csv')
    for k in range(1, 6)
]

# Vary NL description
results_nl_desc = run_experiment(
    prompt_type='other_project',
    prompt_params={'k': 8, 'prefix': 'Extract equivalent pieces of code from the following documentation:\n\n'},
    model_params={'model': 'code-davinci-002'},
    save_path='results/results_nl_desc.csv'
)

# Vary model size
results_cushman = run_experiment(
    prompt_type='other_project',
    prompt_params={'k': 8},
    model_params={'model': 'code-cushman-001'},
    save_path='results/results_cushman.csv'
)

# Vary example selection

## Most similar
results_sim = run_experiment(prompt_type='similarity', prompt_params={'k': 8}, model_params={'model': 'code-davinci-002'}, save_path='results/results_sim.csv')  

results_sim_op = run_experiment(prompt_type='similarity_other_project', prompt_params={'k': 8}, model_params={'model': 'code-davinci-002'}, save_path='results/results_sim_op.csv')  

results_sim_op_ae = run_experiment(prompt_type='similarity_other_project_all_examples', prompt_params={'k': 8}, model_params={'model': 'code-davinci-002'}, save_path='results/results_sim_op_ae.csv')  


# Vary temperature
results_temp = [
    run_experiment(prompt_type='other_project', prompt_params={'k': 8}, model_params={'model': 'code-davinci-002', 'temperature': t}, save_path=f'results/results_temp_{t}.csv')
    for t in [i / 10 for i in range(0, 11)]
]


## Random from other project
results_op = [
    run_experiment(prompt_type='other_project', prompt_params={'k': 8}, model_params={'model': 'code-davinci-002'}, random_state=i, save_path=f'results/results_op_{i}.csv')
    for i in range(30)
]

def print_results():
    print('RQ3 Results\n')
    for k, res in zip(range(1, 6), results_length):
        print(f'Length n={2**k}:', calculate_prec_rec_f1(res)[2])

    print('Similarity-based:', calculate_prec_rec_f1(results_sim_op)[2])

    print('With NL desc:', calculate_prec_rec_f1(results_nl_desc)[2])

    print('\n\n')

    print('RQ4 Results\n')

    print('Small model:', calculate_prec_rec_f1(results_cushman)[2])
    print('Large model:', calculate_prec_rec_f1(results_default)[2])

    print('\n\n')

    print('RQ5 Results\n')

    for t, res in zip([i / 10 for i in range(0, 10)], results_temp):
        print(f'Temp {t}:', calculate_prec_rec_f1(res)[2])


print_results()
