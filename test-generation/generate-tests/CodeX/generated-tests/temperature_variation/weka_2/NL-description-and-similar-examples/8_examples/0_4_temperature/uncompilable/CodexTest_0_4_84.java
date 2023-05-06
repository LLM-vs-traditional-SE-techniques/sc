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


public class CodexTest_0_4_84 { 
  @Test
  public void testGetAsInstance() {
    Instances inst = new Instances(m_Instances);
    AlgVector v = new AlgVector(inst);
    try {
      Instance inst2 = v.getAsInstance(inst, new Random(1));
      assertEquals("Datatypes are not compatible.", 
		   inst.numAttributes(), inst2.numAttributes());
      for (int i = 0; i < inst.numAttributes(); i++) {
	if (inst.attribute(i).isNumeric()) {
	  assertEquals("Numeric attribute differs.", 
		       inst.instance(0).value(i), inst2.value(i), 1e-6);
	}
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception generated: " + ex.getMessage());
    }
  }
}