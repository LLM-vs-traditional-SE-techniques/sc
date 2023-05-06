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


public class CodexTest_0_5_93 { 
  @Test
  public void testGetAsInstance() {
    Random r = new Random(1);
    double[] values = {1, 2, 3, 4, 5};
    AlgVector v = new AlgVector(values);
    try {
      Instances i = new Instances(new BufferedReader(new StringReader(
								       "A,B,C\n" +
								       "1,2,3\n" +
								       "a,b,c\n" +
								       "3,2,1\n")));
      i.setClassIndex(2);
      Instance inst = v.getAsInstance(i, r);
      assertEquals("A", inst.stringValue(0));
      assertEquals("b", inst.stringValue(1));
      assertEquals(2, inst.classValue());
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
  }
}