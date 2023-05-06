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


public class CodexTest_0_5_26 { 
  @Test
  public void testGetAsInstance() {
    int numAtt = 5;
    int numInst = 10;
    FastVector attInfo = new FastVector(numAtt);
    for (int i = 0; i < numAtt; i++) {
      attInfo.addElement(new Attribute("Att" + (i+1)));
    }
    Instances insts = new Instances("TestInstances", attInfo, numInst);
    double[] values = new double[numAtt];
    for (int i = 0; i < numInst; i++) {
      for (int j = 0; j < numAtt; j++) {
	values[j] = i;
      }
      insts.add(new DenseInstance(1.0, values));
    }
    AlgVector algV = new AlgVector(values);
    Instance inst = null;
    try {
      inst = algV.getAsInstance(insts, new Random(1));
    } catch (Exception e) {
      fail("Exception occured: " + e.getMessage());
    }
    assertTrue("Instance not created", inst != null);
    assertEquals("Wrong number of attributes", insts.numAttributes(), 
		 inst.numAttributes());
    assertEquals("Wrong number of values", insts.numAttributes(), 
		 inst.numValues());
    assertEquals("Wrong class value", insts.classIndex(), 
		 inst.classIndex());
    assertEquals("Wrong dataset", insts, inst.dataset());
    for (int i = 0; i < numAtt; i++) {
      assertEquals("Wrong value for attribute " + (i + 1), values[i], 
		   inst.value(i));
    }
  }
}