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


public class CodexTest_0_6_5 { 
  @Test
  public void testAdd() {
    AlgVector a = null;
    AlgVector b = null;
    AlgVector c = null;
    int n = 8;
    try {
      a = new AlgVector(n);
      b = new AlgVector(n);
      c = new AlgVector(n);
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(-1);
    }
    a.setElement(0, 1.0);
    a.setElement(1, 2.0);
    a.setElement(2, 3.0);
    a.setElement(3, 4.0);
    a.setElement(4, 5.0);
    a.setElement(5, 6.0);
    a.setElement(6, 7.0);
    a.setElement(7, 8.0);
    b.setElement(0, 10.0);
    b.setElement(1, 11.0);
    b.setElement(2, 12.0);
    b.setElement(3, 13.0);
    b.setElement(4, 14.0);
    b.setElement(5, 15.0);
    b.setElement(6, 16.0);
    b.setElement(7, 17.0);
    c = c.add(a);
    c = c.add(b);
    double element = 0;
    for (int i = 0; i < c.getSize(); i++) {
      element += c.getElement(i);
    }
    assertEquals(136.0, element, 0);
  }
}