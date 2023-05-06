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


public class CodexTest_0_6_4 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector a = new AlgVector(len);
    AlgVector b = new AlgVector(len);
    AlgVector c = a.add(b);
    assertEquals("Length differs", len, c.numElements());
    for (int i = 0; i < len; i++) {
      assertEquals("Element " + i + " differs", 0.0, c.getElement(i));
    }
  }
}