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


public class CodexTest_0_9_2 { 
  @Test
  public void testAddVector() {
      AlgVector v = new AlgMatrixTest_BinFunc_1().get();
      AlgVector b = v.add(v);
      assertEquals("Size differs:", v.numElements(), b.numElements());
      for(int i = 0; i < v.numElements(); i++) {
	assertEquals("Content differs: " + i + " element", v.getElement(i) + v.getElement(i), b.getElement(i));
      }
    }
}