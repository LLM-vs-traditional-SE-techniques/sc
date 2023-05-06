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


public class CodexTest_0_3_7 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 5;
    int numNumeric = 2;
    int numNominal = 1;
    int numValues = 4;
    int numElements = numNumeric;
    Instances model = new Instances("test", new ArrayList<Attribute>(), 0);
    for (int i = 0; i < numNumeric; i++) {
      model.insertAttributeAt(new Attribute("Numeric" + i), i);
    }
    for (int i = 0; i < numNominal; i++) {
      model.insertAttributeAt(new Attribute("Nominal" + i, numValues), i);
    }
    model.setClassIndex(numAttributes - 1);
    AlgVector v = new AlgVector(numElements);
    for (int i = 0; i < numElements; i++) {
      v.setElement(i, i);
    }
    Instance inst = null;
    try {
      inst = v.getAsInstance(model, new Random(1));
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
    assertEquals("Number of attributes differs", numAttributes, inst.numAttributes());
    assertEquals("Number of values differs", numElements, numNumeric);
    for (int i = 0; i < numNumeric; i++) {
      assertEquals("Value differs", i, inst.value(i), 1e-6);
    }
    for (int i = 0; i < numNominal; i++) {
      assertEquals("Value differs", 2, inst.value(i + numNumeric));
    }
  }
}