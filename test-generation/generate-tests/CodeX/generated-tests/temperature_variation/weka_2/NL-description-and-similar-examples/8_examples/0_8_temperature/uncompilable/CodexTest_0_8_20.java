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


public class CodexTest_0_8_20 { 
  @Test
    public void testGetAsInstance() throws Exception {
			Instances dataset = new Instances(new StringReader("A,B,C\n" +
					"1, 2, 3\n" +
					"4, 5, 6\n"));
			double[] values = {1, 2, 3};
			AlgVector vector = new AlgVector(values);
			Instance inst = vector.getAsInstance(dataset, new Random(1));
			assertNotNull(inst);
			assertEquals("Wrong number of attributes", dataset.numAttributes(), inst.numAttributes());
			for (int i = 0; i < values.length; i++) {
			  assertEquals("Wrong value for attribute " + i + !, (int) values[i], (int) inst.value(i));
			}
			for (int i = values.length; i < dataset.numAttributes(); i++) {
			  assertEquals("Wrong value for attribute " + i + !, 0, (int) inst.value(i));
			}
		}
    public void testGetAsInstanceIncompatibleTypes() throws Exception {
			Instances dataset = new Instances(new StringReader("A,B,C\n" +
					"nom-a, 2, 3\n" +
					"nom-b, 5, 6\n"));
			dataset.setClassIndex(0);
			double[] values = {1, 2, 3};
			AlgVector vector = new AlgVector(values);
			try {
			  vector.getAsInstance(dataset, new Random(1));
			  fail("Should have got an exception");
			} catch (Exception ex) {
			  // all fine
			}
		}
}