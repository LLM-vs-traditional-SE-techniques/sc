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


public class CodexTest_0_3_7 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instance inst = v.getAsInstance(m_Instances, new Random(1));
			assertEquals("Number of attributes differs", m_Instances.numAttributes(), inst.numAttributes());
			assertEquals("1. value differs", data[0], inst.value(0), 1e-6);
			assertEquals("2. value differs", data[1], inst.value(1), 1e-6);
			assertEquals("3. value differs", data[2], inst.value(2), 1e-6);
			assertEquals("4. value differs", 0, inst.value(3), 1e-6);
			assertEquals("5. value differs", 0, inst.value(4), 1e-6);
		  }
}