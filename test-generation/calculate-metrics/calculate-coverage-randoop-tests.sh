#!/bin/bash

JUNIT_CP="../generate-tests/CodeX/dependencies/junit-4.13.2.jar"
HAMCREST_CP="../generate-tests/CodeX/dependencies/hamcrest-core-1.3.jar"
LUCENE_CP="../generate-tests/CodeX/dependencies/lucene-core-7.2.0.jar"
JODA_TIME_CP="../generate-tests/CodeX/dependencies/joda-time-2.9.8.jar"
JAVAX_PERSISTENCE_API_CP="../generate-tests/CodeX/dependencies/javax.persistence-api-2.2.jar"
GWT_SERVLET_CP="../generate-tests/CodeX/dependencies/gwt-servlet-2.5.1.jar"
GWT_DEV_CP="../generate-tests/CodeX/dependencies/gwt-dev-2.5.1.jar"

mkdir ./reports
mkdir ./reports/randoop

########################################################################################################################

###################################################### COLT ########################################################

COLT_CP="../projects/colt.jar"

rm jacoco.exec
# # --------------------------- COLT_1 -----------------------------
COLT_1_CLASS_CP="../projects/colt/cern/colt/matrix/impl/DenseDoubleMatrix1D.class"
COLT_1_INSTRUMENTED_CLASS_CP="./projects/colt_1/instrumented"
COLT_1_TESTS_CP="../generate-tests/Randoop/generated-tests/colt_1"
COLT_1_TESTS_CP_=$COLT_1_TESTS_CP"/*.java"

# # Instrumenting
java -jar jacococli.jar instrument $COLT_1_CLASS_CP --dest $COLT_1_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
javac -cp $JUNIT_CP:$COLT_CP $COLT_1_TESTS_CP_

# # Running Tests
java -cp jacocoagent.jar:$COLT_1_INSTRUMENTED_CLASS_CP:$COLT_CP:$COLT_1_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest ErrorTest

# # Reporting
java -jar jacococli.jar report ./jacoco.exec \
   --classfiles $COLT_1_CLASS_CP --csv ./reports/randoop/colt_1.csv --xml ./reports/randoop/colt_1.xml

rm jacoco.exec
# # --------------------------- COLT_2 -----------------------------
COLT_2_CLASS_CP="../projects/colt/cern/colt/matrix/impl/DenseDoubleMatrix1D.class"
COLT_2_INSTRUMENTED_CLASS_CP="./projects/colt_2/instrumented"
COLT_2_TESTS_CP="../generate-tests/Randoop/generated-tests/colt_2"
COLT_2_TESTS_CP_=$COLT_2_TESTS_CP"/*.java"

# # Instrumenting
java -jar jacococli.jar instrument $COLT_2_CLASS_CP --dest $COLT_2_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
javac -cp $JUNIT_CP:$COLT_CP $COLT_2_TESTS_CP_

# # Running Tests
java -cp jacocoagent.jar:$COLT_2_INSTRUMENTED_CLASS_CP:$COLT_CP:$COLT_2_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
java -jar jacococli.jar report ./jacoco.exec \
   --classfiles $COLT_2_CLASS_CP --csv ./reports/randoop/colt_2.csv --xml ./reports/randoop/colt_2.xml

########################################################################################################################

###################################################### ELASTICSEARCH ########################################################

# ELASTICSEARCH_CP="../projects/elasticsearch-6.1.1.jar"

# rm jacoco.exec
# # --------------------------- ELASTICSEARCH_1 -----------------------------
# ELASTICSEARCH_1_CLASS_CP="../projects/elasticsearch-6.1.1/org/elasticsearch/action/index/IndexRequest.class"
# ELASTICSEARCH_1_INSTRUMENTED_CLASS_CP="./projects/elasticsearch_1/instrumented"
# ELASTICSEARCH_1_TESTS_CP="../generate-tests/Randoop/generated-tests/elasticsearch_1"
# ELASTICSEARCH_1_TESTS_CP_=$ELASTICSEARCH_1_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $ELASTICSEARCH_1_CLASS_CP --dest $ELASTICSEARCH_1_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$ELASTICSEARCH_CP $ELASTICSEARCH_1_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$ELASTICSEARCH_1_INSTRUMENTED_CLASS_CP:../projects/elasticsearch-6.1.1:$ELASTICSEARCH_1_TESTS_CP:$JUNIT_CP:$HAMCREST_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
#   --classfiles $ELASTICSEARCH_1_CLASS_CP --csv ./reports/randoop/elasticsearch_1.csv --xml ./reports/randoop/elasticsearch_1.xml

