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


public class CodexTest_0_3_31 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {1.0, 2.0, 3.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new FastVector(), 0);
			model.insertAttributeAt(new Attribute("A"), 0);
			model.insertAttributeAt(new Attribute("B"), 1);
			model.insertAttributeAt(new Attribute("C"), 2);
			try {
				Instance inst = v.getAsInstance(model, new Random());
				assertEquals(3, inst.numAttributes());
				assertEquals(1.0, inst.value(0), 1e-6);
				assertEquals(2.0, inst.value(1), 1e-6);
				assertEquals(3.0, inst.value(2), 1e-6);
			} catch (Exception ex) {
				fail("Exception thrown: " + ex.getMessage());
			}
		}
}