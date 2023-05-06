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


public class CodexTest_0_3_2 { 
  @Test
  public void testGetAsInstance() {
    Instances data = null;
    try {
      data = new Instances(new BufferedReader(new StringReader(
							       "A,B,C\n" +
							       "1,2,3\n" +
							       "4,5,6\n" +
							       "7,8,9\n")));
    } catch (Exception e) {
      fail("Problem reading data: " + e);
    }
    AlgVector v = new AlgVector(new double[] {1, 2, 3});
    try {
      Instance inst = v.getAsInstance(data, new Random(1));
      assertEquals("Number of attributes differ", data.numAttributes(),
		   inst.numAttributes());
      assertEquals("First value differs", 1, inst.value(0));
      assertEquals("Second value differs", 2, inst.value(1));
      assertEquals("Third value differs", 3, inst.value(2));
    } catch (Exception e) {
      fail("Problem with getAsInstance: " + e);
    }
  }
}