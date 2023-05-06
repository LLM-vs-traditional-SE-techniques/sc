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


public class CodexTest_0_3_72 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 4;
    int numInsts = 5;
    Instances insts = new Instances(getName(), makeAttInfo(numAtts, numVals), numInsts);
    double[] values = new double[numAtts];
    for (int i = 0; i < numInsts; i++) {
      for (int j = 0; j < numAtts; j++) {
	values[j] = i + j;
      }
      insts.add(new DenseInstance(1.0, values));
    }
    AlgVector v = new AlgVector(values);
    Instance inst = null;
    try {
      inst = v.getAsInstance(insts, new Random(1));
    } catch (Exception ex) {
      fail("Problem converting vector to instance: " + ex.getMessage());
    }
    assertTrue("Instance has wrong number of attributes", 
	       inst.numAttributes() == numAtts);
    for (int j = 0; j < numAtts; j++) {
      if (j < numAtts - 1) {
	assertTrue("Instance has wrong value for attribute " + j, 
		   inst.value(j) == values[j]);
      } else {
	assertTrue("Instance has wrong value for attribute " + j, 
		   inst.value(j) == 1.0);
      }
    }
  }
}