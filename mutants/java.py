import jpype
from jpype.types import *

# To be able to use JavaParser, we need jpype and consequently we need to start the JVM with the required libraries.
jpype.startJVM(classpath=[
    'artifacts/guava-30.1-jre.jar',
    'artifacts/failureaccess-1.0.1.jar',
    'artifacts/javaparser-core-3.24.0.jar'
])

import jpype.imports
from com.github.javaparser import StaticJavaParser as parser
