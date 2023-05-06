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


public class CodexTest_0_7_91 { 
  @Test
  public void testAdd() {
    double[] data = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
    double[] data2 = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0};
    AlgVector v = new AlgVector(data);
    AlgVector v2 = new AlgVector(data2);
    AlgVector v3 = v.add(v2);
    assertEquals("Length differs", v3.numElements(), v.numElements());
    assertEquals("Length differs", v3.numElements(), v2.numElements());
    for (int i = 0; i < v3.numElements(); i++) {
      assertEquals((i+1) + ". value differs", v3.getElement(i), v.getElement(i) + v2.getElement(i));
    }
  }
}