# rm jacoco.exec
# # --------------------------- ELASTICSEARCH_2 -----------------------------
# ELASTICSEARCH_2_CLASS_CP="../projects/elasticsearch-6.1.1/org/elasticsearch/action/index/IndexRequest.class"
# ELASTICSEARCH_2_INSTRUMENTED_CLASS_CP="./projects/elasticsearch_2/instrumented"
# ELASTICSEARCH_2_TESTS_CP="../generate-tests/Randoop/generated-tests/elasticsearch_2"
# ELASTICSEARCH_2_TESTS_CP_=$ELASTICSEARCH_2_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $ELASTICSEARCH_2_CLASS_CP --dest $ELASTICSEARCH_2_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$ELASTICSEARCH_CP $ELASTICSEARCH_2_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$ELASTICSEARCH_2_INSTRUMENTED_CLASS_CP:../projects/elasticsearch-6.1.1:$ELASTICSEARCH_2_TESTS_CP:$JUNIT_CP:$HAMCREST_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore ErrorTest RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
#   --classfiles $ELASTICSEARCH_2_CLASS_CP --csv ./reports/randoop/elasticsearch_2.csv --xml ./reports/randoop/elasticsearch_2.xml

########################################################################################################################

###################################################### GWT ########################################################

# GWT_CP="../projects/gwt-user-2.5.1.jar"

# rm jacoco.exec
# # --------------------------- GWT_1 -----------------------------
# GWT_1_CLASS_CP="../projects/gwt-user-2.5.1/com/google/gwt/core/client/GWT.class"
# GWT_1_INSTRUMENTED_CLASS_CP="./projects/gwt_1/instrumented"
# GWT_1_TESTS_CP="../generate-tests/Randoop/generated-tests/gwt_1"
# GWT_1_TESTS_CP_=$GWT_1_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $GWT_1_CLASS_CP --dest $GWT_1_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$GWT_CP $GWT_1_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$GWT_1_INSTRUMENTED_CLASS_CP:../projects/gwt-user-2.5.1:$GWT_1_TESTS_CP:$JUNIT_CP:$HAMCREST_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_DEV_CP:$GWT_SERVLET_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
#   --classfiles $GWT_1_CLASS_CP --csv ./reports/randoop/gwt_1.csv --xml ./reports/randoop/gwt_1.xml

# rm jacoco.exec
# # --------------------------- GWT_2 -----------------------------
# GWT_2_CLASS_CP="../projects/gwt-user-2.5.1/com/google/gwt/core/client/GWT.class"
# GWT_2_INSTRUMENTED_CLASS_CP="./projects/gwt_2/instrumented"
# GWT_2_TESTS_CP="../generate-tests/Randoop/generated-tests/gwt_2"
# GWT_2_TESTS_CP_=$GWT_2_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $GWT_2_CLASS_CP --dest $GWT_2_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$GWT_CP $GWT_2_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$GWT_2_INSTRUMENTED_CLASS_CP:../projects/gwt-user-2.5.1:$GWT_2_TESTS_CP:$JUNIT_CP:$HAMCREST_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_DEV_CP:$GWT_SERVLET_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
#   --classfiles $GWT_2_CLASS_CP --csv ./reports/randoop/gwt_2.csv --xml ./reports/randoop/gwt_2.xml

########################################################################################################################

###################################################### GRAPHSTREAM ########################################################

# GRAPHSTREAM_CP="../projects/gs-core-1.3.jar"

