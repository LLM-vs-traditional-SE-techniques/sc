import json

def union_results(results1, results2):
	unioned_oracles = pd.Series(union_oracles(oracles1, oracles2) for oracles1, oracles2 in zip(results1.oracles, results2.oracles))

	return results1.assign(oracles=unioned_oracles)

def intersect_results(results1, results2):
	unioned_oracles = pd.Series(intersect_oracles(oracles1, oracles2) for oracles1, oracles2 in zip(results1.oracles, results2.oracles))

	return results1.assign(oracles=unioned_oracles)

def union_oracles(oracles1, oracles2):
	oracles1_serialized = set(json.dumps(oracle) for oracle in oracles1)
	oracles2_serialized = set(json.dumps(oracle) for oracle in oracles2)

	return [json.loads(oracle) for oracle in x_oracles_serialized | y_oracles_serialized]

def intersect_oracles(oracles1, oracles2):
	oracles1_serialized = set(json.dumps(oracle) for oracle in oracles1)
	oracles2_serialized = set(json.dumps(oracle) for oracle in oracles2)

	return [json.loads(oracle) for oracle in x_oracles_serialized & y_oracles_serialized]
