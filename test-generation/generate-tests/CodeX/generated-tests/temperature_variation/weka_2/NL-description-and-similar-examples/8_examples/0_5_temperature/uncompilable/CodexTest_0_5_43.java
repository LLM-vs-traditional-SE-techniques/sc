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


public class CodexTest_0_5_43 { 
  @Test
    public void test_getAsInstance() {
    try {
      Instances model = new Instances(new BufferedReader(new StringReader(
									  iris)));
      model.setClassIndex(model.numAttributes() - 1);
      AlgVector v = new AlgVector(new double[]{1, 2, 3, 4});
      Instance newInst = v.getAsInstance(model, new Random(1));
      assertEquals("1st attribute", 1, newInst.value(0), 0.1);
      assertEquals("2nd attribute", 2, newInst.value(1), 0.1);
      assertEquals("3rd attribute", 3, newInst.value(2), 0.1);
      assertEquals("4th attribute", 4, newInst.value(3), 0.1);
      assertEquals("5th attribute", 0, newInst.value(4), 0.1);
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
}