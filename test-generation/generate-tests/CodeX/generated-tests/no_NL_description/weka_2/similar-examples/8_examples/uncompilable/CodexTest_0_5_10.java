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


public class CodexTest_0_5_10 { 
  @Test
    public void testGetAsInstance() {
			Instances data = makeTestDataset();
			AlgVector v = new AlgVector(new double[] {1.2, 2.3, 3.4});
			Instance inst = v.getAsInstance(data, new Random(1));
			assertEquals("Instance has wrong number of attributes.",
						 data.numAttributes(), inst.numAttributes());
			assertEquals("Instance has wrong number of values.",
						 data.numAttributes(), inst.numValues());
			assertEquals("Dataset of instance is not correct.",
						 data, inst.dataset());
			assertEquals("1. value differs", 1.2, inst.value(0), 1e-5);
			assertEquals("2. value differs", 2.3, inst.value(1), 1e-5);
			assertEquals("3. value differs", 3.4, inst.value(2), 1e-5);
		  }
}