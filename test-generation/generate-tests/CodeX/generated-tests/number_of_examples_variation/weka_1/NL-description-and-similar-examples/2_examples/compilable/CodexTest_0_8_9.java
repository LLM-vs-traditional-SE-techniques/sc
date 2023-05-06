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


public class CodexTest_0_8_9 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{0.5, 1.5, 2.5, 3.5});
    AlgVector v2 = new AlgVector(new double[]{0.3, 1.3, 2.3, 3.3});
    AlgVector sum = v1.add(v2);
    assertTrue("Result not a vector", sum instanceof AlgVector);
    assertEquals("Length differs", v1.numElements(), sum.numElements());
    for(int i = 0; i < v1.numElements(); i++) {
      assertEquals((i+1) + ". value differs", v1.getElement(i) + v2.getElement(i), sum.getElement(i));
    }
  }
}