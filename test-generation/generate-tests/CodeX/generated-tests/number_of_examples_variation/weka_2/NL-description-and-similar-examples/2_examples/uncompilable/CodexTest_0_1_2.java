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


public class CodexTest_0_1_2 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances model = new Instances(new BufferedReader(new StringReader(
									  "A,B,C\n"
									  + "1,2,3\n"
									  + "4,5,6\n"
									  + "7,8,9\n")));
      model.setClassIndex(model.numAttributes() - 1);
      AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("A differs", 1.0, inst.value(0));
      assertEquals("B differs", 2.0, inst.value(1));
      assertEquals("C differs", 3.0, inst.value(2));
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}