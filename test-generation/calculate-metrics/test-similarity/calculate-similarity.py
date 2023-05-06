"""
Runs edit distance calculations on all the generated data for a particular configuration.
The data created is a map from project to a tuple with 3 elements:
- list of maximum simlarities for all Codex-generated testcases for that project
- list of lengths (in characters) for all Codex-generated testcases for that project
- list of pairs of (Codex-generated test case body, extracted test case body with
   maximum similarity) for all Codex-generated testcases for that project. 
"""
import os
import sys
import pickle
import editdistance
import pandas as pd
import matplotlib.pyplot as plt

from typing import Dict, List
from itertools import cycle

lines = ["-", "--", "-.", ":"]
linecycler = cycle(lines)

def plot_cumulative_similarities(max_sim_list: List[float], proj_name=""):
    cumulative_sims = []
    sims_under_current = 0
    last_sim = 0
    for max_sim in max_sim_list:
        if max_sim > last_sim:
            cumulative_sims.append((last_sim, sims_under_current))
            last_sim = max_sim
        sims_under_current += 1
    if proj_name == "":
        plt.plot(
            [cs[0] for cs in cumulative_sims],
            [cs[1] / sims_under_current for cs in cumulative_sims],
        )
    else:
        plt.plot(
            [cs[0] for cs in cumulative_sims],
            [cs[1] / sims_under_current for cs in cumulative_sims],
            label=proj_name,
            linestyle=next(linecycler),
        )
    bot, top = plt.ylim()
    plt.ylim((0, top))
    ax = plt.gca()

    from matplotlib.ticker import PercentFormatter

    ax.yaxis.set_major_formatter(PercentFormatter(1))

def calculate_distance(reference_tests_path, generated_tests_path):
    # Collect each test case.
    # Compare to all the harvested testcsaes.
    max_sim_list = []
    len_list = []
    test_case_pairs = []

    generated_tests = pd.read_csv(generated_tests_path)
    for index, row in generated_tests.iterrows():
        print(row)
        generated_test_case = row[0]
        max_sim = 0
        samest_test_case = "<NONE>"
        print(reference_tests_path)
        reference_tests = pd.read_csv(reference_tests_path)
        for index_, row_ in reference_tests.iterrows():
            reference_test_case = row_[0]
            distance = editdistance.distance(generated_test_case, reference_test_case)
            max_len = max(len(generated_test_case), len(reference_test_case))
            norm_distance = distance / max_len
            test_sim = 1 - norm_distance
            if test_sim > max_sim:
                max_sim = test_sim
                samest_test_case = reference_test_case

        if max_sim >= 1.2:
            print(
                f"============================\n{generated_test_case}\n    >>>> IS MOST SIMILAR TO (sim = {max_sim}) <<<<\n{samest_test_case}"
            )
        if max_sim == 1:
            print(
                f"=======EXACTLY COPIED TEST CASE=======\n{generated_test_case}"
            )
        max_sim_list.append(max_sim)
        len_list.append(len(generated_test_case))
        test_case_pairs.append((generated_test_case, samest_test_case))

    return max_sim_list, len_list, test_case_pairs


if __name__ == "__main__":

    projects_tests_files = os.listdir('./projects-tests-')
    generated_tests = './model_tests.csv'

    all_data_to_pickle = {}

    styled_projects_names = {
        'commons': 'Commons Math',
        'colt': 'Colt',
        'elasticsearch': 'ElasticSearch',
        'gs': 'GraphStream',
        'guava': 'Guava',
        'gwt': 'GWT',
        'hibernate': 'Hibernate',
        'jdk': 'JDK',
        'weka': 'Weka'
    }

    for project_test_file in projects_tests_files:
        all_similarities = []
        all_sim_len = 0
        all_lens = []
        all_pairs = []
        print(project_test_file, " processing...")
        
        ret_sims, ret_lens, pairs = calculate_distance(f'./projects-tests-/{project_test_file}', generated_tests)
        all_similarities.extend(ret_sims)
        all_lens.extend(ret_lens)
        all_pairs.extend(pairs)
        all_sim_len += len(ret_sims)
        assert len(all_similarities) == all_sim_len
        sorted_similarities = sorted(all_similarities)
        print(all_sim_len)

        proj_name = project_test_file.split("-")[0]
        plot_cumulative_similarities(sorted_similarities, proj_name)
        all_data_to_pickle[styled_projects_names[proj_name]] = (all_similarities, all_lens, all_pairs)

    output_file = 'similarities-.pkl'
    pickle_file = open(output_file, "wb")
    pickle.dump(all_data_to_pickle, pickle_file)
    pickle_file.close()

