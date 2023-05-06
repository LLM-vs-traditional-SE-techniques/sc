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


public class CodexTest_0_2_8 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances insts = new Instances(new BufferedReader(new StringReader(
									  "A,B,C\n" +
									  "1,2,3\n" +
									  "4,5,6\n" +
									  "7,8,9\n" +
									  "10,11,12\n")));
      insts.setClassIndex(2);
      AlgVector v = new AlgVector(new double[]{1, 2, 3, 4});
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals(1.0, inst.value(0), 0.0);
      assertEquals(2.0, inst.value(1), 0.0);
      assertEquals(1.0, inst.value(2), 0.0);
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}