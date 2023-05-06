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


public class CodexTest_0_6_9 { 
  @Test
    public void testGetAsInstanceNominalNumeric() throws Exception {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances dataset = makeTestDatasetNominalNumeric();
			Instance instance = v.getAsInstance(dataset, new Random(1));
			assertEquals("Number of attributes differ", dataset.numAttributes(), instance.numAttributes());
			assertEquals("Number of values differ", dataset.numAttributes(), instance.numValues());
			assertEquals("Number of weights differ", dataset.numAttributes(), instance.numWeights());
			assertEquals("Dataset is not set", dataset, instance.dataset());
			assertEquals("1. value differs", data[0], instance.value(0));
			assertEquals("2. value differs", data[1], instance.value(1));
			assertEquals("3. value differs", data[2], instance.value(2));
			assertEquals("4. value differs", 1.0, instance.value(3));
			assertEquals("5. value differs", 1.0, instance.value(4));
			assertEquals("1. weight differs", 1.0, instance.weight(0));
			assertEquals("2. weight differs", 1.0, instance.weight(1));
			assertEquals("3. weight differs", 1.0, instance.weight(2));
			assertEquals("4. weight differs", 1.0, instance.weight(3));
			assertEquals("5. weight differs", 1.0, instance.weight(4));
		}
}