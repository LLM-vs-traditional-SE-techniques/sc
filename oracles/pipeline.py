import time
import random
import pandas as pd
from box import Box
from tqdm import tqdm
from base.code_dictionary import CodeDictionary
from parsing.java import type_solver
from pprint import pprint
import dataclasses

import jpype.imports

from com.github.javaparser.symbolsolver.resolution.typesolvers import ReflectionTypeSolver, JavaParserTypeSolver
from com.github.javaparser.symbolsolver import JavaSymbolSolver

class ApproachPipeline:

    def __init__(self, code_path, random_seed = 42):
        random.seed(random_seed)

        type_solver.add(ReflectionTypeSolver())
        type_solver.add(JavaParserTypeSolver(code_path))

        self.code_dict = CodeDictionary(code_path, lazy=True)
        
    def evaluate_approach(self, ground_truth, predicted_truth = None):
        """
        Main method to evaluate the approach against a dataframe of ground truth data.
        A dataframe is returned that contains information about tp, fp and fn, timing information, errors, etc.
        """
        data_points = []
        for _, row in tqdm(ground_truth.iterrows(), total=ground_truth.shape[0]):
            class_name, method_sig, actual_oracles = row.class_name, row.method_name, row.oracles

            tp = 0
            fp = 0
            fn = 0

            exist_tp = 0
            exist_fp = 0
            exist_fn = 0

            oracle_count = 0
            entity_count = 0
            translation_miss_count = 0
            serialized_oracles = []

            setup_time = 0
            entity_extraction_time = 0
            oracle_detection_time = 0

            error = None
            comment = ''

            try:
                relevant_truth_entry = predicted_truth[(predicted_truth.class_name == class_name) & (predicted_truth.method_name == method_sig)].iloc[0]
                oracles = relevant_truth_entry.oracles

                translation_miss_count = 0
                entity_count = 0


                # Make sure the actual oracles are sorted
                actual_oracles = [{ 'condition': oracle['condition'], 'entities': sorted(oracle['entities']) } for oracle in actual_oracles]

                # The predicted ones should be too
                oracles = [{ 'condition': oracle['condition'], 'entities': sorted(oracle['entities']) } for oracle in oracles]

                # Remove false conditions
                actual_oracles = [oracle for oracle in actual_oracles if oracle['condition'] != 'false']


                # Evaluate jsut how good the existence prediction is
                pred_has_oracles = len(oracles) > 0
                actual_has_oracles = len(actual_oracles) > 0
                if pred_has_oracles and not actual_has_oracles:
                    exist_fp += 1
                elif not pred_has_oracles and actual_has_oracles:
                    exist_fn += 1
                elif pred_has_oracles and actual_has_oracles:
                    exist_tp += 1


                # For every oracle we check if it is present in the ground truth
                for oracle in oracles:
                    if oracle['condition'] == 'false':
                        continue

                    if oracle in actual_oracles:
                        tp += 1
                    else:
                        #print(class_name, method_sig, oracles, actual_oracles)
                        fp += 1
                    
                    serialized_oracles.append(oracle)

                oracle_count = len(oracles)

                fn += len(actual_oracles) - tp

            except BaseException as e:
                import sys
                import traceback
                print(class_name, method_sig, e, file=sys.stderr)

                error = traceback.format_exc()
                print(error)

                fn += len(actual_oracles)

            data_points.append({
                'class_name': class_name,
                'method_name': method_sig,
                'comment': comment,
                'oracles': serialized_oracles,
                'oracle_count': oracle_count,
                'entity_count': entity_count,
                'translation_miss_count': translation_miss_count,
                'error': error,
                'tp': tp,
                'fp': fp,
                'fn': fn,
                'exist_tp': exist_tp,
                'exist_fp': exist_fp,
                'exist_fn': exist_fn,
                'setup_time': setup_time,
                'entity_extraction_time': entity_extraction_time,
                'oracle_detection_time': oracle_detection_time,
                'time': setup_time + entity_extraction_time + oracle_detection_time
            })

        return pd.DataFrame(data_points)
