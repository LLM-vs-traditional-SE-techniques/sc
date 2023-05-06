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


public class CodexTest_0_7_65 { 
  @Test
  public void testAdd() {
    AlgVector b = new AlgVector(5);
    b.setElement(0, 1);
    b.setElement(1, 2);
    b.setElement(2, 3);
    b.setElement(3, 4);
    b.setElement(4, 5);
    AlgVector a = new AlgVector(5);
    a.setElement(0, 1);
    a.setElement(1, 2);
    a.setElement(2, 3);
    a.setElement(3, 4);
    a.setElement(4, 5);
    AlgVector c = a.add(b);
    assertEquals(c.getElement(0), 2);
    assertEquals(c.getElement(1), 4);
    assertEquals(c.getElement(2), 6);
    assertEquals(c.getElement(3), 8);
    assertEquals(c.getElement(4), 10);
  }
}