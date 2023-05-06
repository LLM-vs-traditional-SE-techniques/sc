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


public class CodexTest_0_6_7 { 
  @Test
    public void testGetAsInstance() {
		double[] data = {3.5, 1.2, 5.0};
		AlgVector v = new AlgVector(data);
		Instance instance = v.getAsInstance(m_Instances, null);
		assertEquals("Length differs", data.length, instance.numAttributes());
		for (int i = 0; i < data.length; i++)
			assertEquals(data[i], instance.value(i), 0.0);
	}
}