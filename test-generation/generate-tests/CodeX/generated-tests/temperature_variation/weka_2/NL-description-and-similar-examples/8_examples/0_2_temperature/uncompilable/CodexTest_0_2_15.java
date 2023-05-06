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


public class CodexTest_0_2_15 { 
  @Test
    public void testGetAsInstance() {
		double[] data = {2.3, 1.2, 5.0};
		AlgVector v = new AlgVector(data);
		Instances model = new Instances(new BufferedReader(new StringReader(
				"@relation test\n" + "@attribute a numeric\n"
						+ "@attribute b numeric\n" + "@attribute c numeric\n"
						+ "@data\n" + "1.0,2.0,3.0\n" + "4.0,5.0,6.0\n"
						+ "7.0,8.0,9.0\n")));
		try {
			Instance inst = v.getAsInstance(model, new Random(1));
			assertEquals("Number of attributes differ", model.numAttributes(),
					inst.numAttributes());
			assertEquals("Number of values differ", model.numAttributes(),
					inst.numValues());
			assertEquals("Dataset differs", model, inst.dataset());
			assertEquals("Value differs", 2.3, inst.value(0), 1e-15);
			assertEquals("Value differs", 1.2, inst.value(1), 1e-15);
			assertEquals("Value differs", 5.0, inst.value(2), 1e-15);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
}