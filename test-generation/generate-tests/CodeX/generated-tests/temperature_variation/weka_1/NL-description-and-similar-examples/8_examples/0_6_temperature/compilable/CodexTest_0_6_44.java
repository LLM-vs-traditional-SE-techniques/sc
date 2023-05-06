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


public class CodexTest_0_6_44 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[] {1.0, 2.0, 3.0});
    AlgVector b = new AlgVector(new double[] {4.0, 5.0, 6.0});
    AlgVector c = a.add(b);
    assertEquals(3, c.numElements());
    assertEquals(5.0, c.getElement(0), 1e-10);
    assertEquals(7.0, c.getElement(1), 1e-10);
    assertEquals(9.0, c.getElement(2), 1e-10);
  }
}