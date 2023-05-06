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


public class CodexTest_0_0_2 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 2;
    Instances model = new Instances("test", new ArrayList<Attribute>(), numInstances);
    for (int i = 0; i < numAttributes; i++) {
      model.insertAttributeAt(new Attribute("att" + i), i);
    }
    model.setClassIndex(numAttributes - 1);
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Number of attributes differs", numAttributes, inst.numAttributes());
      assertEquals("Number of values differs", numAttributes, inst.numValues());
      assertEquals("Number of missing values differs", 0, inst.numMissing());
      assertEquals("Class index differs", numAttributes - 1, inst.classIndex());
      assertEquals("Class value differs", 0.0, inst.classValue(), 1e-15);
      assertEquals("Value at index 0 differs", data[0], inst.value(0), 1e-15);
      assertEquals("Value at index 1 differs", data[1], inst.value(1), 1e-15);
      assertEquals("Value at index 2 differs", data[2], inst.value(2), 1e-15);
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
  }
}