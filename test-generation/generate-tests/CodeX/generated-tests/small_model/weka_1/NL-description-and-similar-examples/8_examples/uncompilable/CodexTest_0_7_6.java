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


public class CodexTest_0_7_6 { 
  @Test
  public void testSubtract() {
    AlgVector a = new AlgVector(7);
    AlgVector b = new AlgVector(7);
    a.setElement(1, 1.0);
    a.setElement(3, 2.0);
    a.setElement(5, 3.0);
    b.setElement(1, 1.0);
    b.setElement(3, 1.0);
    b.setElement(5, 2.0);
    AlgVector c = a.subtract(b);
    assertEquals(c.getElement(1), 0.0);
    assertEquals(c.getElement(3), 0.0);
    assertEquals(c.getElement(5), -1.0);
  }
}