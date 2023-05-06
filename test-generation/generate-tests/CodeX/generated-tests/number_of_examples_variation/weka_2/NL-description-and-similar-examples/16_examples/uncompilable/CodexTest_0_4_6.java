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


public class CodexTest_0_4_6 { 
  @Test
    public void testGetAsInstance() {
			int numAttributes = 2;
			int numInstances = 4;
			double[] values = { 1, 2, 3, 4 };
			DenseDoubleMatrix1D v = new DenseDoubleMatrix1D(values);
			ArrayList<Attribute> attributes = new ArrayList<Attribute>();
			for (int i = 0; i < numAttributes; i++) {
				attributes.add(new Attribute("" + (char) (97 + i)));
			}
			Instances dataset = new Instances("test", attributes, numInstances);
			Random random = new Random(1);
			try {
				Instance inst = v.getAsInstance(dataset, random);
				assertEquals(numAttributes, inst.numAttributes());
				assertEquals(numInstances, inst.numInstances());
				assertEquals(1.0, inst.value(0), 0.0);
				assertEquals(2.0, inst.value(1), 0.0);
			} catch (Exception e) {
				e.printStackTrace();
				fail("Exception occurred: " + e.getMessage());
			}
		}
}