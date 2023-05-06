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


public class CodexTest_0_9_4 { 
  @Test
  public void testAddTwoVectors() {
    int len = 22;
    AlgVector v1 = new AlgVector(len);
    AlgVector v2 = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v1.setElement(i, Math.random());
      v2.setElement(i, Math.random());
    }
    AlgVector res = v1.add(v2);
    assertEquals("Length differs", len, res.numElements());
    for (int i = 0; i < len; i++) {
      assertEquals((i+1) + ". value differs", v1.getElement(i) + v2.getElement(i), res.getElement(i));
    }
  }

}