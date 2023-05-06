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


public class CodexTest_0_3_32 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(new BufferedReader(new StringReader(
	"\n@RELATION test\n\n@ATTRIBUTE A NUMERIC\n@ATTRIBUTE B NUMERIC\n@ATTRIBUTE C NUMERIC\n@ATTRIBUTE D NUMERIC\n\n@DATA\n1,2,3,4\n5,6,7,8\n9,10,11,12\n13,14,15,16\n17,18,19,20\n")));
    AlgVector v = new AlgVector(new double[]{1,2,3,4});
    try {
      Instance inst = v.getAsInstance(data, new Random(1));
      assertEquals("A", 1.0, inst.value(0), 1e-6);
      assertEquals("B", 2.0, inst.value(1), 1e-6);
      assertEquals("C", 3.0, inst.value(2), 1e-6);
      assertEquals("D", 4.0, inst.value(3), 1e-6);
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}