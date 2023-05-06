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


public class CodexTest_0_2_39 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 1;
    int numValues = 2;
    int numElements = 2;
    Random random = new Random(1);
    Instances model = new Instances("test", new ArrayList<Attribute>(), numInstances);
    model.insertAttributeAt(new Attribute("a1"), 0);
    model.insertAttributeAt(new Attribute("a2"), 1);
    model.insertAttributeAt(new Attribute("a3", Arrays.asList("v1", "v2")), 2);
    model.setClassIndex(2);
    double[] elements = new double[numElements];
    for (int i = 0; i < numElements; i++) {
      elements[i] = i;
    }
    AlgVector v = new AlgVector(elements);
    Instance inst = v.getAsInstance(model, random);
    assertEquals("Number of attributes differs", numAttributes, inst.numAttributes());
    assertEquals("Number of values differs", numValues, inst.numValues());
    assertEquals("Value differs", 0, inst.value(0));
    assertEquals("Value differs", 1, inst.value(1));
    assertEquals("Value differs", 0, inst.value(2));
  }
}