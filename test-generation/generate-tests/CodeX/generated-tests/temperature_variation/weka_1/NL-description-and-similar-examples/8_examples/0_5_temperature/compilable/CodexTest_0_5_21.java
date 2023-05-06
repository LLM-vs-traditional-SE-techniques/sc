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


public class CodexTest_0_5_21 { 
  @Test
  public void testAdd() {
    int n = 4;
    AlgVector a = new AlgVector(n);
    AlgVector b = new AlgVector(n);
    AlgVector c = new AlgVector(n);
    a.setElement(0, 0.0);
    a.setElement(1, 1.0);
    a.setElement(2, 2.0);
    a.setElement(3, 3.0);
    b.setElement(0, 0.0);
    b.setElement(1, 4.0);
    b.setElement(2, 5.0);
    b.setElement(3, 6.0);
    c.setElement(0, 0.0);
    c.setElement(1, 5.0);
    c.setElement(2, 7.0);
    c.setElement(3, 9.0);
    AlgVector d = a.add(b);
    assertEquals("Element 0 differs", c.getElement(0), d.getElement(0));
    assertEquals("Element 1 differs", c.getElement(1), d.getElement(1));
    assertEquals("Element 2 differs", c.getElement(2), d.getElement(2));
    assertEquals("Element 3 differs", c.getElement(3), d.getElement(3));
  }
}