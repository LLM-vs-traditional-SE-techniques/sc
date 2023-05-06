#!/bin/bash

mkdir ./generated-tests

declare -a StringArray=("NL-description-and-similar-examples")

for val in ${StringArray[@]}; do
	python3 generate-tests.py --prompt_type=$val --methods2test_path='../../methods2test/' --model="code-davinci-002"
done
