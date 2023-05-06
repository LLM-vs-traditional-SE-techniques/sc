import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_1 { 
  @Test
    public void testGetAsInstance() throws Exception {
			AlgVector v = new AlgVector(new double[] { 1.0, 2.0, 3.0 });
			Instances model = new Instances(new BufferedReader(new StringReader(
					"@RELATION test\n" + "@ATTRIBUTE a NUMERIC\n"
							+ "@ATTRIBUTE b NUMERIC\n" + "@ATTRIBUTE c NUMERIC\n"
							+ "@DATA\n" + "1,2,3\n")));
			Instance inst = v.getAsInstance(model, new Random(1));
			assertEquals("a", 1.0, inst.value(0), 0.0);
			assertEquals("b", 2.0, inst.value(1), 0.0);
			assertEquals("c", 3.0, inst.value(2), 0.0);
		}
}