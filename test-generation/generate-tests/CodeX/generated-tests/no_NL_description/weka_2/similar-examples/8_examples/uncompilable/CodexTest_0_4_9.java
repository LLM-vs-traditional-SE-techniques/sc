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


public class CodexTest_0_4_9 { 
  @Test
    public void testGetAsInstance() {
			double[] values = {1.0, 2.0, 3.0};
			AlgVector v = new AlgVector(values);
			
			Random random = new Random(1);
			Instance inst = v.getAsInstance(m_Instances, random);
			assertEquals("Number of attributes differs", 
				     m_Instances.numAttributes(), inst.numAttributes());
			for (int i = 0; i < m_Instances.numAttributes(); i++) {
				Attribute att = m_Instances.attribute(i);
				if (att.isNumeric()) {
					assertEquals("Value differs", values[i], inst.value(i), 1e-6);
				} else if (att.isNominal()) {
					assertEquals("Value differs", 1, (int) inst.value(i));
				}
			}
		}
}