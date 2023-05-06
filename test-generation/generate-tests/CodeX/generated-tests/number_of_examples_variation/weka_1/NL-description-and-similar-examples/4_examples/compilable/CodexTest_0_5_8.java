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


public class CodexTest_0_5_8 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(3);
    AlgVector w = new AlgVector(3);
    v.setElement(0, 1);
    v.setElement(1, 2);
    v.setElement(2, 3);
    w.setElement(0, 4);
    w.setElement(1, 5);
    w.setElement(2, 6);
    AlgVector sum = v.add(w);
    assertEquals("Sum differs", 5, sum.getElement(0), 0.00001);
    assertEquals("Sum differs", 7, sum.getElement(1), 0.00001);
    assertEquals("Sum differs", 9, sum.getElement(2), 0.00001);
  }
}