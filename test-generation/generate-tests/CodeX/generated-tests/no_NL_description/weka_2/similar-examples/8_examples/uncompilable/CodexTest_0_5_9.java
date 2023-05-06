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


public class CodexTest_0_5_9 { 
    @Test
    public void testGetAsInstance() {
		double[] data = {2.3, 1.2, 5.0};
		Instances model = createModel();
		AlgVector v = new AlgVector(data);
		try {
			Instance inst = v.getAsInstance(model, new Random(1));
			assertEquals("Number of attributes differs", model.numAttributes(), inst.numAttributes());
			assertEquals("1. attribute differs", 1.0, inst.value(0), 1e-15);
			assertEquals("2. attribute differs", 2.0, inst.value(1), 1e-15);
			assertEquals("3. attribute differs", 3.0, inst.value(2), 1e-15);
			assertEquals("4. attribute differs", 0.0, inst.value(3), 1e-15);
			assertEquals("5. attribute differs", 1.0, inst.value(4), 1e-15);
		} catch (Exception e) {
			fail("Exception occured: " + e);
		}
	}
}