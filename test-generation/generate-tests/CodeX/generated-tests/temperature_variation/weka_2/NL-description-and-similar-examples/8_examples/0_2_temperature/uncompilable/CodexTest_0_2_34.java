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


public class CodexTest_0_2_34 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instance inst = v.getAsInstance(m_Instances, new Random(1));
			assertEquals("Number of attributes differs", m_Instances.numAttributes(), inst.numAttributes());
			assertEquals("Number of values differs", m_Instances.numAttributes(), inst.numValues());
			assertEquals("Dataset differs", m_Instances, inst.dataset());
			for (int i = 0; i < m_Instances.numAttributes(); i++) {
			  if (m_Instances.attribute(i).isNumeric()) {
				assertEquals((i+1) + ". value differs", data[i], inst.value(i), 1e-15);
			  }
			}
		  }
}