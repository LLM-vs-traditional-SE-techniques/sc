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


public class CodexTest_0_1_4 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances insts = new Instances(new BufferedReader(new StringReader(
									   "a,b,c\n" +
									   "1,2,3\n" +
									   "4,5,6\n" +
									   "7,8,9\n")));
      insts.setClassIndex(2);
      AlgVector v = new AlgVector(new double[]{1,2,3});
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals("a", inst.stringValue(0));
      assertEquals("b", inst.stringValue(1));
      assertEquals("c", inst.stringValue(2));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}