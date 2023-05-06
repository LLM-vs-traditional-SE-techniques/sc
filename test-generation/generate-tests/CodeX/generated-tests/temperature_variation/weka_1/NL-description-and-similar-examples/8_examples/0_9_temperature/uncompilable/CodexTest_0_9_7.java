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


public class CodexTest_0_9_7 { 
  @Test
   for (int i = 0; i < a.numElements(); i++) {
      assertEquals((i+1) + ". value differs", i, a.getElement(i));
    }
  } public void testAddition() {
    AlgVector a1 = new AlgVector(3);
    AlgVector a2 = new AlgVector(3);
    a1.setElement(0, 0.1);
    a1.setElement(1, 0.2);
    a1.setElement(2, 0.3);
    a2.setElement(0, 0.4);
    a2.setElement(1, 0.5);
    a2.setElement(2, 0.6);
    AlgVector res = a1.add(a2);
    assertEquals(res.getElement(0), 0.5, 1e-10);
    assertEquals(res.getElement(1), 0.7, 1e-10);
    assertEquals(res.getElement(2), 0.9, 1e-10);
  }
}