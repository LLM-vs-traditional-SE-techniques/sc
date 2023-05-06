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


public class CodexTest_0_2_16 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances model = new Instances(new BufferedReader(new StringReader(
									   "Id,Class,Nom1,Nom2,Num1,Num2\n" +
									   "1,1,a,b,1.0,2.0\n" +
									   "2,2,c,d,3.0,4.0\n" +
									   "3,1,a,d,5.0,6.0\n" +
									   "4,2,c,b,7.0,8.0\n")));
      model.setClassIndex(1);
      double[] values = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
      AlgVector v = new AlgVector(values);
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Num1", 1.0, inst.value(4), 1e-6);
      assertEquals("Num2", 2.0, inst.value(5), 1e-6);
      assertEquals("Nom1", "a", inst.stringValue(2));
      assertEquals("Nom2", "b", inst.stringValue(3));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}