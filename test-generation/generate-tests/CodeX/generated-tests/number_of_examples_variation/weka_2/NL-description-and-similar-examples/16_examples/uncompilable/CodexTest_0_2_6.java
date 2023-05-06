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


public class CodexTest_0_2_6 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances insts = new Instances(new BufferedReader(new StringReader(
									InstancesTest.simpleData)));
      AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals(3, inst.numAttributes());
      assertEquals(1.0, inst.value(0), 0.0);
      assertEquals(2.0, inst.value(1), 0.0);
      assertEquals(0.0, inst.value(2), 0.0);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}