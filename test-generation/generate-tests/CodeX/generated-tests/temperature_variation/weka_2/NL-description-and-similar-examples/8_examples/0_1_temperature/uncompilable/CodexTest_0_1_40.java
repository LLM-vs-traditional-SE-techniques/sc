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


public class CodexTest_0_1_40 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    int numInsts = 10;
    Instances insts = null;
    try {
      insts = makeTestDataset(numAtts, numVals, numInsts);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Problem setting up test instances");
    }
    Instance inst = null;
    try {
      inst = makeTestInstance(insts);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Problem setting up test instance");
    }
    AlgVector vec = new AlgVector(inst);
    try {
      Instance newInst = vec.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differ", inst.numAttributes(), 
		   newInst.numAttributes());
      for (int i = 0; i < inst.numAttributes(); i++) {
	if (inst.attribute(i).isNumeric()) {
	  assertEquals("Numeric values differ", inst.value(i), 
		       newInst.value(i));
	}
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Problem with getAsInstance");
    }
  }
}