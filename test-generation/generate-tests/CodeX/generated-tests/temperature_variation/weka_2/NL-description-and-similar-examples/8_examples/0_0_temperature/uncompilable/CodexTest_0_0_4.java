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


public class CodexTest_0_0_4 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances insts = new Instances(new Instance(numAtts), numInstances);
    insts.setClassIndex(numAtts - 1);
    insts.setRelationName("Test");
    double[] vals = new double[numAtts];
    for (int i = 0; i < numInstances; i++) {
      for (int j = 0; j < numAtts; j++) {
	vals[j] = i;
      }
      insts.add(new DenseInstance(1.0, vals));
    }
    AlgVector vec = new AlgVector(insts.numAttributes());
    for (int i = 0; i < insts.numAttributes(); i++) {
      vec.setElement(i, i);
    }
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals("Num attributes differ", insts.numAttributes(), 
		   inst.numAttributes());
      for (int i = 0; i < insts.numAttributes(); i++) {
	assertEquals("Value differs", i, inst.value(i));
      }
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
}