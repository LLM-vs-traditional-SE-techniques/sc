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


public class CodexTest_0_5_54 { 
  @Test
  public void testAddVector() {
    AlgVector a = new AlgVector(new double[]{1.0, 2.0, 3.0});
    AlgVector b = new AlgVector(new double[]{1.0, 2.0, 3.0});
    AlgVector c = a.add(b);
    assertEquals(3, c.numElements());
    assertEquals(2.0, c.getElement(0), 1e-15);
    assertEquals(4.0, c.getElement(1), 1e-15);
    assertEquals(6.0, c.getElement(2), 1e-15);
  }
}