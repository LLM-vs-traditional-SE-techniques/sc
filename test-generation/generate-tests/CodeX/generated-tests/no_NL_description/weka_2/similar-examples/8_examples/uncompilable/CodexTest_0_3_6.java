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


public class CodexTest_0_3_6 { 
  @Test
    public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
									InstancesTest.IRIS_DATATEST_SET)));
    AlgVector v = new AlgVector(new double[]{1, 2, 3, 4, 5, 6});
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Length differs", model.numAttributes(), inst.numAttributes());
      assertEquals("Dataset differs", model, inst.dataset());
      assertEquals("Value differs", 1.0, inst.value(0), 1e-6);
      assertEquals("Value differs", 2.0, inst.value(1), 1e-6);
      assertEquals("Value differs", 3.0, inst.value(2), 1e-6);
      assertEquals("Value differs", 4.0, inst.value(3), 1e-6);
      assertEquals("Value differs", 5.0, inst.value(4), 1e-6);
      assertEquals("Value differs", 6.0, inst.value(5), 1e-6);
    } catch (Exception ex) {
      fail("Exception: " + ex);
    }
  }
}