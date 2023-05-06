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


public class CodexTest_0_5_16 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    Instances insts = makeRandomInstances(numAtts, numVals);
    AlgVector v = new AlgVector(insts.numAttributes());
    Random random = new Random(1);
    try {
      Instance inst = v.getAsInstance(insts, random);
      assertEquals("Number of attributes differs", insts.numAttributes(), 
		   inst.numAttributes());
      assertEquals("Dataset differs", insts, inst.dataset());
      assertEquals("Number of values differs", insts.numAttributes(), 
		   inst.numValues());
      for (int i = 0; i < numAtts; i++) {
	if (insts.attribute(i).isNominal()) {
	  assertTrue("Value is not missing", !inst.isMissing(i));
	  assertTrue("Value is not a valid nominal value", 
		     (int) inst.value(i) < insts.attribute(i).numValues());
	} else {
	  assertTrue("Value is not missing", Utils.eq(inst.value(i), 0));
	}
      }
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}