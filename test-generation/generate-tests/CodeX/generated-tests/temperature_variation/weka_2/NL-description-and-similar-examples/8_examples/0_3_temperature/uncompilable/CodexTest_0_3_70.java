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


public class CodexTest_0_3_70 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances data = new Instances(new MockInstances(numAtts, numInstances));
    double[] values = new double[numAtts];
    for (int i = 0; i < numAtts; i++) {
      values[i] = i;
    }
    AlgVector vec = new AlgVector(values);
    Instance inst = null;
    try {
      inst = vec.getAsInstance(data, new Random(1));
    } catch (Exception ex) {
      fail("Exception thrown on getAsInstance(): \n" + ex.getMessage());
    }
    assertEquals("Number of attributes differ", numAtts, inst.numAttributes());
    for (int i = 0; i < numAtts; i++) {
      assertEquals("Value differs", values[i], inst.value(i));
    }
  }
}