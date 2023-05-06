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


public class CodexTest_0_2_48 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 1;
    int numValues = 2;
    int numElements = numAttributes - numValues;
    Instances dataset = new Instances("Test", new ArrayList<Attribute>(), numInstances);
    for (int i = 0; i < numAttributes; i++) {
      if (i < numValues) {
	dataset.insertAttributeAt(new Attribute("A" + i), i);
      } else {
	dataset.insertAttributeAt(new Attribute("N" + i), i);
      }
    }
    double[] elements = new double[numElements];
    for (int i = 0; i < numElements; i++) {
      elements[i] = i;
    }
    AlgVector vector = new AlgVector(elements);
    Instance instance = null;
    try {
      instance = vector.getAsInstance(dataset, new Random(1));
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
    assertEquals("Number of attributes differ", numAttributes, instance.numAttributes());
    assertEquals("Number of values differ", numValues, instance.numValues());
    for (int i = 0; i < numValues; i++) {
      assertEquals("Value differs", 0, instance.value(i));
    }
    for (int i = numValues; i < numAttributes; i++) {
      assertEquals("Value differs", i - numValues, instance.value(i));
    }
  }
}