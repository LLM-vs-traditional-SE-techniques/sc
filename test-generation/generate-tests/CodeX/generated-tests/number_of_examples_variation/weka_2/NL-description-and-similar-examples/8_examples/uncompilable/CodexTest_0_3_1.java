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


public class CodexTest_0_3_1 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 2;
    int numInstances = 2;
    int numValues = 2;
    int numElements = 2;
    Instances dataset = new Instances("test", new ArrayList<Attribute>(), numInstances);
    for (int i = 0; i < numAttributes; i++) {
      if (i % 2 == 0) {
        dataset.insertAttributeAt(new Attribute("Numeric" + i), i);
      } else {
        dataset.insertAttributeAt(new Attribute("Nominal" + i, numValues), i);
      }
    }
    double[] elements = new double[numElements];
    for (int i = 0; i < numElements; i++) {
      elements[i] = i;
    }
    AlgVector vector = new AlgVector(elements);
    Instance instance = vector.getAsInstance(dataset, new Random(1));
    assertEquals("Wrong number of attributes", numAttributes, instance.numAttributes());
    assertEquals("Wrong number of values", numElements, instance.numValues());
    for (int i = 0; i < numElements; i++) {
      assertEquals("Wrong value", elements[i], instance.value(i));
    }
    for (int i = numElements; i < numAttributes; i++) {
      assertEquals("Wrong value", 0, instance.value(i));
    }
  }

}