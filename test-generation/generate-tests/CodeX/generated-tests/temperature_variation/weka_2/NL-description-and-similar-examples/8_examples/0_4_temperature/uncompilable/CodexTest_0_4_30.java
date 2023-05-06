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


public class CodexTest_0_4_30 { 
  @Test
  public void testGetAsInstance() {
    // create a dataset
    Instances data = new Instances(new BufferedReader(new StringReader(
								       "A,B,C\n" +
								       "1,2,3\n" +
								       "4,5,6\n" +
								       "7,8,9\n")));
    AlgVector v = new AlgVector(new double[]{1,2,3});
    try {
      Instance i = v.getAsInstance(data, new Random(1));
      assertEquals("First value", 1.0, i.value(0));
      assertEquals("Second value", 2.0, i.value(1));
      assertEquals("Third value", 3.0, i.value(2));
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}