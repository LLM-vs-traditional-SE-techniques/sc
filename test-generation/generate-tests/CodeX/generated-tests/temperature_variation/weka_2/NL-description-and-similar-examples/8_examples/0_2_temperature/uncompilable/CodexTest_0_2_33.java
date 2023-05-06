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


public class CodexTest_0_2_33 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 5;
    Instances insts = new Instances(new Instance(numAtts), numInstances);
    insts.setClassIndex(0);
    double[] vals = new double[numAtts];
    for (int i = 0; i < numInstances; i++) {
      for (int j = 0; j < numAtts; j++) {
	vals[j] = i;
      }
      insts.add(new DenseInstance(1.0, vals));
    }
    AlgVector vec = new AlgVector(vals);
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes is wrong", numAtts, inst.numAttributes());
      assertEquals("Number of values is wrong", numAtts, inst.numValues());
      assertEquals("Class value is wrong", 0, inst.classValue());
      assertEquals("Value at pos 0 is wrong", 0, inst.value(0));
      assertEquals("Value at pos 1 is wrong", 1, inst.value(1));
      assertEquals("Value at pos 2 is wrong", 2, inst.value(2));
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
}