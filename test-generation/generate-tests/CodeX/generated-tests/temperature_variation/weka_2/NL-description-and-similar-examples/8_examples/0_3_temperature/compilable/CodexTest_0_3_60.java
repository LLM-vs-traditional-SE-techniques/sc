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


public class CodexTest_0_3_60 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
			AlgVector v = new AlgVector(data);
			try {
				Instance inst = v.getAsInstance(null, null);
				assertEquals("Instance length differs", data.length, inst.numAttributes());
				for (int i = 0; i < data.length; i++)
					assertEquals((i+1) + ". value differs", data[i], inst.value(i));
			} catch (Exception e) {
				fail("Exception: " + e.getMessage());
			}
		}
}