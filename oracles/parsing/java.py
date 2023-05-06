import jpype
import jpype.imports
from jpype.types import *

# To be able to use JavaParser, we need jpype and consequently we need to start the JVM with the required libraries.
jpype.startJVM(classpath=[
    'parsing/guava-30.1-jre.jar',
    'parsing/failureaccess-1.0.1.jar',
    'parsing/javaparser-core-3.22.1.jar',
    'parsing/javaparser-symbol-solver-core-3.22.1.jar'
])

from com.github.javaparser import StaticJavaParser as parser
from com.github.javaparser.symbolsolver.resolution.typesolvers import CombinedTypeSolver, JavaParserTypeSolver, ReflectionTypeSolver
from com.github.javaparser.symbolsolver import JavaSymbolSolver

type_solver = CombinedTypeSolver()
symbol_solver = JavaSymbolSolver(type_solver)

parser.getConfiguration().setSymbolResolver(symbol_solver)
