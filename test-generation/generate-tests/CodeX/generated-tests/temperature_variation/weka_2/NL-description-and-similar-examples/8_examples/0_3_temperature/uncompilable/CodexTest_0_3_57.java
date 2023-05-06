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


public class CodexTest_0_3_57 { 
  @Test
  public void testGetAsInstance() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new Instance(v.numElements()));
    model.setClassIndex(v.numElements() - 1);
    Instance inst = null;
    try {
      inst = v.getAsInstance(model, new Random(1));
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
    assertEquals("Number of attributes differ", v.numElements(), inst.numAttributes());
    assertEquals("Class index differs", v.numElements() - 1, inst.classIndex());
    for (int i = 0; i < v.numElements(); i++) {
      assertEquals((i+1) + ". value differs", data[i], inst.value(i));
    }
  }
}