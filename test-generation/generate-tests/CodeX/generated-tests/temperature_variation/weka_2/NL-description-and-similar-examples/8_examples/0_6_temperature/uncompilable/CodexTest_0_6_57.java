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


public class CodexTest_0_6_57 { 
  @Test
  public void testGetAsInstance() {
    Instances d = new Instances(m_Instances, 0);
    int num = m_Instances.numAttributes();
    double[] values = new double[num];
    for (int i = 0; i < num; i++) {
      if (m_Instances.attribute(i).isNominal()) {
	values[i] = (int) (Math.random() * m_Instances.attribute(i).numValues());
      } else {
	values[i] = Math.random();
      }
    }
    Instance inst = new DenseInstance(1.0, values);
    inst.setDataset(m_Instances);
    AlgVector alg = new AlgVector(inst);
    Instance inst2 = alg.getAsInstance(d, new Random(1));
    assertTrue("Datasets not compatible", inst2.dataset() == d);
    for (int i = 0; i < num; i++) {
      assertEquals("Values differ at position " + i, inst.value(i), 
		   inst2.value(i), 1e-6);
    }
  }

}