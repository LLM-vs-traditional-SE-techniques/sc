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


public class CodexTest_0_5_21 { 
  @Test
  public void testGetAsInstance() {
    Instances insts = null;
    try {
      insts = new Instances(new BufferedReader(new StringReader(
								InstancesTest.simpleData)));
    } catch (Exception ex) {
      fail("Problem reading data");
    }
    double[] vals = new double[insts.numAttributes()];
    for (int i = 0; i < vals.length; i++) {
      vals[i] = i;
    }
    AlgVector v = new AlgVector(vals);
    try {
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals("Wrong number of attributes", insts.numAttributes(), 
		   inst.numAttributes());
      for (int i = 0; i < inst.numAttributes(); i++) {
	if (insts.attribute(i).isNumeric()) {
	  assertEquals("Wrong value for numeric attribute", i, inst.value(i), 1e-6);
	} else {
	  assertTrue("Wrong value for nominal attribute",
		     inst.value(i) >= 0 && inst.value(i) < insts.attribute(i).numValues());
	}
      }
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
}