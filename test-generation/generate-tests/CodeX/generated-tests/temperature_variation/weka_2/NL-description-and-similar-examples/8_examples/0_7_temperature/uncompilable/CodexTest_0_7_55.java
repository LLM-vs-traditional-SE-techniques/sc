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


public class CodexTest_0_7_55 { 
  @Test
      public void testGetAsInstance() {
    // test whether a concat of two instances can be converted
    // into a double instance
    for (int i = 0; i < 7; i++) {
      double[] values1 = new double[2];
      double[] values2 = new double[2];
      for (int n = 0; n < values1.length; n++) {
	values1[n] = m_Random.nextDouble() * 100;
	values2[n] = m_Random.nextDouble() * 100;
      }
      Instance inst1 = new DenseInstance(1.0, values1);
      Instance inst2 = new DenseInstance(1.0, values2);
      Instances dataset = new Instances(inst1.dataset());
      dataset.delete();
      dataset.insertAttributeAt(new Attribute("test1"), 0);
      dataset.insertAttributeAt(new Attribute("test2"), 1);
      dataset.setClassIndex(dataset.numAttributes() - 1);
      Instance inst = new DenseInstance(dataset.numAttributes());
      inst.setDataset(dataset);
      inst.setValue(0, inst1);
      inst.setValue(1, inst2);
      Instance newInst = inst.getAsInstance(dataset, m_Random);
      assertEquals(dataset, newInst.dataset());
      assertEquals(dataset.classIndex(), newInst.classIndex());
      assertEquals(values1.length + values2.length, 
		   newInst.numValues());
      for (int n = 0; n < values1.length + values2.length; n++) {
	if (n < values1.length) {
	  assertEquals(values1[n], newInst.valueSparse(n));
	} else {
	  assertEquals(values2[n - values1.length], 
		       newInst.valueSparse(n));
	}
      }
    }
  }

}