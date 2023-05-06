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


public class CodexTest_0_5_3 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[]{1.0, 2.0, 3.0});
    AlgVector b = new AlgVector(new double[]{1.0, 2.0});
    AlgVector c = a.add(b);
    assertEquals(3, c.numElements());
    assertEquals(2.0, c.getElement(0), EPSILON);
    assertEquals(4.0, c.getElement(1), EPSILON);
    assertEquals(3.0, c.getElement(2), EPSILON);
  }
}