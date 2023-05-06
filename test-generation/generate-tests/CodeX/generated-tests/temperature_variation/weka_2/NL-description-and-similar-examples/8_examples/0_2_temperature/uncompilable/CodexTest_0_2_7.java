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


public class CodexTest_0_2_7 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInsts = 10;
    Instances insts = new Instances(new FastVector(numAtts), numInsts);
    for (int i = 0; i < numAtts; i++) {
      insts.insertAttributeAt(new Attribute("Att" + (i + 1)), i);
    }
    insts.insertAttributeAt(new Attribute("Class"), numAtts);
    insts.setClassIndex(numAtts);
    double[] vals = new double[numAtts + 1];
    for (int i = 0; i < numInsts; i++) {
      for (int j = 0; j < numAtts; j++) {
	vals[j] = i;
      }
      vals[numAtts] = i % 2;
      insts.add(new Instance(1.0, vals));
    }
    AlgVector vec = new AlgVector(numAtts);
    for (int i = 0; i < numAtts; i++) {
      vec.setElement(i, i);
    }
    Instance inst = null;
    try {
      inst = vec.getAsInstance(insts, new Random(1));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown when creating instance from vector");
    }
    assertEquals("Number of attributes differs", numAtts, inst.numAttributes());
    for (int i = 0; i < numAtts; i++) {
      assertEquals("Value of attribute " + (i + 1) + " differs", i, inst.value(i));
    }
    assertEquals("Class value differs", 0, (int) inst.classValue());
  }
}