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


public class CodexTest_0_9_12 { 
  @Test
   public void testAdd() {
    int len = 10;
    AlgVector v = new AlgVector(len);
    AlgVector w = new AlgVector(len);
    AlgVector x = v.add(w);
    assertEquals("Length differs", len, x.numElements());
    for (int i = 0; i < len; i++) {
      assertEquals((i + 1) + ". value differs", 0.0, x.getElement(i),
		   Double.MIN_VALUE);
    }
  }
}