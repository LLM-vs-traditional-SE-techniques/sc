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


public class CodexTest_0_4_5 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 4;
    int numInstances = 10;
    double[] values = new double[numInstances];
    for (int i = 0; i < numInstances; i++) {
      values[i] = i;
    }
    Instances data = makeTestDataset(numAtts, numInstances, values);
    AlgVector v = new AlgVector(values);
    try {
      Instance inst = v.getAsInstance(data, new Random(1));
      assertEquals(numAtts, inst.numAttributes());
      assertEquals(numInstances, inst.numValues());
      for (int i = 0; i < numInstances; i++) {
	assertEquals(values[i], inst.value(i));
      }
    } catch (Exception ex) {
      fail("Exception during getAsInstance: " + ex.getMessage());
    }
  }
}