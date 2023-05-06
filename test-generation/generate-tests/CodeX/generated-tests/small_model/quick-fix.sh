#!/bin/bash

declare -a Methods=("colt_1" "colt_2" "elasticsearch_1" "elasticsearch_2" "gwt_1" "gwt_2" "graphstream_1" "graphstream_2" "guava_1" "guava_2" "jdk_1" "jdk_2" "hibernate_1" "hibernate_2" "math_1" "math_2" "weka_1" "weka_2")
declare -a Prompts=("NL-description-and-similar-examples")
declare -a Examples=("8")
declare -a Temperatures=("0_0" "0_1" "0_2" "0_3" "0_4" "0_5" "0_6" "0_7" "0_8" "0_9")

for method in ${Methods[@]}; do

    for prompt in ${Prompts[@]}; do

        for n in ${Examples[@]}; do
            cd $method/$prompt/$n"_examples"
            mkdir all
            mkdir compilable
            mkdir uncompilable

            for temperature in ${Temperatures[@]}; do
                cp $temperature"_temperature"/all/* ./all
                cp $temperature"_temperature"/compilable/* ./compilable
                cp $temperature"_temperature"/uncompilable/* ./uncompilable
                rm -rf $temperature"_temperature"
            done

            cd ..
            cd ..
            cd ..
        done
    done
done