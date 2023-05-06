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


public class CodexTest_0_7_2 { 
  @Test
    public void testGetAsInstance() {
		int numAttributes = 2;
		double[] values = { 1.0, 2.0 };
		AlgVector v = new AlgVector(values);
		try {
			Instances model = new Instances(new BufferedReader(new StringReader(
					"@RELATION test\n" + "@ATTRIBUTE a NUMERIC\n" + "@ATTRIBUTE b NUMERIC\n"
							+ "@DATA\n" + "1,2\n")));
			Instance inst = v.getAsInstance(model, new Random(1));
			assertEquals("# of attributes differs", numAttributes, inst.numAttributes());
			for (int i = 0; i < numAttributes; i++) {
				assertEquals("Attribute " + i + " differs", values[i - 1], inst.value(i));
			}
		} catch (Exception e) {
			fail("Exception thrown: " + e.getMessage());
		}
	}
```
}