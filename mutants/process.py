import json
import logging
from abc import ABC, abstractmethod

class BatchProcessor(ABC):

    def __init__(self, *args, max_process_n=None, max_prepostprocess_n=-1, parallel_preprocessing=False, parallel_postprocessing=False, **kwargs):
        self.max_process_n = max_process_n
        self.max_prepostprocess_n = max_prepostprocess_n
        self.parallel_preprocessing = parallel_preprocessing
        self.parallel_postprocessing = parallel_postprocessing
        self.args = args
        self.kwargs = kwargs

    def preprocess(self, x):
        return x

    @abstractmethod
    def process_many(self, xs):
        pass

    def postprocess(self, x):
        return x

    def run(self, x, *args, **kwargs):
        return self.run_many([x], *args, **kwargs)

    def run_many(self, xs, *args, show_progress=False, **kwargs):
        from tqdm import tqdm
        import joblib

        if show_progress:
            xs = tqdm(xs, desc='Preprocessing')

        if self.parallel_preprocessing:
            xs = joblib.Parallel(n_jobs=self.max_prepostprocess_n)(joblib.delayed(self.preprocess)(x) for x in xs)
        else:
            xs = [self.preprocess(x) for x in xs]

        if self.max_process_n is None:
            results = self.process_many(xs, *self.args, *args, **self.kwargs, **kwargs)
        else:
            remaining_tasks = xs
            results = []

            if show_progress:
                total_task_count = len(remaining_tasks)
                pbar = tqdm(total=total_task_count, desc='Processing')

            while len(remaining_tasks) > 0:
                tasks_to_process_now, remaining_tasks = remaining_tasks[:self.max_process_n], remaining_tasks[self.max_process_n:]

                some_results = list(self.process_many(tasks_to_process_now, *self.args, *args, **self.kwargs, **kwargs))

                results.extend(some_results)

                if show_progress:
                    pbar.update(len(some_results))

            if show_progress:
                pbar.close()

        if show_progress:
            results = tqdm(results, desc='Postprocessing')

        if self.parallel_postprocessing:
            results = joblib.Parallel(n_jobs=self.max_prepostprocess_n)(joblib.delayed(self.postprocess)(x) for x in results)
        else:
            results = [self.postprocess(x) for x in results]

        return results



class OpenAIProcessor(BatchProcessor):
    import backoff
    from openai.error import RateLimitError

    def __init__(self, model='text-davinci-003', temperature=0, max_tokens=125, top_p=1, frequency_penalty=0, presence_penalty=0, stop=['\n\n'], **kwargs):
        super().__init__(**kwargs)
        self.model = model
        self.temperature = temperature
        self.max_tokens = max_tokens
        self.top_p = top_p
        self.frequency_penalty = frequency_penalty
        self.presence_penalty = presence_penalty
        self.stop = stop

    @backoff.on_exception(backoff.expo, RateLimitError)
    def process_many(self, prompts):
        import openai
        from openai.error import InvalidRequestError
        try:
            response = openai.Completion.create(
                engine=self.model,
                prompt=prompts,
                temperature=self.temperature,
                max_tokens=self.max_tokens,
                top_p=self.top_p,
                frequency_penalty=self.frequency_penalty,
                presence_penalty=self.presence_penalty,
                stop=self.stop
            )
        except InvalidRequestError:
            logging.error('Failed OpenAI request: >>>' + json.dumps(dict(req=dict(
                engine=self.model,
                prompt=prompts,
                temperature=self.temperature,
                max_tokens=self.max_tokens,
                top_p=self.top_p,
                frequency_penalty=self.frequency_penalty,
                presence_penalty=self.presence_penalty,
                stop=self.stop
            )))+ '<<<')
            return len(prompts) * ['<FAILED>']

        req = dict(
            engine=self.model,
            prompt=prompts,
            temperature=self.temperature,
            max_tokens=self.max_tokens,
            top_p=self.top_p,
            frequency_penalty=self.frequency_penalty,
            presence_penalty=self.presence_penalty,
            stop=self.stop
        )

        logging.info(f'Successful OpenAI request: >>>{json.dumps(dict(req=req, response=response))}<<<')

        completions = [choice.text for choice in response.choices]

        return completions
