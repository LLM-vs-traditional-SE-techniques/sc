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


public class CodexTest_0_3_10 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
								      "A,B,C\n" +
								      "0,1,2\n" +
								      "0,1,2\n" +
								      "0,1,2\n")));
    AlgVector v = new AlgVector(new double[]{1, 2, 3});
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("A", inst.stringValue(0));
      assertEquals("2", inst.stringValue(1));
      assertEquals("1", inst.stringValue(2));
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}