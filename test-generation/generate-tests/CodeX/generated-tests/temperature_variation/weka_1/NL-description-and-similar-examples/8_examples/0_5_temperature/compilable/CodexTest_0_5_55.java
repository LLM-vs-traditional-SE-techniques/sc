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


public class CodexTest_0_5_55 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{1, 2, 3});
    AlgVector v2 = new AlgVector(new double[]{4, 5, 6});
    AlgVector sum = v1.add(v2);
    assertEquals("Sum differs", 5.0, sum.getElement(0), 1e-10);
    assertEquals("Sum differs", 7.0, sum.getElement(1), 1e-10);
    assertEquals("Sum differs", 9.0, sum.getElement(2), 1e-10);
  }
}