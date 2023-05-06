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


public class CodexTest_0_1_19 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances data = new Instances(new FastVector(numAtts), numInstances);
    for (int i = 0; i < numAtts; i++) {
      data.insertAttributeAt(new Attribute("Att" + (i + 1)), i);
    }
    data.insertAttributeAt(new Attribute("Class"), numAtts);
    data.setClassIndex(numAtts);
    double[] vals = new double[numAtts + 1];
    for (int i = 0; i < numInstances; i++) {
      for (int j = 0; j < numAtts; j++) {
	vals[j] = i;
      }
      vals[numAtts] = i % 2;
      data.add(new Instance(1.0, vals));
    }
    AlgVector vec = new AlgVector(numAtts);
    for (int i = 0; i < numAtts; i++) {
      vec.setElement(i, i);
    }
    try {
      Instance inst = vec.getAsInstance(data, new Random(1));
      assertEquals("Number of attributes differs", numAtts + 1, inst.numAttributes());
      for (int i = 0; i < numAtts; i++) {
	assertEquals("Value differs", i, inst.value(i), 1e-6);
      }
      assertEquals("Class value differs", 0, inst.classValue(), 1e-6);
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}