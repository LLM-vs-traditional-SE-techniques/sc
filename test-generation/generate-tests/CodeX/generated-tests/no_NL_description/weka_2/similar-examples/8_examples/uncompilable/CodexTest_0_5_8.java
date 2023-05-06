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


public class CodexTest_0_5_8 { 
  @Test
    public void testGetAsInstance() throws Exception {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Random random = new Random(1);
			Instance inst = v.getAsInstance(m_Instances, random);
			assertEquals("Length differs", m_Instances.numAttributes(), inst.numAttributes());
			assertEquals("1. value differs", data[0], inst.value(0));
			assertEquals("2. value differs", data[1], inst.value(1));
			assertEquals("3. value differs", data[2], inst.value(2));
			assertEquals("4. value differs", 1, (int) inst.value(3));
			assertEquals("5. value differs", 0, (int) inst.value(4));
		}

}