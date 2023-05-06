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


public class CodexTest_0_8_10 { 
  @Test
  public void testAdd() {
      int len = 22;
      AlgVector v = new AlgVector(len);
      double[] a = new double[len];
      for (int i = 0; i < len; i++) {
	      a[i] = rand.nextDouble();
      }
      v.setElements(a);
      AlgVector w = v.add(v);
      assertEquals("Length differs", len, w.numElements());
      for (int i = 0; i < len; i++) {
	      assertEquals((i+1) + ". value differs", 2.0*a[i], w.getElement(i));
      }
  }
}