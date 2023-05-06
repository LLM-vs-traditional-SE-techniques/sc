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


public class CodexTest_0_5_4 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
      Instances inst = makeInstances();
      Instance i = v.getAsInstance(inst, new Random());
      assertTrue("Instance is null", i != null);
      assertEquals("Number of attributes differs", inst.numAttributes(), i.numAttributes());
      assertEquals("Number of values differs", inst.numAttributes(), i.numValues());
      assertEquals("First value differs", 1.0, i.value(0), 0.0);
      assertEquals("Second value differs", 2.0, i.value(1), 0.0);
      assertEquals("Third value differs", 3.0, i.value(2), 0.0);
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
```
}