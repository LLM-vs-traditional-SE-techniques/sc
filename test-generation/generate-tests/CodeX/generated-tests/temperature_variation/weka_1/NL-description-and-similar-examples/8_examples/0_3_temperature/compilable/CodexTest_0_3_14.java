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


public class CodexTest_0_3_14 { 
  @Test
    public void testAdd() {
    AlgVector a = new AlgVector(new double[] {1, 2, 3});
    AlgVector b = new AlgVector(new double[] {4, 5, 6});
    AlgVector c = a.add(b);
    assertEquals("Length differs", a.numElements(), c.numElements());
    assertEquals("1. value differs", 5.0, c.getElement(0), 1e-10);
    assertEquals("2. value differs", 7.0, c.getElement(1), 1e-10);
    assertEquals("3. value differs", 9.0, c.getElement(2), 1e-10);
  }
}