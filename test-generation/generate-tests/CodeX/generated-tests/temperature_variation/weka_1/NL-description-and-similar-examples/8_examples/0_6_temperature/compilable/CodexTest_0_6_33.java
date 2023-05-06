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


public class CodexTest_0_6_33 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    AlgVector w = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v.setElement(i, 2.0*i - 1.0);
      w.setElement(i, i);
    }
    AlgVector z = v.add(w);
    assertEquals("Length differs", len, z.numElements());
    for (int i = 0; i < len; i++) {
      assertEquals("Value differs", 2.0*i, z.getElement(i), 0.0);
    }
  }
}