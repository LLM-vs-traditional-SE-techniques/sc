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


public class CodexTest_0_9_67 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[] {1.0, 2.0, 3.0});
    AlgVector b = new AlgVector(new double[] {11.0, 22.0, 33.0});
    AlgVector c = a.add(b);
    assertEquals("1. value differs", 12.0, c.getElement(0), 0.0);
    assertEquals("2. value differs", 24.0, c.getElement(1), 0.0);
    assertEquals("3. value differs", 36.0, c.getElement(2), 0.0);
  }
}