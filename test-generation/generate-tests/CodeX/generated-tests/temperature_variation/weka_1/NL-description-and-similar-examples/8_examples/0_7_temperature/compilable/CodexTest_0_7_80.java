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


public class CodexTest_0_7_80 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[] {1, 2, 3});
    AlgVector v2 = new AlgVector(new double[] {2, 3, 4});
    AlgVector v3 = new AlgVector(new double[] {3, 5, 7});
    AlgVector v = v1.add(v2);
    assertEquals("length differs", 3, v.numElements());
    assertEquals("1. value differs", 3., v.getElement(0), 0.);
    assertEquals("2. value differs", 5., v.getElement(1), 0.);
    assertEquals("3. value differs", 7., v.getElement(2), 0.);
    assertEquals("addition not commutative", v, v2.add(v1));
    assertEquals("addition not associative", v3, v.add(v2));
  }
}