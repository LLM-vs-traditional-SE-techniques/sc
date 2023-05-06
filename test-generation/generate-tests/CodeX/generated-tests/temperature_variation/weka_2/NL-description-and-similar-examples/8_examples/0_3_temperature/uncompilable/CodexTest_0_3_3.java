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


public class CodexTest_0_3_3 { 
  @Test
    public void testGetAsInstance() {
		double[] data = {1, 2, 3};
		AlgVector v = new AlgVector(data);
		Instances model = new Instances(new FastVector(), 0);
		model.insertAttributeAt(new Attribute("a"), 0);
		model.insertAttributeAt(new Attribute("b"), 1);
		model.insertAttributeAt(new Attribute("c"), 2);
		try {
			Instance inst = v.getAsInstance(model, new Random(1));
			assertEquals("Wrong number of attributes", 3, inst.numAttributes());
			assertEquals("Wrong value for attribute a", 1.0, inst.value(0), 1e-6);
			assertEquals("Wrong value for attribute b", 2.0, inst.value(1), 1e-6);
			assertEquals("Wrong value for attribute c", 3.0, inst.value(2), 1e-6);
		} catch (Exception e) {
			fail("Exception thrown: " + e.getMessage());
		}
	}
}