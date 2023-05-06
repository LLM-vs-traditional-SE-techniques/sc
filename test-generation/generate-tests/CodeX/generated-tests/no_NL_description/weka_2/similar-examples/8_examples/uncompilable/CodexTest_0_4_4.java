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


public class CodexTest_0_4_4 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 5;
    double[] values = new double[numAtts];
    for (int i = 0; i < numAtts; i++) {
      values[i] = i;
    }
    Instances data = makeTestDataset(numAtts, numInstances);
    AlgVector v = new AlgVector(values);
    Instance inst = null;
    try {
      inst = v.getAsInstance(data, new Random(1));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
    assertEquals("Number of attributes differ", numAtts, inst.numAttributes());
    for (int i = 0; i < numAtts; i++) {
      assertEquals("Attribute values differ", values[i], inst.value(i));
    }
  }
}