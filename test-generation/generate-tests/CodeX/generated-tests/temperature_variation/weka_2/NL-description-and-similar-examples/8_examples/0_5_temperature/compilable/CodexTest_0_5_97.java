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


public class CodexTest_0_5_97 { 
  @Test
    public void testGetAsInstance() {
		AlgVector v = new AlgVector(new double[]{1,2,3,4});
		Random r = new Random();
		try {
			Instance inst = v.getAsInstance(null, r);
			assertNotNull(inst);
			assertEquals(4, inst.numAttributes());
			assertEquals(0, inst.classIndex());
			for (int i = 0; i < v.numElements(); i++)
				assertEquals((i+1) + ". value differs", v.getElement(i), inst.value(i));
		}
		catch (Exception e) {
			fail("Exception thrown: " + e.getMessage());
		}
	}

}