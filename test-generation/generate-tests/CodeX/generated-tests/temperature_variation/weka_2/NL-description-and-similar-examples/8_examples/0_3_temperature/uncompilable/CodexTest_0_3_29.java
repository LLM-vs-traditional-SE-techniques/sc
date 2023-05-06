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


public class CodexTest_0_3_29 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances model = new Instances(new BufferedReader(new StringReader(
									  "A,B,C,D\n" +
									  "0,1,2,3\n" +
									  "1,2,3,4\n" +
									  "2,3,4,5\n" +
									  "3,4,5,6\n" +
									  "4,5,6,7\n" +
									  "5,6,7,8\n" +
									  "6,7,8,9\n" +
									  "7,8,9,10\n" +
									  "8,9,10,11\n" +
									  "9,10,11,12\n")));
      model.setClassIndex(model.numAttributes() - 1);
      double[] values = {1.0, 2.0, 3.0, 4.0};
      AlgVector v = new AlgVector(values);
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("A", inst.stringValue(0));
      assertEquals("B", inst.stringValue(1));
      assertEquals("C", inst.stringValue(2));
      assertEquals("D", inst.stringValue(3));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}