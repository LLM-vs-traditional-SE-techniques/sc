#!/bin/bash

LUCENE_CP="../CodeX/dependencies/lucene-core-7.2.0.jar"
JODA_TIME_CP="../CodeX/dependencies/joda-time-2.9.8.jar"
JAVAX_PERSISTENCE_API_CP="../CodeX/dependencies/javax.persistence-api-2.2.jar"
GWT_SERVLET_CP="../CodeX/dependencies/gwt-servlet-2.5.1.jar"
GWT_DEV_CP="../CodeX/dependencies/gwt-dev-2.5.1.jar"
JACKSON_CORE_CP="../CodeX/dependencies/jackson-core-2.13.3.jar"

JACKSON_DATABIND_CP="../CodeX/dependencies/jackson-databind-2.13.3.jar"
JACKSON_ANNOTATIONS_CP="../CodeX/dependencies/jackson-annotations-2.13.3.jar"
JACKSON_DATAFORMAT_SMILE_CP="../CodeX/dependencies/jackson-dataformat-smile-2.13.3.jar"

COLT_CP="../../projects/colt.jar"
ELASTICSEARCH_CP="../../projects/elasticsearch-6.1.1.jar"
GRAPHSTREAM_CP="../../projects/gs-core-1.3.jar"
GUAVA_CP="../../projects/guava-19.0.jar"
GWT_CP="../../projects/gwt-user-2.5.1.jar"
HIBERNATE_CP="../../projects/hibernate-core-5.4.2.Final.jar"
MATH_CP="../../projects/commons-math3-3.6.1.jar"
WEKA_CP="../../projects/weka-stable-3.8.0.jar"

JDK_CP="../../projects/jdk/java/util"

BASE_DIR="./generated-tests/"
mkdir $BASE_DIR

echo "Generating tests with EvoSuite:"

#java -jar evosuite-1.2.0.jar -help
#echo "------------------------------------------------------------"
#java -jar evosuite-1.2.0.jar -listParameters

##################################### COLT ###############################################################
java -jar evosuite-1.2.0.jar -Dtarget_method_list="assign(Lcern/colt/matrix/DoubleMatrix1D;)Lcern/colt/matrix/DoubleMatrix1D;:DenseDoubleMatrix1D(I)" -class cern.colt.matrix.impl.DenseDoubleMatrix1D -projectCP $COLT_CP -generateSuite -Dtest_dir=$BASE_DIR"colt_1" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

java -jar evosuite-1.2.0.jar -Dtarget_method_list="like2D(II)Lcern/colt/matrix/DoubleMatrix2D;:DenseDoubleMatrix1D(I)" -class cern.colt.matrix.impl.DenseDoubleMatrix1D -projectCP $COLT_CP -generateSuite -Dtest_dir=$BASE_DIR"colt_2" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

##################################### ELASTICSEARCH #####################################################
#java -jar evosuite-1.2.0.jar -Dtarget_method_list="parent()Ljava/lang/String;:IndexRequest()" -class org.elasticsearch.action.index.IndexRequest -projectCP $ELASTICSEARCH_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP:$JACKSON_CORE_CP:$JACKSON_DATABIND_CP:$JACKSON_ANNOTATIONS_CP:$JACKSON_DATAFORMAT_SMILE_CP -generateSuite -Dtest_dir=$BASE_DIR"elasticsearch_1" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

#java -jar evosuite-1.2.0.jar -Dtarget_method_list="source(Ljava/util/Map;Lorg/elasticsearch/common/xcontent/XContentType;)Lorg/elasticsearch/action/index/IndexRequest;:IndexRequest():sourceAsMap()Ljava.util.Map<Ljava/lang/String;Ljava/lang/Object;>;" -class org.elasticsearch.action.index.IndexRequest -projectCP $ELASTICSEARCH_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP:$JACKSON_CORE_CP:$JACKSON_DATABIND_CP:$JACKSON_ANNOTATIONS_CP:$JACKSON_DATAFORMAT_SMILE_CP -generateSuite -Dtest_dir=$BASE_DIR"elasticsearch_2" -generateSuite -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

#################################### GWT ###############################################################
#java -jar evosuite-1.2.0.jar -Dtarget_method_list="isClient()Z:create(Ljava.lang.Class)Ljava.lang.Object;" -class com.google.gwt.core.client.GWT -projectCP $GWT_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"gwt_1" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