# rm jacoco.exec
# # --------------------------- GRAPHSTREAM_1 -----------------------------
# GRAPHSTREAM_1_CLASS_CP="../projects/gs-core-1.3/org/graphstream/graph/Path.class"
# GRAPHSTREAM_1_INSTRUMENTED_CLASS_CP="./projects/graphstream_1/instrumented"
# GRAPHSTREAM_1_TESTS_CP="../generate-tests/Randoop/generated-tests/graphstream_1"
# GRAPHSTREAM_1_TESTS_CP_=$GRAPHSTREAM_1_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $GRAPHSTREAM_1_CLASS_CP --dest $GRAPHSTREAM_1_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$GRAPHSTREAM_CP $GRAPHSTREAM_1_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$GRAPHSTREAM_1_INSTRUMENTED_CLASS_CP:../projects/gs-core-1.3:$GRAPHSTREAM_1_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
#   --classfiles $GRAPHSTREAM_1_CLASS_CP --csv ./reports/randoop/graphstream_1.csv --xml ./reports/randoop/graphstream_1.xml

# rm jacoco.exec
# # --------------------------- GRAPHSTREAM_2 -----------------------------
# GRAPHSTREAM_2_CLASS_CP="../projects/gs-core-1.3/org/graphstream/graph/Path.class"
# GRAPHSTREAM_2_INSTRUMENTED_CLASS_CP="./projects/graphstream_2/instrumented"
# GRAPHSTREAM_2_TESTS_CP="../generate-tests/Randoop/generated-tests/graphstream_2"
# GRAPHSTREAM_2_TESTS_CP_=$GRAPHSTREAM_2_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $GRAPHSTREAM_2_CLASS_CP --dest $GRAPHSTREAM_2_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$GRAPHSTREAM_CP $GRAPHSTREAM_2_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$GRAPHSTREAM_2_INSTRUMENTED_CLASS_CP:../projects/gs-core-1.3:$GRAPHSTREAM_2_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
#   --classfiles $GRAPHSTREAM_2_CLASS_CP --csv ./reports/randoop/graphstream_2.csv --xml ./reports/randoop/graphstream_2.xml

########################################################################################################################

###################################################### GUAVA ########################################################

GUAVA_CP="../projects/guava-19.0.jar"

# rm jacoco.exec
# # --------------------------- GUAVA 1 -----------------------------
# GUAVA_1_CLASS_CP="../projects/guava-19.0/com/google/common/hash/HashCode.class"
# GUAVA_1_INSTRUMENTED_CLASS_CP="./projects/guava_1/instrumented"
# GUAVA_1_TESTS_CP="../generate-tests/Randoop/generated-tests/guava_1"
# GUAVA_1_TESTS_CP_=$GUAVA_1_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $GUAVA_1_CLASS_CP --dest $GUAVA_1_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$GUAVA_CP $GUAVA_1_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$GUAVA_1_INSTRUMENTED_CLASS_CP:../projects/guava-19.0:$GUAVA_1_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
#   --classfiles $GUAVA_1_CLASS_CP --csv ./reports/randoop/guava_1.csv --xml ./reports/randoop/guava_1.xml

rm jacoco.exec
# # --------------------------- GUAVA 2 -----------------------------
GUAVA_2_CLASS_CP="../projects/guava-19.0/com/google/common/hash/HashCode.class"
GUAVA_2_INSTRUMENTED_CLASS_CP="./projects/guava_2/instrumented"
GUAVA_2_TESTS_CP="../generate-tests/Randoop/generated-tests/guava_2"
GUAVA_2_TESTS_CP_=$GUAVA_2_TESTS_CP"/*.java"

# # Instrumenting
java -jar jacococli.jar instrument $GUAVA_2_CLASS_CP --dest $GUAVA_2_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
javac -cp $JUNIT_CP:$GUAVA_CP $GUAVA_2_TESTS_CP_

# # Running Tests
java -cp jacocoagent.jar:$GUAVA_2_INSTRUMENTED_CLASS_CP:../projects/guava-19.0:$GUAVA_2_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
java -jar jacococli.jar report ./jacoco.exec \
   --classfiles $GUAVA_2_CLASS_CP --csv ./reports/randoop/guava_2.csv --xml ./reports/randoop/guava_2.xml

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

