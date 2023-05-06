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


public class CodexTest_0_6_17 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(3);
    AlgVector b = new AlgVector(3);
    for (int i = 0; i < a.numElements(); i++) {
      a.setElement(i, i+1);
      b.setElement(i, i+1);
    }
    AlgVector c = a.add(b);
    assertEquals("Length differs", a.numElements(), c.numElements());
    for (int i = 0; i < a.numElements(); i++)
      assertEquals(i+1 + ". value differs", 2*i+2, c.getElement(i));
  }
}