import re
import os
import json
import glob
from typing import *
from tqdm import tqdm
from translation.context import CodeContext
from parsing.java import parser, type_solver
from translation.misc import contextualize_node
from base.code_dictionary import CodeDictionary

import jpype.imports

from com.github.javaparser.ast.expr import *
from com.github.javaparser.symbolsolver.resolution.typesolvers import ReflectionTypeSolver, JavaParserTypeSolver
from com.github.javaparser.symbolsolver import JavaSymbolSolver

memo_path = '../data/memo'

type_solver.add(ReflectionTypeSolver())
type_solver.add(JavaParserTypeSolver('./data/src'))

code_dict = CodeDictionary('./data/src', lazy=True)

def remove_parens(expr):
	if isinstance(expr, EnclosedExpr):
		return remove_parens(expr.getInner())

	return expr

def replace_argument_references(expr, argument_names):
	access_exprs = expr.findAll(ArrayAccessExpr)

	for access_expr in access_exprs:
		name = str(access_expr.getName())

		if name != 'args':
			continue

		try:
			index = int(str(access_expr.getIndex()))
		except ValueError:
			continue

		access_expr.replace(NameExpr(argument_names[index]))

def replace_special_references(expr, method):
	name_exprs = expr.findAll(NameExpr)

	for name_expr in name_exprs:
		name = str(name_expr.getName())

		if name == 'receiverObjectClone' or name == 'receiverObjectID':
			name_expr.replace(ThisExpr())

		if name == 'methodResultID':
			self_call = MethodCallExpr(None, method.base_name)

			for parameter_name in method.params.keys():
				self_call.addArgument(parameter_name)

			name_expr.replace(self_call)

def extract_oracle_parts(expr):
	if isinstance(expr, MethodCallExpr) and str(expr.getName()) == 'equals':
		if len(expr.getArguments()) == 2:
			return expr.getArguments()[0], expr.getArguments()[1]
		
		if len(expr.getArguments()) == 1:
			return expr.getScope().get(), expr.getArguments()[0]

	if isinstance(expr, BinaryExpr) and expr.getOperator() == BinaryExpr.Operator.EQUALS:
		return expr.getLeft(), expr.getRight()

	raise RuntimeError(f'Unexpected expression {str(expr)} passed for part extraction')

def translate_to_entry(method_desc):
	oracles = []

	condition = method_desc['equivalence']['condition']

	param_name_matches = re.findall(' (\w+)(,|\\))', method_desc['signature'])
	param_names = [name for name, seperator in param_name_matches]

	cleaned_sig = re.sub(' \w+\\)', ')', re.sub('(?<!extends) \w+,', ',', method_desc['signature'])).replace('$', '.')

	class_name = method_desc['containingClass']['qualifiedName']

	method = code_dict.find_method(class_name, cleaned_sig)
	if method is not None:
		code_context = CodeContext(code_dict, method)

		if condition != '':
			preliminary_result = translate_oracle(condition, method, code_context)

			# If this is true, most likely there is a top level &&, so lets try it by splitting that
			if preliminary_result is None:
				oracles.extend([translate_oracle(candidate, method, code_context) for candidate in condition.split('&&')])
			else:
				oracles.append(preliminary_result)

			def replace_none(oracle):
				if oracle is not None:
					return oracle

				# We translate something not translatable to our format i.e. statements etc. to this oracle.
				# This should affect MeMo if it is able to correctly translate
				return { 'condition': 'true', 'entities': ['un', 'translatable'] }

			oracles = list(map(replace_none, oracles))
	else:
		print('Could not find', class_name, cleaned_sig)

	entry = {
		'class_name': class_name,
		'method_name': cleaned_sig,
		'oracles': oracles
	}

	return entry

def translate_oracle(oracle, method, code_context):
	oracle = oracle.replace('#', '.')

	param_names = list(method.params.keys())

	this, other, condition = None, None, 'true'

	if oracle.startswith('if('):
		condition_regex = r'if\((.+?)\) {(.+?)}'
		match = re.search(condition_regex, oracle)

		if match is not None:
			condition, body = match.groups()

			oracle = re.sub(condition_regex, lambda match: 'methodResultID.equals(' + match.groups()[1].split(';')[0] + ')', oracle)

	# If equals[ is in the oracle that means it uses MeMos expanded java syntax that includes inline statements (inside the brackets)
	if '.equals[' in oracle:
		equals_regex = r'\.equals\[(.+)\]'
		match = re.search(equals_regex, oracle)

		if match is not None:
			# TODO: For loop etc
			oracle = re.sub(equals_regex, lambda match: '.equals(' + match.groups()[0].split(';')[0] + ')', oracle)

	# If there is a ;, then (most likely) the oracle is of the form A; B; A.equals(B) (however sometimes for some reason it is also just A; B.equals(A))
	if ';' in oracle:
		exprs = oracle.split(';')

		if len(exprs) == 3 or len(exprs) == 4:
			oracle = exprs[0] + '.equals(' + exprs[1] + ')'

		elif len(exprs) == 2:
			self_call = MethodCallExpr(None, method.base_name)

			for parameter_name in method.params.keys():
				self_call.addArgument(parameter_name)

			oracle = str(self_call) + '.equals(' + exprs[0] + ')'

	condition = condition.replace('.iterator().hasNext()', '.spliterator().getExactSizeIfKnown() != 0')

	try:
		oracle_expr = parser.parseExpression(oracle)
		condition_expr = parser.parseExpression(condition)
		replace_argument_references(oracle_expr, param_names)
		replace_special_references(oracle_expr, method)

		replace_argument_references(condition_expr, param_names)
		replace_special_references(condition_expr, method)

		this, other = extract_oracle_parts(oracle_expr)
		try:
			this = contextualize_node(remove_parens(this), code_context)
			other = contextualize_node(remove_parens(other), code_context)
			condition = remove_parens(condition_expr)
		except:
			#print('Failed to contextualize')
			pass
	except:
		import traceback
		#traceback.print_exc()
		print('Relevant method', method.class_name.name, method.name)
		print('Failed to process', oracle)
		return None

	return {
		'condition': str(condition),
		'entities': [str(this), str(other)]
	}

def memo_goal_format_to_our_format(memo_goal) -> List[object]:
	oracle_ground_truth_entries = []

	for method_desc in memo_goal:
		has_oracle = method_desc['equivalence']['condition'] != ''

		try:
			oracle_ground_truth_entries.append(translate_to_entry(method_desc))
		except:
			import traceback
			traceback.print_exc()

	return oracle_ground_truth_entries

if __name__ == '__main__':
	x = []
	for ground_truth_file in tqdm(glob.glob(os.path.join(memo_path, '*/*.json'))):
		with open(ground_truth_file, 'r') as f:
			memo_goal = json.load(f)
			kek = memo_goal_format_to_our_format(memo_goal)
			x.extend(kek)

	with open('truth.json', 'w') as f:
		json.dump(x, f, indent=4)