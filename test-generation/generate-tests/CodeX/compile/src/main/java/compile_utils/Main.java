package compile_utils;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.tools.DiagnosticCollector;
import javax.tools.JavaFileObject;
import java.util.StringJoiner;

public class Main {

	public static void main(String[] args) throws IOException {
        String packageName = args[0];
        String className = args[1];
        String source = args[2];

        String outputPath = args[3];

		SequenceCompiler seqCompiler = new SequenceCompiler();
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();

        if (seqCompiler.isCompilable(packageName, className, source, diagnostics)){
        	outputPath += "compilable/" + className + ".java";
        }
        else {
            // Save reasons on log file
            Path destPathLog = Paths.get(outputPath + "uncompilable/" + className + "_log.txt");
            PrintWriter printerLog = new PrintWriter(new FileOutputStream(destPathLog.toFile()));
            StringJoiner joiner = SequenceCompiler.getStringJoiner(diagnostics);
            printerLog.append(joiner.toString());
            printerLog.flush();

        	outputPath += "uncompilable/" + className + ".java";
        }

        // save test
        Path destPath = Paths.get(outputPath);
        PrintWriter printer = new PrintWriter(new FileOutputStream(destPath.toFile()));

        printer.append(source);  
        printer.flush();

	}
}