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


public class CodexTest_0_2_6 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Random r = new Random(1);
			try {
				Instance inst = v.getAsInstance(m_Instances, r);
				assertEquals("Number of attributes differs", m_Instances.numAttributes(), inst.numAttributes());
				assertEquals("Number of values differs", m_Instances.numAttributes(), inst.numValues());
				for (int i = 0; i < m_Instances.numAttributes(); i++) {
					if (m_Instances.attribute(i).isNumeric()) {
						assertEquals("Value differs", data[i], inst.value(i), 0.0);
					} else {
						assertTrue("Value is not nominal", inst.isMissing(i) || inst.isNominal(i));
					}
				}
			} catch (Exception e) {
				fail("Exception thrown: " + e);
			}
		}
}