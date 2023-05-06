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


public class CodexTest_0_1_21 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances insts = new Instances(new FastVector(numAtts), numInstances);
    for (int i = 0; i < numAtts; i++) {
      insts.insertAttributeAt(new Attribute("Att" + (i + 1)), i);
    }
    insts.insertAttributeAt(new Attribute("Class", (FastVector) null), numAtts);
    insts.setClassIndex(numAtts);
    double[] vals = new double[numAtts + 1];
    for (int i = 0; i < numInstances; i++) {
      for (int j = 0; j < numAtts; j++) {
	vals[j] = i;
      }
      vals[numAtts] = i % 2;
      insts.add(new Instance(1.0, vals));
    }
    AlgVector vec = new AlgVector(insts.numAttributes());
    for (int i = 0; i < numAtts; i++) {
      vec.setElement(i, i);
    }
    Instance inst = null;
    try {
      inst = vec.getAsInstance(insts, new Random(1));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown on getAsInstance: " + ex.getMessage());
    }
    assertEquals("Number of attributes differ", numAtts, inst.numAttributes());
    for (int i = 0; i < numAtts; i++) {
      assertEquals("Value of attribute " + i + " differs", i, inst.value(i));
    }
  }
}