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


public class CodexTest_0_1_53 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances insts = new Instances(new Instance(numAtts));
    insts.setClassIndex(2);
    for (int i = 0; i < numInstances; i++) {
      insts.add(new Instance(1.0, new double[numAtts]));
    }
    AlgVector v = new AlgVector(numAtts);
    for (int i = 0; i < numAtts; i++) {
      v.setElement(i, i);
    }
    try {
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differs", numAtts, inst.numAttributes());
      for (int i = 0; i < numAtts; i++) {
	if (i == 2) {
	  assertEquals("Value differs", 0, inst.value(i));
	} else {
	  assertEquals("Value differs", i, inst.value(i));
	}
      }
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}