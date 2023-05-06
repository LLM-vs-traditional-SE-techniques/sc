import os
import util
import json
import subprocess
import pandas as pd
from tqdm import tqdm
from functools import lru_cache
from baselines.memo_translate import memo_goal_format_to_our_format

GROUND_TRUTH_PATH = '../data/truth.json'
SRC_DIR = '../data/src'
MEMO_PATH = '../data/artifacts/memo/MeMo-1.0-all.jar'
TEMP_PATH = '../data/temp.json'

CLASS_ARTIFACTS = {
	'java': '../data/artifacts/guava/guava-19.0.jar',
	'cern': '../data/artifacts/colt/colt.jar',
	'hep': '../data/artifacts/colt/colt.jar',
	'com.google.common': '../data/artifacts/guava/guava-19.0.jar',
	'com.google.gwt': '../data/artifacts/gwt/gwt-user-2.5.1.jar',
	'com.google.web': '../data/artifacts/gwt/gwt-user-2.5.1.jar',
	'org.graphstream': '../data/artifacts/graphstream/gs-core-1.3.jar',
	'org.apache.commons': '../data/artifacts/commonsmath/commons-math3-3.6.1.jar',
	'org.hibernate': '../data/artifacts/hibernate/hibernate-core-5.4.2.Final.jar;../data/artifacts/hibernate/javax.persistence-api-2.2.jar',
	'org.elasticsearch': '../data/artifacts/elasticsearch/elasticsearch-6.1.1.jar;../data/artifacts/elasticsearch/joda-time-2.9.8.jar;../data/artifacts/elasticsearch/lucene-core-7.2.1.jar',
	'weka': '../data/artifacts/weka/weka-stable-3.8.0.jar'
}

def resolve_required_artifact(class_name):
	for artifact_prefix, artifact in CLASS_ARTIFACTS.items():
		if class_name.startswith(artifact_prefix):
			return artifact

@lru_cache
def generate_results_for_class(class_name):
	class_prefix = '.'.join(class_name.split('.')[:2])
	class_dir = resolve_required_artifact(class_name)

	print(f'java -cp {MEMO_PATH} org.memo.MeMo --source-dir {SRC_DIR} --target-class {class_name} --class-dir {class_dir} --condition-translator-output {TEMP_PATH} --cross-oracles true')
	subprocess.run(f'java -cp {MEMO_PATH} org.memo.MeMo --source-dir {SRC_DIR} --target-class {class_name} --class-dir {class_dir} --condition-translator-output {TEMP_PATH} --cross-oracles true', shell=True,stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)

	with open(TEMP_PATH, 'r+') as f:
		results = json.load(f)

	os.remove(TEMP_PATH)

	return memo_goal_format_to_our_format(results), results

def generate_results_for_method(class_name, method_name):
	class_result, raw_class_results = generate_results_for_class(class_name)

	method_result = util.find(class_result, lambda entry: entry['method_name'] == method_name)

	# MeMo for some reason didn't return something for the method (or there is a bug in the translation)
	if method_result is None:
		print('Method not in result set ', class_name, method_name)
		return {
			'class_name': class_name,
			'method_name': method_name,
			'oracles': []
		}, raw_class_results

	return method_result, raw_class_results

def generate_for_method_list(truth):
	results = []

	for _, entry in tqdm(truth.iterrows(), total=truth.shape[0]):
		try:
			method_res, raw_res = generate_results_for_method(entry.class_name, entry.method_name)
			
			results.append(method_res)
		except:
			import traceback
			traceback.print_exc()

	return pd.DataFrame(results)

if __name__ == '__main__':
	results = []
	excs = []

	with open(GROUND_TRUTH_PATH) as f:
		truth = json.load(f)

	for entry in tqdm(truth):
		try:
			if not 'FluentIterable' in entry['class_name']:
				method_res, raw_res = generate_results_for_method(entry['class_name'], entry['method_name'])

				results.append(method_res)
			else:
				print('sus fluentiterable')
		except:
			import traceback
			traceback.print_exc()
			excs.append(traceback.format_exc())

	print(excs)

	with open('../../data/results/single/memo_on_memo_new.json', 'w') as f:
		json.dump(results, f)