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


public class CodexTest_0_6_29 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    Random r = new Random(12345);
    for (int i = 0; i < len; i++) {
      v.setElement(i, r.nextDouble());
    }
    AlgVector v2 = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v2.setElement(i, r.nextDouble());
    }
    AlgVector v3 = v.add(v2);
    assertEquals("Length differs", len, v3.numElements());
    for (int i = 0; i < len; i++) {
      assertEquals((i+1) + ". value differs", v.getElement(i) + v2.getElement(i), v3.getElement(i));
    }
  }
}