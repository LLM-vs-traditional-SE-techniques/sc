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


public class CodexTest_0_6_74 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(new double[] {1, 2, 3});
    AlgVector w = new AlgVector(new double[] {0.5, 0.5, 0.5});
    AlgVector x = v.add(w);
    assertEquals(3, x.numElements());
    assertEquals(1.5, x.getElement(0), 1e-10);
    assertEquals(2.5, x.getElement(1), 1e-10);
    assertEquals(3.5, x.getElement(2), 1e-10);
    assertNotSame(v, x);
  }
}