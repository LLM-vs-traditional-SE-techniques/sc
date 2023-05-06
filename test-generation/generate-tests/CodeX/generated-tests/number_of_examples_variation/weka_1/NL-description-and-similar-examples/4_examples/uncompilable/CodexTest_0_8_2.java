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


public class CodexTest_0_8_2 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[] {5, 2, 3});
    AlgVector v2 = new AlgVector(new double[] {2, 3, 4});
    double[] expected = {7, 5, 7};
    AlgVector v3 = (AlgVector)v1.add(v2);
    assertEquals("Length differs", expected.length, v3.numElements());
    for (int i = 0; i < expected.length; i++)
      assertEquals("value differs", expected[i], v3.getElement(i), EPSILON);
  }
}