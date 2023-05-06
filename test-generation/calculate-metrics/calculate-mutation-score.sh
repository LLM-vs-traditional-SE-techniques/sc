#!/bin/bash

JUNIT_CP="../generate-tests/CodeX/dependencies/junit-4.13.2.jar"
HAMCREST_CP="../generate-tests/CodeX/dependencies/hamcrest-core-1.3.jar"
HAMCREST_CP_="../generate-tests/CodeX/dependencies/hamcrest-2.2.jar"
LUCENE_CP="../generate-tests/CodeX/dependencies/lucene-core-7.2.0.jar"
JODA_TIME_CP="../generate-tests/CodeX/dependencies/joda-time-2.9.8.jar"
JAVAX_PERSISTENCE_API_CP="../generate-tests/CodeX/dependencies/javax.persistence-api-2.2.jar"
GWT_SERVLET_CP="../generate-tests/CodeX/dependencies/gwt-servlet-2.5.1.jar"
GWT_DEV_CP="../generate-tests/CodeX/dependencies/gwt-dev-2.5.1.jar"
JAVA_CUP="../generate-tests/CodeX/dependencies/java-cup.jar"

########################################################################################################################

###################################################### COMMONS MATH ########################################################

MATH_CP="../projects/commons-math3-3.6.1.jar"

MATH_TESTS_CP="../projects_/commons-math-MATH_3_6_1/src/test"
MATH_TESTS_CP_=$(find $MATH_TESTS_CP -type f -name "*.java")

# # Compiling Tests
# javac -cp $JUNIT_CP:$HAMCREST_CP:$MATH_CP $MATH_TESTS_CP_

# Get names of test classes
TEST_CLASSES=$(find $MATH_TESTS_CP -type f -name "*Test.java")
COMPILED_TEST_CLASSES=""
for FILE in ${TEST_CLASSES[@]}; do
   read PARTIAL_NAME <<< "org/${FILE##*/org/}"
   TEST_CLASS_NAME=$(echo $PARTIAL_NAME | sed 's|\/|.|g')
   TEST_CLASS_NAME=$(echo "${TEST_CLASS_NAME::-5}")
   COMPILED_TEST_CLASSES="$COMPILED_TEST_CLASSES $TEST_CLASS_NAME"
done

# Running Tests
java -cp ../projects/commons-math3-3.6.1:../projects_/commons-math-MATH_3_6_1/src/test/java:../projects_/commons-math-MATH_3_6_1/src/test/resources:$MATH_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
   org.junit.runner.JUnitCore $COMPILED_TEST_CLASSES

# # Tests run: 6943,  Failures: 547

########################################################################################################################

###################################################### ELASTICSEARCH ########################################################
# Compilation problems

# ELASTICSEARCH_CP="../projects/elasticsearch-6.1.1.jar"

# ELASTICSEARCH_TESTS_CP="../projects_/elasticsearch-6.1/core/src/test/java/org/elasticsearch"
# ELASTICSEARCH_TESTS_CP_=$(find $ELASTICSEARCH_TESTS_CP -type f -name "*.java")

# # Compiling Tests
# javac -cp $JUNIT_CP:$HAMCREST_CP:$LUCENE_CP:$ELASTICSEARCH_CP:$HAMCREST_CP_ $ELASTICSEARCH_TESTS_CP_

# Get names of test classes
#TEST_CLASSES=$(find $ELASTICSEARCH_1_TESTS_CP -type f -name "*.java")
#COMPILED_TEST_CLASSES=""
#for FILE in ${TEST_CLASSES[@]}; do
#    readarray -d / -t strarr <<< "$FILE"
#    PARTIAL_NAME=${strarr[9]}
#    readarray -d . -t strarr <<< "$PARTIAL_NAME"
#    COMPILED_TEST_CLASSES="$COMPILED_TEST_CLASSES org.elasticsearch.action.index.${strarr[0]}"
#done

# Running Tests
#java -cp jacocoagent.jar:$ELASTICSEARCH_1_INSTRUMENTED_CLASS_CP:../projects/elasticsearch-6.1.1:$ELASTICSEARCH_1_TESTS_CP:../generate-tests/EvoSuite/generated-tests/elasticsearch_1/:$JUNIT_CP:$HAMCREST_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$EVOSUITE_RUNTIME \
#    -javaagent:jacocoagent.jar org.junit.runner.JUnitCore $COMPILED_TEST_CLASSES

# Reporting
#java -jar jacococli.jar report ./jacoco.exec \
#   --classfiles $ELASTICSEARCH_1_CLASS_CP --csv ./reports/evosuite/elasticsearch_1.csv --xml ./reports/evosuite/elasticsearch_1.xml

########################################################################################################################

###################################################### GWT ########################################################

# GWT_CP="../projects/gwt-user-2.5.1.jar"

# # --------------------------- GWT_1 -----------------------------
# GWT_TESTS_CP="../projects_/gwt-master/user/test"
# GWT_TESTS_CP_=$(find $GWT_TESTS_CP -type f -name "*.java")

# # Compiling Tests
# javac -cp $JUNIT_CP:$GWT_SERVLET_CP:$GWT_DEV_CP:$HAMCREST_CP:$JAVAX_PERSISTENCE_API_CP:$LUCENE_CP:$JODA_TIME_CP:$GWT_CP $GWT_TESTS_CP_

