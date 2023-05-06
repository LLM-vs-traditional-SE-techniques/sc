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


public class CodexTest_0_5_59 { 
  @Test
  public void testGetAsInstance() {
    int numElements = 10;
    int numAttributes = 20;
    double[] elements = new double[numElements];
    for (int i = 0; i < numElements; i++) {
      elements[i] = i;
    }
    AlgVector vector = new AlgVector(elements);
    Instances instances = getRandomInstances(numAttributes);
    Random random = new Random(1);
    try {
      Instance instance = vector.getAsInstance(instances, random);
      assertNotNull(instance);
      assertEquals(numAttributes, instance.numAttributes());
      assertEquals(numElements, instance.numValues());
      for (int i = 0; i < instance.numValues(); i++) {
        assertEquals(elements[i], instance.value(i), 1e-6);
      }
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
  }
}