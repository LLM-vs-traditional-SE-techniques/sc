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


public class CodexTest_0_6_1 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[] {1.0, 2.0});
    AlgVector b = new AlgVector(new double[] {3.0, 4.0});
    AlgVector c = a.add(b);
    assertEquals("Length differs", 2, c.numElements());
    assertEquals("1. value differs", 4.0, c.getElement(0), 1e-10);
    assertEquals("2. value differs", 6.0, c.getElement(1), 1e-10);
  }
}