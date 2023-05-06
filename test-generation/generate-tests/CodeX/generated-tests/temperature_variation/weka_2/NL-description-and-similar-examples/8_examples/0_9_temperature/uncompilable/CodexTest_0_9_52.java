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


public class CodexTest_0_9_52 { 
  @Test
  public void testGetAsInstanceNumericDataset() {
    double[] values = {2.3, 1.2, -0.1};
    AlgVector v = new AlgVector(values);
    Instances data = TestInstances.createNumericClassesDataset();
    Random r = new Random(54321);
    try {
      Instance instFromVector = v.getAsInstance(data, r);
      assertNotNull(instFromVector);
      assertEquals(data.numAttributes(), instFromVector.numAttributes());
      assertEquals(data.numClasses(), instFromVector.numClasses());
      assertEquals(data, instFromVector.dataset());
      assertEquals(2.3, instFromVector.value(0), 1e-6);
      assertEquals(1.2, instFromVector.value(1), 1e-6);
      assertEquals(-0.1, instFromVector.value(2), 1e-6);
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }
}