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


public class CodexTest_0_9_15 { 
  @Test
  public void testAdd() {
    int n = 22;
    AlgVector a = new AlgVector(n);
    AlgVector b = new AlgVector(n);
    AlgVector c = new AlgVector(n);
    RandomGenerator rg = new JDKRandomGenerator();
    rg.setSeed(1481112230895L);
    for (int i = 0; i < n; i++) {
      a.setElement(i, rg.nextDouble());
    }
    for (int i = 0; i < n; i++) {
      b.setElement(i, rg.nextDouble());
    }
    c = a.add(b);
    for (int i = 0; i < n; i++) {
      assertEquals("Check add method", a.getElement(i) + b.getElement(i), c.getElement(i), TOLERANCE);
    }
  }
}