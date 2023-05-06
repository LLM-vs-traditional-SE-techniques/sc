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


public class CodexTest_0_6_89 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[] {2, 3, 5});
    AlgVector v2 = new AlgVector(new double[] {7, 11, 13});
    AlgVector s = v1.add(v2);
    assertEquals("Length differs", 3, s.numElements());
    assertEquals("1. value differs", 9.0, s.getElement(0), 1e-10);
    assertEquals("2. value differs", 14.0, s.getElement(1), 1e-10);
    assertEquals("3. value differs", 18.0, s.getElement(2), 1e-10);
  }
}