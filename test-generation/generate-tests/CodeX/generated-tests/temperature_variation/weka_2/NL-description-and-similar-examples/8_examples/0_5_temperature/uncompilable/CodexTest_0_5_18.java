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


public class CodexTest_0_5_18 { 
  @Test
  public void testGetAsInstance() {
    Instances inst = new Instances(m_Instances, 0);
    double[] vec = {1, 2, 3};
    AlgVector v = new AlgVector(vec);
    try {
      Instance newInst = v.getAsInstance(inst, new Random(1));
      assertEquals("Number of values differs",
		   inst.numAttributes(), newInst.numValues());
      for (int i = 0; i < inst.numAttributes(); i++) {
	if (inst.attribute(i).isNumeric()) {
	  assertEquals("Value differs",
		       vec[i], newInst.value(i), 0);
	}
      }
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}