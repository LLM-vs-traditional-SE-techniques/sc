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


public class CodexTest_0_4_68 { 
  @Test
    public void testGetAsInstance() {
    double[] values = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(values);
    Instances model = new Instances(new BufferedReader(new StringReader(
        "M,N,O\n"
        + "0,1,2\n"
        + "0,2,3\n"
        + "1,1,2\n"
        + "1,2,3\n"
        + "2,1,2\n"
        + "2,2,3\n")));
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Number of values differs", values.length, inst.numValues());
      assertEquals("Value differs", values[0], inst.value(0));
      assertEquals("Value differs", values[1], inst.value(1));
      assertEquals("Value differs", values[2], inst.value(2));
      assertEquals("Value differs", 1, inst.value(3));
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}