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


public class CodexTest_0_5_11 { 
  @Test
    public void testAddition() {
    int n = 5;
    AlgVector a = new AlgVector(n);
    AlgVector b = new AlgVector(n);
    for (int i = 0; i < n; i++) {
      a.setElement(i, Math.random());
      b.setElement(i, Math.random());
    }
    AlgVector c = a.add(b);
    for (int i = 0; i < n; i++) {
      assertEquals("Element " + i + " differs", a.getElement(i) + b.getElement(i), c.getElement(i));
    }
  }
}