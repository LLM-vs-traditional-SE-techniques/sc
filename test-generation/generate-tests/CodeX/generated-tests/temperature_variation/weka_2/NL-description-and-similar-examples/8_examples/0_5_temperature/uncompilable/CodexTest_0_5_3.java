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


public class CodexTest_0_5_3 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
        "=== header ===\n"
        + "nom1,nom2,nom3,num1,num2\n"
        + "0,0,0,0,0\n"
        + "1,1,1,1,1\n"
        + "2,2,2,2,2\n"
        + "=== header end ===\n")));
    double[] values = {1.0, 2.0};
    AlgVector vec = new AlgVector(values);
    try {
      Instance inst = vec.getAsInstance(model, new Random(1));
      assertEquals("num1", 1.0, inst.value(3), 0.0);
      assertEquals("num2", 2.0, inst.value(4), 0.0);
      assertEquals("nom1", 0, inst.value(0), 0.0);
      assertEquals("nom2", 0, inst.value(1), 0.0);
      assertEquals("nom3", 0, inst.value(2), 0.0);
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}