#rm jacoco.exec
# --------------------------- JDK 2 -----------------------------
#JDK_2_CLASS_CP="../projects/jdk/java/util/ArrayList.class"
#JDK_2_INSTRUMENTED_CLASS_CP="./projects/jdk_2/instrumented"
#JDK_2_TESTS_CP="../generate-tests/Randoop/generated-tests/jdk_2"
#JDK_2_TESTS_CP_=$JDK_2_TESTS_CP"/*.java"

# Instrumenting
#java -jar jacococli-0.8.8.jar instrument $JDK_2_CLASS_CP --dest $JDK_2_INSTRUMENTED_CLASS_CP 

# Compiling Tests
#javac -cp $JUNIT_CP $JDK_2_TESTS_CP_

# Running Tests
#java -cp jacocoagent-0.8.8.jar:$JDK_2_INSTRUMENTED_CLASS_CP:../projects/jdk:$JDK_2_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
 #   -javaagent:jacocoagent-0.8.8.jar org.junit.runner.JUnitCore RegressionTest

# Reporting
#java -jar jacococli-0.8.8.jar report ./jacoco.exec \
 # --classfiles $JDK_2_CLASS_CP --csv ./reports/randoop/jdk_2.csv --xml ./reports/randoop/jdk_2.xml

########################################################################################################################

###################################################### HIBERNATE ########################################################

# HIBERNATE_CP="../projects/hibernate-core-5.4.2.Final.jar"

# rm jacoco.exec
# # --------------------------- HIBERNATE 1 -----------------------------
# HIBERNATE_1_CLASS_CP="../projects/hibernate-core-5.4.2.Final/org/hibernate/type/descriptor/java/BooleanTypeDescriptor.class"
# HIBERNATE_1_INSTRUMENTED_CLASS_CP="./projects/hibernate_1/instrumented"
# HIBERNATE_1_TESTS_CP="../generate-tests/Randoop/generated-tests/hibernate_1"
# HIBERNATE_1_TESTS_CP_=$HIBERNATE_1_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $HIBERNATE_1_CLASS_CP --dest $HIBERNATE_1_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$HIBERNATE_CP $HIBERNATE_1_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$HIBERNATE_1_INSTRUMENTED_CLASS_CP:../projects/hibernate-core-5.4.2.Final:$HIBERNATE_1_TESTS_CP:$JUNIT_CP:$HAMCREST_CP:$JAVAX_PERSISTENCE_API_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
#   --classfiles $HIBERNATE_1_CLASS_CP --csv ./reports/randoop/hibernate_1.csv --xml ./reports/randoop/hibernate_1.xml

# rm jacoco.exec
# # --------------------------- HIBERNATE 2 -----------------------------
# HIBERNATE_2_CLASS_CP="../projects/hibernate-core-5.4.2.Final/org/hibernate/type/descriptor/java/BooleanTypeDescriptor.class"
# HIBERNATE_2_INSTRUMENTED_CLASS_CP="./projects/hibernate_2/instrumented"
# HIBERNATE_2_TESTS_CP="../generate-tests/Randoop/generated-tests/hibernate_2"
# HIBERNATE_2_TESTS_CP_=$HIBERNATE_2_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $HIBERNATE_2_CLASS_CP --dest $HIBERNATE_2_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$HIBERNATE_CP $HIBERNATE_2_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$HIBERNATE_2_INSTRUMENTED_CLASS_CP:../projects/hibernate-core-5.4.2.Final/:$HIBERNATE_2_TESTS_CP:$JUNIT_CP:$HAMCREST_CP:$JAVAX_PERSISTENCE_API_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
#   --classfiles $HIBERNATE_2_CLASS_CP --csv ./reports/randoop/hibernate_2.csv --xml ./reports/randoop/hibernate_2.xml

########################################################################################################################

###################################################### MATH ########################################################

# MATH_CP="../projects/commons-math3-3.6.1.jar"

