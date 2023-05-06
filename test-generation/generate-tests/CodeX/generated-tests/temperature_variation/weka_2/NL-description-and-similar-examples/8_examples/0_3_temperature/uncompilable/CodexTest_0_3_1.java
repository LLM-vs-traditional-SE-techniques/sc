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


public class CodexTest_0_3_1 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(new BufferedReader(new StringReader(
								       "A,B,C\n"+
								       "1,2,3\n"+
								       "4,5,6\n"+
								       "7,8,9\n")));
    data.setClassIndex(data.numAttributes() - 1);
    AlgVector v = new AlgVector(new double[]{1, 2, 3});
    try {
      Instance i = v.getAsInstance(data, new Random(1));
      assertEquals("A", i.stringValue(0));
      assertEquals("B", i.stringValue(1));
      assertEquals("C", i.stringValue(2));
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
}