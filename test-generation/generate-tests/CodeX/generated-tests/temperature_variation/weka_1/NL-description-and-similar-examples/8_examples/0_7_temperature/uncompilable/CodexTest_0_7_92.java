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


public class CodexTest_0_7_92 { 
  @Test
    public void testAdd() {
    AlgVector a = new AlgVector(new double[]{5.5, 4.5, 3.5, 2.5});
    AlgVector b = new AlgVector(new double[]{0.5, 1.5, 2.5, 3.5});
    AlgVector result = a.add(b);
    assertNotNull("Result must not be null", result);
    assertEquals("Number of elements differs", 4, result.numElements());
    assertEquals("Wrong element value (1)", 6.0, result.getElement(0), EPSILON);
    assertEquals("Wrong element value (2)", 6.0, result.getElement(1), EPSILON);
    assertEquals("Wrong element value (3)", 6.0, result.getElement(2), EPSILON);
    assertEquals("Wrong element value (4)", 6.0, result.getElement(3), EPSILON);
  }
}