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


public class CodexTest_0_4_26 { 
  @Test
    public void testGetAsInstance() {
		Instances model = new Instances(new Instances(new BufferedReader(
				new StringReader(TEST_INSTANCES))));
		AlgVector v = new AlgVector(new double[] { 1.0, 2.0 });
		try {
			Instance i = v.getAsInstance(model, new Random());
			assertEquals("Number of attributes differ", model.numAttributes(),
					i.numAttributes());
			assertEquals("Number of classes differ", model.numClasses(), i
					.numClasses());
			assertEquals("Number of values differ", model.numValues(), i
					.numValues());
			assertEquals("Number of weights differ", model.numWeights(), i
					.numWeights());
			assertEquals("Weight differs", model.weight(), i.weight());
			assertEquals("Class index differs", model.classIndex(), i
					.classIndex());
			assertEquals("Class differs", model.classValue(), i.classValue());
			assertEquals("Class attribute differs", model.classAttribute(), i
					.classAttribute());
			assertEquals("Value differs", 1.0, i.value(0), 1e-6);
			assertEquals("Value differs", 2.0, i.value(1), 1e-6);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Exception thrown: " + e.getMessage());
		}
	}
}