# rm jacoco.exec
# # # --------------------------- MATH 1 -----------------------------
# MATH_1_CLASS_CP="../projects/commons-math3-3.6.1/org/apache/commons/math3/geometry/euclidean/oned/Vector1D.class"
# MATH_1_INSTRUMENTED_CLASS_CP="./projects/math_1/instrumented"
# MATH_1_TESTS_CP="../generate-tests/Randoop/generated-tests/math_1"
# MATH_1_TESTS_CP_=$MATH_1_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $MATH_1_CLASS_CP --dest $MATH_1_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$MATH_CP $MATH_1_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$MATH_1_INSTRUMENTED_CLASS_CP:../projects/commons-math3-3.6.1/classes:$MATH_1_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore ErrorTest RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
# 	--classfiles $MATH_1_CLASS_CP --csv ./reports/randoop/math_1.csv --xml ./reports/randoop/math_1.xml

# rm jacoco.exec
# # # --------------------------- MATH 2 -----------------------------
# MATH_2_CLASS_CP="../projects/commons-math3-3.6.1/org/apache/commons/math3/geometry/euclidean/oned/Vector1D.class"
# MATH_2_INSTRUMENTED_CLASS_CP="./projects/math_2/instrumented"
# MATH_2_TESTS_CP="../generate-tests/Randoop/generated-tests/math_2"
# MATH_2_TESTS_CP_=$MATH_2_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $MATH_2_CLASS_CP --dest $MATH_2_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$MATH_CP $MATH_2_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$MATH_2_INSTRUMENTED_CLASS_CP:../projects/commons-math3-3.6.1/classes:$MATH_2_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
#     --classfiles $MATH_2_CLASS_CP --csv ./reports/randoop/math_2.csv --xml ./reports/randoop/math_2.xml


########################################################################################################################

###################################################### WEKA ########################################################

# WEKA_CP="../projects/weka-stable-3.8.0.jar"

# rm jacoco.exec
# # # --------------------------- WEKA 1 -----------------------------
# WEKA_1_CLASS_CP="../projects/weka-stable-3.8.0/weka/core/AlgVector.class"
# WEKA_1_INSTRUMENTED_CLASS_CP="./projects/weka_1/instrumented"
# WEKA_1_TESTS_CP="../generate-tests/Randoop/generated-tests/weka_1"
# WEKA_1_TESTS_CP_=$WEKA_1_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $WEKA_1_CLASS_CP --dest $WEKA_1_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$WEKA_CP $WEKA_1_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$WEKA_1_INSTRUMENTED_CLASS_CP:../projects/weka-stable-3.8.0:$WEKA_1_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
#   --classfiles $WEKA_1_CLASS_CP --csv ./reports/randoop/weka_1.csv --xml ./reports/randoop/weka_1.xml

# rm jacoco.exec
# # # --------------------------- WEKA 2 -----------------------------
# WEKA_2_CLASS_CP="../projects/weka-stable-3.8.0/weka/core/AlgVector.class"
# WEKA_2_INSTRUMENTED_CLASS_CP="./projects/weka_2/instrumented"
# WEKA_2_TESTS_CP="../generate-tests/Randoop/generated-tests/weka_2"
# WEKA_2_TESTS_CP_=$WEKA_2_TESTS_CP"/*.java"

# # Instrumenting
# java -jar jacococli.jar instrument $WEKA_2_CLASS_CP --dest $WEKA_2_INSTRUMENTED_CLASS_CP 

# # Compiling Tests
# javac -cp $JUNIT_CP:$WEKA_CP $WEKA_2_TESTS_CP_

# # Running Tests
# java -cp jacocoagent.jar:$WEKA_2_INSTRUMENTED_CLASS_CP:../projects/weka-stable-3.8.0:$WEKA_2_TESTS_CP:$JUNIT_CP:$HAMCREST_CP \
#     -javaagent:jacocoagent.jar org.junit.runner.JUnitCore RegressionTest

# # Reporting
# java -jar jacococli.jar report ./jacoco.exec \
#   --classfiles $WEKA_2_CLASS_CP --csv ./reports/randoop/weka_2.csv --xml ./reports/randoop/weka_2.xml

