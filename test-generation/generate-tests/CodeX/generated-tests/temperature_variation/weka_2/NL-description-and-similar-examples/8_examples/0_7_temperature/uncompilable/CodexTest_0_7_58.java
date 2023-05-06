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


public class CodexTest_0_7_58 { 
  @Test
  public void testGetAsInstance() {
    double[] vector = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0};
    AlgVector v = new AlgVector(vector);
    Instances model = new Instances(new BufferedReader(new StringReader(data.iris())));
    model.setClassIndex(model.numAttributes() - 1);
    assertEquals("Number of attributes differs", model.numAttributes(), v.numElements());
    
    try {
      Instance inst = v.getAsInstance(model, new Random(3));
      assertEquals("Instance differs", 1.5, inst.value(0), 0.001);
      assertEquals("Instance differs", 4.9, inst.value(1), 0.001);
      assertEquals("Instance differs", 3.0, inst.value(2), 0.001);
      assertEquals("Instance differs", 1.4, inst.value(3), 0.001);
      assertEquals("Instance differs", 0.0, inst.value(4), 0.001);
      assertEquals("Instance differs", 0.0, inst.value(5), 0.001);
      assertEquals("Instance differs", 0.0, inst.value(6), 0.001);
      assertEquals("Instance differs", 1.0, inst.value(7), 0.001);
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}