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


public class CodexTest_0_8_76 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[] {3.5, -2.2, 0.0});
    AlgVector b = new AlgVector(new double[] {3.5, 2.2, 0.0});
    AlgVector c = a.add(b);
    assertTrue("sum instance incorrect", c instanceof AlgVector);
    assertEquals("sum length incorrect", 3, c.numElements());
    for (int i = 0; i < 3; i++) {
      double val = c.getElement(i);
      assertEquals("sum element " + i + " incorrect", a.getElement(i) + b.getElement(i), val);
    }
  }
}