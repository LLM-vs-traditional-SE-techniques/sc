#!/bin/bash

RANDOOP_CP="./randoop-4.3.0/randoop-all-4.3.0.jar"
LUCENE_CP="../CodeX/dependencies/lucene-core-7.2.0.jar"
JODA_TIME_CP="../CodeX/dependencies/joda-time-2.9.8.jar"
JAVAX_PERSISTENCE_API_CP="../CodeX/dependencies/javax.persistence-api-2.2.jar"
GWT_SERVLET_CP="../CodeX/dependencies/gwt-servlet-2.5.1.jar"
GWT_DEV_CP="../CodeX/dependencies/gwt-dev-2.5.1.jar"

COLT_CP="../../projects/colt.jar"
ELASTICSEARCH_CP="../../projects/elasticsearch-6.1.1.jar"
GRAPHSTREAM_CP="../../projects/gs-core-1.3.jar"
GUAVA_CP="../../projects/guava-19.0.jar"
GWT_CP="../../projects/gwt-user-2.5.1.jar"
HIBERNATE_CP="../../projects/hibernate-core-5.4.2.Final.jar"
MATH_CP="../../projects/commons-math3-3.6.1.jar"
WEKA_CP="../../projects/weka-stable-3.8.0.jar"

BASE_DIR="./generated-tests/"
mkdir $BASE_DIR

METHODS2TEST=$(find ./methods2test -type f -name "*.txt")

echo "Generating tests with Randoop:"
for FILE in ${METHODS2TEST[@]}; do
	echo $FILE

	# Get output_dir name
	readarray -d / -t strarr <<< "$FILE"
	PARTIAL_NAME=${strarr[2]}
	readarray -d . -t strarr <<< "$PARTIAL_NAME"
	OUTPUT_DIR=$BASE_DIR${strarr[0]}

	mkdir $OUTPUT_DIR

	# Generate tests
	java -classpath $RANDOOP_CP:$LUCENE_CP:$JODA_TIME_CP:$JAVAX_PERSISTENCE_API_CP:$GWT_SERVLET_CP:$GWT_DEV_CP:$COLT_CP:$ELASTICSEARCH_CP:$GRAPHSTREAM_CP:$GUAVA_CP:$GWT_CP:$HIBERNATE_CP:$MATH_CP:$WEKA_CP randoop.main.Main gentests \
		--methodlist=$FILE \
		--testsperfile=1 \
		--generated-limit=100 \
		--junit-output-dir=$OUTPUT_DIR;

done