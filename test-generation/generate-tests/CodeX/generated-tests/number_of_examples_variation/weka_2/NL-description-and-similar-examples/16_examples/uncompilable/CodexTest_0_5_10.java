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


public class CodexTest_0_5_10 { 
  @Test
    public void testGetAsInstance() {
    double[] values = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
    AlgVector v = new AlgVector(values);
    Instances model = new Instances(new BufferedReader(new StringReader(
        "Relation test\n" + "Attribute a1 numeric\n" + "Attribute a2 numeric\n"
            + "Attribute a3 numeric\n" + "Attribute a4 numeric\n"
            + "Attribute a5 numeric\n" + "Attribute a6 numeric\n")), 1);
    try {
      Instance inst = v.getAsInstance(model, null);
      for (int i = 0; i < values.length; i++) {
        assertEquals(values[i], inst.value(i), 1e-6);
      }
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
  }
}