# Get names of test classes
# TEST_CLASSES=$(find $GWT_1_TESTS_CP -type f -name "*.java")
# COMPILED_TEST_CLASSES=""
# for FILE in ${TEST_CLASSES[@]}; do
#    readarray -d / -t strarr <<< "$FILE"
#    PARTIAL_NAME=${strarr[10]}
#    readarray -d . -t strarr <<< "$PARTIAL_NAME"
#    COMPILED_TEST_CLASSES="$COMPILED_TEST_CLASSES com.google.gwt.core.client.${strarr[0]}"
# done

# Running Tests
# java -cp jacocoagent.jar:$GWT_1_INSTRUMENTED_CLASS_CP:../projects/gwt-user-2.5.1:$GWT_1_TESTS_CP:$JUNIT_CP:$HAMCREST_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_DEV_CP:$GWT_SERVLET_CP:../generate-tests/EvoSuite/generated-tests/gwt_1/:$EVOSUITE_RUNTIME\
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore $COMPILED_TEST_CLASSES

########################################################################################################################

###################################################### HIBERNATE ########################################################

# HIBERNATE_CP="../projects/hibernate-core-5.4.2.Final.jar"

# rm jacoco.exec
# --------------------------- HIBERNATE 1 -----------------------------
# HIBERNATE_1_CLASS_CP="../projects/hibernate-core-5.4.2.Final/org/hibernate/type/descriptor/java/BooleanTypeDescriptor.class"
# HIBERNATE_1_INSTRUMENTED_CLASS_CP="./projects/hibernate_1/instrumented"
# HIBERNATE_1_TESTS_CP="../generate-tests/EvoSuite/generated-tests/hibernate_1/org/hibernate/type/descriptor/java"
# HIBERNATE_1_TESTS_CP_=$HIBERNATE_1_TESTS_CP"/*.java"

# Instrumenting
# java -jar jacococli.jar instrument $HIBERNATE_1_CLASS_CP --dest $HIBERNATE_1_INSTRUMENTED_CLASS_CP 

# Compiling Tests
# javac -cp $JUNIT_CP:$HIBERNATE_CP:$EVOSUITE_RUNTIME:$HAMCREST_CP $HIBERNATE_1_TESTS_CP_

# Get names of test classes
# TEST_CLASSES=$(find $HIBERNATE_1_TESTS_CP -type f -name "*.java")
# COMPILED_TEST_CLASSES=""
# for FILE in ${TEST_CLASSES[@]}; do
#    readarray -d / -t strarr <<< "$FILE"
#    PARTIAL_NAME=${strarr[10]}
#    readarray -d . -t strarr <<< "$PARTIAL_NAME"
#    COMPILED_TEST_CLASSES="$COMPILED_TEST_CLASSES org.hibernate.type.descriptor.java.${strarr[0]}"
# done

# Running Tests
# java -cp jacocoagent.jar:$HIBERNATE_1_INSTRUMENTED_CLASS_CP:../projects/hibernate-core-5.4.2.Final:$HIBERNATE_1_TESTS_CP:$JUNIT_CP:$HAMCREST_CP:$JAVAX_PERSISTENCE_API_CP:$EVOSUITE_RUNTIME:../generate-tests/EvoSuite/generated-tests/hibernate_1 \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore $COMPILED_TEST_CLASSES

########################################################################################################################

###################################################### JDK ########################################################

# rm jacoco.exec
# # --------------------------- JDK 1 -----------------------------
# JDK_1_CLASS_CP="../projects/jdk/java/util/ArrayList.class"
# JDK_1_INSTRUMENTED_CLASS_CP="./projects/jdk_1/instrumented"
# JDK_1_TESTS_CP="../generate-tests/Randoop/generated-tests/jdk_1"
# JDK_1_TESTS_CP_=$JDK_1_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli-0.8.8.jar instrument $JDK_1_CLASS_CP --dest $JDK_1_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP $JDK_1_TESTS_CP_

# # Running Tests
# java -cp jacocoagent-0.8.8.jar:$JDK_1_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
#     -javaagent:jacocoagent-0.8.8.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
# java -jar jacococli-0.8.8.jar report ./jacoco.exec \
#   --classfiles $JDK_1_CLASS_CP --csv ./reports/randoop/jdk_1.csv --xml ./reports/randoop/jdk_1.xml

########################################################################################################################

###################################################### WEKA ########################################################

# WEKA_CP="../projects/weka-stable-3.8.0.jar"

# WEKA_TESTS_CP="../projects_/weka-master/weka/src/test/java"
# WEKA_TESTS_CP_=$(find $WEKA_TESTS_CP -type f -name "*.java")

# # Compiling Tests
# #javac -cp $JUNIT_CP:$HAMCREST_CP:$JAVA_CUP:$WEKA_CP $WEKA_TESTS_CP_

# # Get names of test classes
# TEST_CLASSES=$(find $WEKA_TESTS_CP -type f -name "*Test.java")
# COMPILED_TEST_CLASSES=""
# for FILE in ${TEST_CLASSES[@]}; do
#    echo $FILE
#    read PARTIAL_NAME <<< "weka/${FILE##*/org/}"
#    TEST_CLASS_NAME=$(echo $PARTIAL_NAME | sed 's|\/|.|g')
#    TEST_CLASS_NAME=$(echo "${TEST_CLASS_NAME::-5}")
#    COMPILED_TEST_CLASSES="$COMPILED_TEST_CLASSES $TEST_CLASS_NAME"
# done

# echo $COMPILED_TEST_CLASSES

# Running Tests
#java -cp jacocoagent.jar:../projects/weka-stable-3.8.0:$WEKA_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
 #  org.junit.runner.JUnitCore $COMPILED_TEST_CLASSES
