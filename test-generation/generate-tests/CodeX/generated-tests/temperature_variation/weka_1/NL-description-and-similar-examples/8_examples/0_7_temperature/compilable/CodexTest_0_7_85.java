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


public class CodexTest_0_7_85 { 
  @Test
  public void testAdd() {
    AlgVector a = null;
    AlgVector b = null;
    AlgVector c = null;
    AlgVector d = null;
    try {
      a = new AlgVector(10);
      b = new AlgVector(10);
      for (int i = 0; i < 10; i++) {
	a.setElement(i, i+1);
	b.setElement(i, i+1);
      }
      c = a.add(b);
      assertEquals(10, c.numElements());
      for (int i = 0; i < 10; i++) {
	assertEquals((i+1)*2, c.getElement(i), 0);
      }
      d = a.add(a);
      assertEquals(10, d.numElements());
      for (int i = 0; i < 10; i++) {
	assertEquals((i+1)*2, d.getElement(i), 0);
      }
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
}