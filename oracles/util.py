import numpy as np
from functools import cached_property
from scipy.optimize import linear_sum_assignment
from collections import defaultdict

def find(iterable, predicate):
    return next((x for x in iterable if predicate(x)), None)

def group_by(func, elements):
    groups = defaultdict(list)
    
    for el in elements:
        result = func(el)
        groups[result].append(el)
        
    return groups

def precision(tp, fp, fn):
    if tp + fp == 0:
        return 0
    return tp / (tp + fp)

def recall(tp, fp, fn):
    if tp + fn == 0:
        return 0
    return tp / (tp + fn)

def f1(tp, fp, fn):
    return tp / (tp + 0.5 * (fp + fn))

class LazyWrapper:

    def __init__(self, wrappee_init):
        self._wrappee_init = wrappee_init

    @cached_property
    def _wrappee(self):
        return self._wrappee_init()

    def __getattr__(self, attr):
        return getattr(self._wrappee, attr)
    
    def __call__(self, *args, **kwargs):
        return self._wrappee(*args, **kwargs)

def lazify(init_func):
    return LazyWrapper(init_func)

def report_basic_statistics(results):
    failing = results[results.error.notna()]
    error_count = failing.shape[0]
    missed_due_to_error = failing[failing.fn > 0].shape[0]

    print(f'{error_count} errors in total. That means {missed_due_to_error} oracles were missed.')

    total_tp = results.tp.sum()
    total_fp = results.fp.sum()
    total_fn = results.fn.sum()
    print(f'Precision: {precision(total_tp, total_fp, total_fn)}')
    print(f'Recall: {recall(total_tp, total_fp, total_fn)}')
    print(f'F1: {f1(total_tp, total_fp, total_fn)}')

    print('And now for just prediction of existence')
    total_tp = results.exist_tp.sum()
    total_fp = results.exist_fp.sum()
    total_fn = results.exist_fn.sum()
    print(f'Precision: {precision(total_tp, total_fp, total_fn)}')
    print(f'Recall: {recall(total_tp, total_fp, total_fn)}')
    print(f'F1: {f1(total_tp, total_fp, total_fn)}')