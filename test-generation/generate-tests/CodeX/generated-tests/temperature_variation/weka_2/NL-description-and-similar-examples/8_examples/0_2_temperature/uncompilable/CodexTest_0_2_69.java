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


public class CodexTest_0_2_69 { 
  @Test
  public void testGetAsInstance() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new BufferedReader(new StringReader(
									"@relation test\n" +
									"@attribute a numeric\n" +
									"@attribute b numeric\n" +
									"@attribute c numeric\n" +
									"@attribute d numeric\n" +
									"@data\n" +
									"1,2,3,4\n" +
									"5,6,7,8\n")));
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Number of attributes differ", model.numAttributes(), inst.numAttributes());
      assertEquals("1. attribute differs", data[0], inst.value(0), 1e-6);
      assertEquals("2. attribute differs", data[1], inst.value(1), 1e-6);
      assertEquals("3. attribute differs", data[2], inst.value(2), 1e-6);
      assertEquals("4. attribute differs", 0.0, inst.value(3), 1e-6);
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}