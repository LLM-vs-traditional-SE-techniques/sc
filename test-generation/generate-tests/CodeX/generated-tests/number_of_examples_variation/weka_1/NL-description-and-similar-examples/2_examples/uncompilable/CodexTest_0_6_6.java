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


public class CodexTest_0_6_6 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{2.0, 3.0});
    AlgVector v2 = new AlgVector(new double[]{1.0, 3.2});
    AlgVector v3 = v1.add(v2);
    assertEquals("Number of elements differs", v1.numElements(), v3.numElements());
    assertEquals("Element 0 differs", 3.0, v3.getElement(0), DELTA);
    assertEquals("Element 1 differs", 6.2, v3.getElement(1), DELTA);
  }
}