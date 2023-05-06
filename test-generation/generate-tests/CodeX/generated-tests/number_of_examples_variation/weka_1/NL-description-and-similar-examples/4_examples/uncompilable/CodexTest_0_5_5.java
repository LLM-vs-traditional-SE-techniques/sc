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


public class CodexTest_0_5_5 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{2.0, 3.0, 5.0});
    AlgVector v2 = new AlgVector(new double[]{7.0, 11.0, 13.0});
    AlgVector v3 = v1.add(v2);
    assertEquals("Wrong number of elements", 3, v3.numElements());
    assertEquals("Wrong element 0", 9.0, v3.getElement(0), EPSILON);
    assertEquals("Wrong element 1", 14.0, v3.getElement(1), EPSILON);
    assertEquals("Wrong element 2", 18.0, v3.getElement(2), EPSILON);
  }
}