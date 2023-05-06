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


public class CodexTest_0_6_87 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[]{2, 3, 4});
    AlgVector b = new AlgVector(new double[]{4, 5, 6});
    AlgVector c = a.add(b);
    assertEquals("Length differs", a.numElements(), c.numElements());
    assertEquals("1. value differs", 6, c.getElement(0), 0.001);
    assertEquals("2. value differs", 8, c.getElement(1), 0.001);
    assertEquals("3. value differs", 10, c.getElement(2), 0.001);
  }
}