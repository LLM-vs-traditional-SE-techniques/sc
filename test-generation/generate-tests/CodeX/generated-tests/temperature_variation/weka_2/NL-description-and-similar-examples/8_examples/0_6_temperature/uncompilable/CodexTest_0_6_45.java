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


public class CodexTest_0_6_45 { 
  @Test
   public void testGetAsInstance() {
		// create a vector
		double[] data = {2.3, 1.2, 5.0};
		AlgVector v = new AlgVector(data);
		// create an Instances object
		Instances dataSet = null;
		try {
			dataSet = v.getAsInstances("test");
		} catch (Exception e) {
			e.printStackTrace();
			fail("Exception thrown: " + e.getMessage());
		}
		// check it
		assertEquals("Number of attributes differs", v.numElements(), dataSet.numAttributes());
		for (int i = 0; i < v.numElements(); i++) {
			assertEquals("Attribute " + (i+1) + " differs", data[i], dataSet.instance(0).value(i));
		}
		assertEquals("Number of instances differs", 1, dataSet.numInstances());
	}
}