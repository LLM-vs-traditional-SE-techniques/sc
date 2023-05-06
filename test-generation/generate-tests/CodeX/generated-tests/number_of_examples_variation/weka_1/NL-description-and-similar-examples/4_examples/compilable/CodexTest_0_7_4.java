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


public class CodexTest_0_7_4 { 
   @Test
   public void testAdd() {
    int length = 10;
    AlgVector v1 = new AlgVector(length);
    AlgVector v2 = new AlgVector(length);
    for (int i = 0; i < length; i++) {
      v1.setElement(i, i);
      v2.setElement(i, i);
    }
    AlgVector v3 = v1.add(v2);
    assertEquals("Incorrect length", length, v3.numElements());
    for (int i = 0; i < length; i++) {
      assertEquals("Incorrect element value", v1.getElement(i) + v2.getElement(i), v3.getElement(i), 0);
    }
  }
}