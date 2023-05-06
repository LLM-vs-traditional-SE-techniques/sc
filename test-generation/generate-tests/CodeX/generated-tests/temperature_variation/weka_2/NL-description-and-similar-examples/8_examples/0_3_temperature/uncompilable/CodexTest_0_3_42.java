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


public class CodexTest_0_3_42 { 
  @Test
    public void testGetAsInstance() {
		AlgVector v = new AlgVector(new double[] {2.0, 3.0, 4.0});
		try {
			Instances inst = new Instances(new BufferedReader(new StringReader(
					"@RELATION test\n" + "@ATTRIBUTE a NUMERIC\n"
							+ "@ATTRIBUTE b NUMERIC\n" + "@ATTRIBUTE c NUMERIC\n"
							+ "@DATA\n" + "1.0,2.0,3.0\n" + "4.0,5.0,6.0\n")));
			Instance inst2 = v.getAsInstance(inst, new Random(1));
			assertEquals("Number of attributes differs", 3, inst2.numAttributes());
			assertEquals("1. value differs", 2.0, inst2.value(0), 1e-6);
			assertEquals("2. value differs", 3.0, inst2.value(1), 1e-6);
			assertEquals("3. value differs", 4.0, inst2.value(2), 1e-6);
		} catch (Exception e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}
}