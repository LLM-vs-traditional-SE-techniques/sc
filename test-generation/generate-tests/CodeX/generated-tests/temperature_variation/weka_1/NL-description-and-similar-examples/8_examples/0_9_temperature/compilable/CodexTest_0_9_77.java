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


public class CodexTest_0_9_77 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(5);
    for (int i = 0; i < v.numElements(); i++) {
      v.setElement(i, i);
    }
    AlgVector w = new AlgVector(5);
    w.setElement(0, 1);
    w.setElement(1, 2);
    w.setElement(2, 3);
    w.setElement(3, 4);
    w.setElement(4, 5);
    AlgVector u = v.add(w);
    assertEquals(1, u.getElement(0));
    assertEquals(3, u.getElement(1));
    assertEquals(5, u.getElement(2));
    assertEquals(7, u.getElement(3));
    assertEquals(9, u.getElement(4));
  }
}