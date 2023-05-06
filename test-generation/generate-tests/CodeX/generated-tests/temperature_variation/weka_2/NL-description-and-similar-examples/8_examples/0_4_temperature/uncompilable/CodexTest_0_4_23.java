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


public class CodexTest_0_4_23 { 
  @Test
  public void testGetAsInstance() {
    Instances inst = new Instances(m_Instances, 0);
    AlgVector vec = new AlgVector(inst.numAttributes());
    for (int i = 0; i < inst.numAttributes(); i++) {
      if (inst.attribute(i).isNumeric())
	vec.setElement(i, (double) i);
    }
    try {
      Instance inst2 = vec.getAsInstance(inst, new Random(1));
      assertEquals("Number of attributes differ.", inst.numAttributes(), 
		   inst2.numAttributes());
      for (int i = 0; i < inst.numAttributes(); i++) {
	if (inst.attribute(i).isNumeric()) {
	  assertEquals("Values differ.", (double) i, inst2.value(i));
	}
      }
    } catch (Exception e) {
      fail("Exception occurred: " + e.getMessage());
    }
  }
}