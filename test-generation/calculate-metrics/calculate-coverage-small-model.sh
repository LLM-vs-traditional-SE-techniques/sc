#!/bin/bash

JUNIT_CP="../generate-tests/CodeX/dependencies/junit-4.13.2.jar"
HAMCREST_CP="../generate-tests/CodeX/dependencies/hamcrest-core-1.3.jar"
LUCENE_CP="../generate-tests/CodeX/dependencies/lucene-core-7.2.0.jar"
JODA_TIME_CP="../generate-tests/CodeX/dependencies/joda-time-2.9.8.jar"
JAVAX_PERSISTENCE_API_CP="../generate-tests/CodeX/dependencies/javax.persistence-api-2.2.jar"
GWT_SERVLET_CP="../generate-tests/CodeX/dependencies/gwt-servlet-2.5.1.jar"
GWT_DEV_CP="../generate-tests/CodeX/dependencies/gwt-dev-2.5.1.jar"

declare -a Mode=("small_model")
declare -a Methods=("colt_1" "colt_2" "elasticsearch_1" "elasticsearch_2" "gwt_1" "gwt_2" "graphstream_1" "graphstream_2" "guava_1" "guava_2" "jdk_1" "jdk_2" "hibernate_1" "hibernate_2" "math_1" "math_2" "weka_1" "weka_2")
declare -a Prompts=("NL-description-and-similar-examples")
declare -a Examples=("8")

mkdir ./reports

for mode in ${Mode[@]}; do
    mkdir ./reports/$mode

    for method in ${Methods[@]}; do
        mkdir ./reports/$mode/$method

        for prompt in ${Prompts[@]}; do
            mkdir ./reports/$mode/$method/$prompt

            for n in ${Examples[@]}; do
                mkdir ./reports/$mode/$method/$prompt/$n"_examples"

                rm jacoco.exec
                if [ "$method" = "colt_1" ] || [ "$method" = "colt_2" ]; then
                    PROJECT_CP="../projects/colt.jar"
                    PROJECT_CP_="../projects/colt"
                    CLASS_CP="../projects/colt/cern/colt/matrix/impl/DenseDoubleMatrix1D.class"
                elif [ "$method" = "elasticsearch_1" ] || [ "$method" = "elasticsearch_2" ]; then
                    PROJECT_CP="../projects/elasticsearch-6.1.1.jar"
                    PROJECT_CP_="../projects/elasticsearch-6.1.1"
                    CLASS_CP="../projects/elasticsearch-6.1.1/org/elasticsearch/action/index/IndexRequest.class"
                elif [ "$method" = "gwt_1" ] || [ "$method" = "gwt_2" ]; then
                    PROJECT_CP="../projects/gwt-user-2.5.1.jar"
                    PROJECT_CP_="../projects/gwt-user-2.5.1"
                    CLASS_CP="../projects/gwt-user-2.5.1/com/google/gwt/core/client/GWT.class"
                elif [ "$method" = "graphstream_1" ] || [ "$method" = "graphstream_2" ]; then
                    PROJECT_CP="../projects/gs-core-1.3.jar"
                    PROJECT_CP_="../projects/gs-core-1.3"
                    CLASS_CP="../projects/gs-core-1.3/org/graphstream/graph/Path.class"
                elif [ "$method" = "guava_1" ] || [ "$method" = "guava_2" ]; then
                    PROJECT_CP="../projects/guava-19.0.jar"
                    PROJECT_CP_="../projects/guava-19.0"
                    CLASS_CP="../projects/guava-19.0/com/google/common/hash/HashCode.class"
                elif [ "$method" = "jdk_1" ] || [ "$method" = "jdk_2" ]; then
                    PROJECT_CP="../projects/jdk8-3.3.0.jar"
                    PROJECT_CP_="../projects/jdk8-3.3.0"
                    CLASS_CP="../projects/jdk/java/util/ArrayList.class"
                elif [ "$method" = "hibernate_1" ] || [ "$method" = "hibernate_2" ]; then
                    PROJECT_CP="../projects/hibernate-core-5.4.2.Final.jar"
                    PROJECT_CP_="../projects/hibernate-core-5.4.2.Final"
                    CLASS_CP="../projects/hibernate-core-5.4.2.Final/org/hibernate/type/descriptor/java/BooleanTypeDescriptor.class"
                elif [ "$method" = "math_1" ] || [ "$method" = "math_2" ]; then
                    PROJECT_CP="../projects/commons-math3-3.6.1.jar"
                    PROJECT_CP_="../projects/commons-math3-3.6.1"
                    CLASS_CP="../projects/commons-math3-3.6.1/org/apache/commons/math3/geometry/euclidean/oned/Vector1D.class"
                elif [ "$method" = "weka_1" ] || [ "$method" = "weka_2" ]; then
                    PROJECT_CP="../projects/weka-stable-3.8.0.jar"
                    PROJECT_CP_="../projects/weka-stable-3.8.0"
                    CLASS_CP="../projects/weka-stable-3.8.0/weka/core/AlgVector.class"
                fi

                INSTRUMENTED_CLASS_CP="projects/$method/instrumented"
                TESTS_CP="../generate-tests/CodeX/generated-tests/$mode/$method/$prompt/$n"_examples"/compilable"
                TESTS_CP_=$TESTS_CP"/*.java"

                # Instrumenting
                java -jar jacococli.jar instrument $CLASS_CP --dest $INSTRUMENTED_CLASS_CP 

                # Compiling Tests
                javac -cp $JUNIT_CP:$PROJECT_CP:$HAMCREST_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_DEV_CP:$GWT_SERVLET_CP $TESTS_CP_

                # Get names of test classes
                TEST_CLASSES=$(find $TESTS_CP -type f -name "*.java")
                COMPILED_TEST_CLASSES=""
                for FILE in ${TEST_CLASSES[@]}; do
                    readarray -d / -t strarr <<< "$FILE"
                    PARTIAL_NAME=${strarr[9]}
                    readarray -d . -t strarr <<< "$PARTIAL_NAME"
                    COMPILED_TEST_CLASSES="$COMPILED_TEST_CLASSES ${strarr[0]}"
                    echo $COMPILED_TEST_CLASSES
                done

                # Running Tests
                java -cp jacocoagent.jar:$INSTRUMENTED_CLASS_CP:$PROJECT_CP_:$TESTS_CP:$JUNIT_CP:$HAMCREST_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_DEV_CP:$GWT_SERVLET_CP \
                    -javaagent:jacocoagent.jar org.junit.runner.JUnitCore $COMPILED_TEST_CLASSES

                # Reporting
                java -jar jacococli.jar report jacoco.exec \
                --classfiles $CLASS_CP --csv ./reports/$mode/$method/$prompt/$n"_examples"/$method".csv" --xml ./reports/$mode/$method/$prompt/$n"_examples"/$method".xml"
            done
        done
    done
done
