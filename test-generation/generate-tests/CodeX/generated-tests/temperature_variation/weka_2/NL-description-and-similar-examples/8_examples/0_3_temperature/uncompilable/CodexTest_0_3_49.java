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


public class CodexTest_0_3_49 { 
  @Test
  public void testGetAsInstance() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances dataset = new Instances(new StringReader(
						       "a,b,c\n" +
						       "1,2,3\n" +
						       "4,5,6\n"));
    try {
      Instance inst = v.getAsInstance(dataset, new Random(1));
      assertEquals("Number of attributes differs", 3, inst.numAttributes());
      assertEquals("1. attribute differs", 1.0, inst.value(0));
      assertEquals("2. attribute differs", 2.0, inst.value(1));
      assertEquals("3. attribute differs", 3.0, inst.value(2));
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
  }
}