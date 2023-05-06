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


public class CodexTest_0_4_10 { 
  @Test
    public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
									 InstancesTest.INSTANCES)));
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0, 4.0, 5.0});
    Random r = new Random(1);
    Instance i = v.getAsInstance(model, r);
    assertEquals("Wrong number of attributes", model.numAttributes(), i.numAttributes());
    assertEquals("Wrong number of values", model.numAttributes(), i.numValues());
    assertEquals("Wrong dataset", model, i.dataset());
    assertEquals("Wrong value for first attribute", 1.0, i.value(0), 1e-6);
    assertEquals("Wrong value for second attribute", 2.0, i.value(1), 1e-6);
    assertEquals("Wrong value for third attribute", 3.0, i.value(2), 1e-6);
    assertEquals("Wrong value for fourth attribute", 4.0, i.value(3), 1e-6);
    assertEquals("Wrong value for fifth attribute", 4.0, i.value(4), 1e-6);
  }
}