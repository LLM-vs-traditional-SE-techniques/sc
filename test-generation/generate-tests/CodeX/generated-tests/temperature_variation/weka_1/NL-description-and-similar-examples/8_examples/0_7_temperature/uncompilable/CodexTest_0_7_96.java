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


public class CodexTest_0_7_96 { 
  @Test
    public void testDiv() {
    DoubleMatrix1D a = new DenseDoubleMatrix1D(new double[]{1,2,3});
    DoubleMatrix1D b = new DenseDoubleMatrix1D(new double[]{0,2,3});
    a.assign(b, DoubleFunctions.div);
    assertEquals(Double.POSITIVE_INFINITY, a.get(0), TOL);
    assertEquals(1, a.get(1), TOL);
    assertEquals(1, a.get(2), TOL);
  }
  
Input: public final int numElements() {
      return m_Elements.length;
  }
Output: public void testLengthConstructor() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    assertEquals("Length differs", len, v.numElements());
  }
}