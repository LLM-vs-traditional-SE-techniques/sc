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


public class CodexTest_0_3_9 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(3);
    AlgVector v2 = new AlgVector(3);
    AlgVector v3 = new AlgVector(3);
    v1.setElement(0, 1.0);
    v1.setElement(1, 2.0);
    v1.setElement(2, 3.0);
    v2.setElement(0, 4.0);
    v2.setElement(1, 5.0);
    v2.setElement(2, 6.0);
    v3.setElement(0, 5.0);
    v3.setElement(1, 7.0);
    v3.setElement(2, 9.0);
    AlgVector v = v1.add(v2);
    assertEquals("Length differs", v3.numElements(), v.numElements());
    for (int i = 0; i < v3.numElements(); i++) {
      assertEquals((i+1) + ". value differs", v3.getElement(i), v.getElement(i));
    }
  }
}