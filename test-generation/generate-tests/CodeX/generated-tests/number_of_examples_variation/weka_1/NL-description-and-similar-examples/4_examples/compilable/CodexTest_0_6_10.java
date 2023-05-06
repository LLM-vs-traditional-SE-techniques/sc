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


public class CodexTest_0_6_10 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    AlgVector u = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v.setElement(i, Math.random());
      u.setElement(i, Math.random());
    }
    AlgVector w = v.add(u);
    assertEquals("Length differs", len, w.numElements());
    for (int i = 0; i < len; i++) {
      assertEquals((i+1) + ". value differs", v.getElement(i) + u.getElement(i), w.getElement(i));
    }
  }
}