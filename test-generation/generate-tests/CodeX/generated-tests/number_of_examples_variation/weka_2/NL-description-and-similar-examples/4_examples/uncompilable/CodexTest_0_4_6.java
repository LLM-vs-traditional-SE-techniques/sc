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


public class CodexTest_0_4_6 { 
  @Test
  public void testGetAsInstance() throws Exception {
    int numAttributes = 4;
    int numValues = 3;
    int numElements = 2;
    Instances model = new Instances("Test", new ArrayList<Attribute>(), numAttributes);
    for (int i = 0; i < numElements; i++) {
      model.insertAttributeAt(new Attribute("Test" + i), i);
    }
    for (int i = numElements; i < numAttributes; i++) {
      model.insertAttributeAt(new Attribute("Test" + i, new ArrayList<String>(numValues)), i);
    }
    model.setClassIndex(numAttributes - 1);
    double[] elements = {1.0, 2.0};
    AlgVector v = new AlgVector(elements);
    Instance newInst = v.getAsInstance(model, new Random(1));
    assertEquals("Number of attributes differ", numAttributes, newInst.numAttributes());
    assertEquals("Number of values differ", numValues, newInst.numValues());
    assertEquals("Number of elements differ", numElements, v.numElements());
    for (int i = 0; i < numElements; i++) {
      assertEquals("Value differs", elements[i], newInst.value(i));
    }
    for (int i = numElements; i < numAttributes; i++) {
      assertEquals("Value differs", 0, newInst.value(i));
    }
  }
}