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


public class CodexTest_0_5_2 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(3);
    a.setElement(0, 1);
    a.setElement(1, 2);
    a.setElement(2, 3);
    AlgVector b = new AlgVector(3);
    b.setElement(0, 4);
    b.setElement(1, 5);
    b.setElement(2, 6);
    AlgVector c = a.add(b);
    assertEquals(a.getElement(0) + b.getElement(0), c.getElement(0), 0.0);
    assertEquals(a.getElement(1) + b.getElement(1), c.getElement(1), 0.0);
    assertEquals(a.getElement(2) + b.getElement(2), c.getElement(2), 0.0);
  }
}