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


public class CodexTest_0_5_7 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[] {1, 2, 3});
    AlgVector b = new AlgVector(new double[] {1, 2, 3});
    AlgVector c = a.add(b);
    assertTrue("Vector not created", (c != null));
    assertEquals("Length differs", 3, c.numElements());
    assertEquals("1. value differs", 2.0, c.getElement(0));
    assertEquals("2. value differs", 4.0, c.getElement(1));
    assertEquals("3. value differs", 6.0, c.getElement(2));
  }
}