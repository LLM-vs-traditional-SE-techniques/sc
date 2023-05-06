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


public class CodexTest_0_5_67 { 
  @Test
    public void testGetAsInstance() {
		Instances dataset = new Instances(new BufferedReader(
				new StringReader(InstancesTest.NOMINAL_DATA_SET)));
		AlgVector v = new AlgVector(new double[] { 0.0, 1.0, 2.0 });
		try {
			Instance inst = v.getAsInstance(dataset, new Random(42));
			assertEquals("Wrong number of attributes", dataset.numAttributes(), inst
					.numAttributes());
			assertEquals("Wrong number of classes", dataset.numClasses(), inst
					.numClasses());
			assertEquals("Wrong class value", inst.classValue(), 0.0);
			assertEquals("Wrong class attribute", inst.classAttribute(), dataset
					.classAttribute());
			assertEquals("Wrong value for attribute 0", inst.value(0), 0.0);
			assertEquals("Wrong value for attribute 1", inst.value(1), 1.0);
			assertEquals("Wrong value for attribute 2", inst.value(2), 2.0);
		} catch (Exception e) {
			fail("Exception thrown: " + e);
		}
	}
}