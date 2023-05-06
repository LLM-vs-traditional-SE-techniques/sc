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


public class CodexTest_0_6_5 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances model = new Instances(new BufferedReader(new StringReader(
									   InstancesTest.INSTANCES)));
      AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Num attributes differ", model.numAttributes(), inst.numAttributes());
      assertEquals("Num values differ", model.numAttributes(), inst.numValues());
      assertEquals("Value 0 differs", 1.0, inst.value(0), 1e-6);
      assertEquals("Value 1 differs", 2.0, inst.value(1), 1e-6);
      assertEquals("Value 2 differs", 3.0, inst.value(2), 1e-6);
      assertEquals("Value 3 differs", 1.0, inst.value(3), 1e-6);
      assertEquals("Value 4 differs", "yes", inst.stringValue(4));
      assertEquals("Value 5 differs", 0.0, inst.value(5), 1e-6);
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}