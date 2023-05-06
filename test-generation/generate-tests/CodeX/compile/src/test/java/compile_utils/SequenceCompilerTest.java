package compile_utils;

import org.junit.Assert;
import org.junit.Test;

import javax.tools.DiagnosticCollector;
import javax.tools.JavaFileObject;
import java.util.StringJoiner;

public class SequenceCompilerTest {

    @Test
    public void fooBar() {
        SequenceCompiler seqCompiler = new SequenceCompiler();
        String packageName = "foo";
        String className = "Bar";
        String source = "public class Bar {}";
        Assert.assertTrue(seqCompiler.isCompilable(packageName, className, source));
    }

    @Test
    public void badFooBar() {
        SequenceCompiler seqCompiler = new SequenceCompiler();
        String packageName = "foo";
        String className = "Bar";
        String source = "public class Bar {"; // missing closing brace
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();

        // check that it indeed fails to compile
        Assert.assertFalse(seqCompiler.isCompilable(packageName, className, source, diagnostics));
        StringJoiner joiner = SequenceCompiler.getStringJoiner(diagnostics);

        // check the compilation error message. may be useful for debugging.
        Assert.assertTrue(joiner.toString().contains("reached end of file while parsing"));
    }

}
