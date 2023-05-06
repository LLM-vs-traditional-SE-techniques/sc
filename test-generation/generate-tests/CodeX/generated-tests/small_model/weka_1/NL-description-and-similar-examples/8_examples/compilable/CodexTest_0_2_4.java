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


public class CodexTest_0_2_4 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[] {1, 2, 3, 4, 5});
    AlgVector b = new AlgVector(new double[] {1, 2, 3, 4, 5});
    AlgVector c = a.add(b);
    assertEquals(c.getElement(0), 2.0, 0.0);
    assertEquals(c.getElement(1), 4.0, 0.0);
    assertEquals(c.getElement(2), 6.0, 0.0);
    assertEquals(c.getElement(3), 8.0, 0.0);
    assertEquals(c.getElement(4), 10.0, 0.0);
  }
}