#java -jar evosuite-1.2.0.jar -Dtarget_method_list="getUncaughtExceptionHandler()Lcom.google.gwt.core.client.GWT.UncaughtExceptionHandler;" -class com.google.gwt.core.client.GWT -projectCP $GWT_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"gwt_2" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

#################################### Graphstream #######################################################
#java -jar evosuite-1.2.0.jar -Dtarget_method_list="contains(Lorg/graphstream/graph/Edge;)Z:Path():popEdge()Lorg/graphstream/graph/Edge;" -class org.graphstream.graph.Path -projectCP $GRAPHSTREAM_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"graphstream_1" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

#java -jar evosuite-1.2.0.jar -Dtarget_method_list="equals(Lorg/graphstream/graph/Path;)Z:Path()" -class org.graphstream.graph.Path -projectCP $GRAPHSTREAM_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"graphstream_2" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

################################### Guava ###############################################################
#java -jar evosuite-1.2.0.jar -Dtarget_method_list="fromLong(J)Lcom/google/common/hash/HashCode;:HashCode():padToLong()J" -class com.google.common.hash.HashCode -projectCP $GUAVA_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"guava_1" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

######################## Not generating ####################################################
#java -jar evosuite-1.2.0.jar -Dtarget_method_list="HashCode():asBytes()[B:asInt()I:writeBytesTo([BII)I" -class com.google.common.hash.HashCode -projectCP $GUAVA_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"guava_2" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

################################## HIBERNATE ############################################################
#java -jar evosuite-1.2.0.jar -Dtarget_method_list="toShort(Ljava/lang/Boolean;)Ljava/lang/Short;:BooleanTypeDescriptor()" -class org.hibernate.type.descriptor.java.BooleanTypeDescriptor -projectCP $HIBERNATE_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"hibernate_1" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

#java -jar evosuite-1.2.0.jar -Dtarget_method_list="fromString(Ljava/lang/String;)Ljava/lang/Boolean;:BooleanTypeDescriptor()" -class org.hibernate.type.descriptor.java.BooleanTypeDescriptor -projectCP $HIBERNATE_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"hibernate_2" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

################################ JDK ####################################################################
#java -jar evosuite-1.2.0.jar -Dtarget_method_list="ArrayList():remove(I)Ljava/lang/Object;" -class newjdkname.ArrayList -projectCP ../../projects/jdkrepo:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"jdk_1" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

#java -jar evosuite-1.2.0.jar -Dtarget_method_list="ArrayList():contains(Ljava.lang.Object;)Z" -class newjdkname.ArrayList -projectCP ../../projects/jdkrepo:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"jdk_2" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

############################### MATH ####################################################################
#java -jar evosuite-1.2.0.jar -Dtarget_method_list="scalarMultiply(D)Lorg/apache/commons/math3/geometry/euclidean/oned/Vector1D;:Vector1D(D):getX()D" -class org.apache.commons.math3.geometry.euclidean.oned.Vector1D -projectCP $MATH_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"math_1" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

#java -jar evosuite-1.2.0.jar -Dtarget_method_list="distanceSq(Lorg/apache/commons/math3/geometry/euclidean/oned/Vector1D;Lorg/apache/commons/math3/geometry/euclidean/oned/Vector1D;)D:Vector1D(D):getX()D" -class org.apache.commons.math3.geometry.euclidean.oned.Vector1D -projectCP $MATH_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"math_2" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

############################## WEKA #####################################################################
#java -jar evosuite-1.2.0.jar -Dtarget_method_list="add(Lweka/core/AlgVector;)Lweka/core/AlgVector;:AlgVector(I):numElements()I" -class weka.core.AlgVector -projectCP $WEKA_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"weka_1" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE

#java -jar evosuite-1.2.0.jar -Dtarget_method_list="getAsInstance(Lweka/core/Instances;Ljava/util/Random;)Lweka/core/Instance;:AlgVector(I):numElements()I" -class weka.core.AlgVector -projectCP $WEKA_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP -generateSuite -Dtest_dir=$BASE_DIR"weka_2" -Duse_separate_classloader=false -Doutput_granularity=TESTCASE
