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


public class CodexTest_0_4_36 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances insts = null;
    try {
      insts = makeTestDataset(numAtts, numInstances);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Problem setting up test instances");
    }
    insts.setClassIndex(numAtts - 1);
    AlgVector vec = new AlgVector(numAtts);
    for (int i = 0; i < numAtts - 1; i++) {
      vec.setElement(i, i);
    }
    try {
      Instance inst = vec.getAsInstance(insts, new Random());
      assertEquals("Number of attributes differs", numAtts, inst.numAttributes());
      for (int i = 0; i < numAtts - 1; i++) {
	assertEquals("Attribute " + i + " differs", inst.value(i), i, 0);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Problem getting instance from vector");
    }
  }
}