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


public class CodexTest_0_6_59 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(1.2, 2.3, 3.4, 4.5);
    AlgVector b = new AlgVector(5.6, 6.7, 7.8, 8.9);
    AlgVector c = a.add(b);
    assertEquals("Length differs", a.numElements(), c.numElements());
    for (int i = 0; i < a.numElements(); i++) {
      double result = a.getElement(i) + b.getElement(i);
      assertEquals((i+1) + ". value differs", result, c.getElement(i));
    }
  }
}