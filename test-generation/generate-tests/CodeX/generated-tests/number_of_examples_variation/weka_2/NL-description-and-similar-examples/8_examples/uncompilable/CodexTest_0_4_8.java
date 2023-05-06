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


public class CodexTest_0_4_8 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 2;
    int numInsts = 10;
    Instances insts = new Instances(getName(), attInfo, numInsts);
    insts.setClassIndex(1);
    double[] values = new double[numAtts];
    for (int i = 0; i < numInsts; i++) {
      insts.add(new DenseInstance(1.0, values));
    }
    AlgVector v = new AlgVector(insts.numAttributes());
    v.setElement(0, 1.0);
    v.setElement(1, 2.0);
    Instance newI = null;
    try {
      newI = v.getAsInstance(insts, new Random(1));
    } catch (Exception e) {
      fail("Problem with getAsInstance: " + e.getMessage());
    }
    assertEquals("Number of attributes incorrect", numAtts, newI.numAttributes());
    assertEquals("First attribute incorrect", 1.0, newI.value(0), 1e-6);
    assertEquals("Second attribute incorrect", 2.0, newI.value(1), 1e-6);
  }
}