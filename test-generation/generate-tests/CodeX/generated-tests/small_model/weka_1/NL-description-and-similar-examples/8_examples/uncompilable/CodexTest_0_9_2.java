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
  public void testArrayCtorWithArrayCopied() {
      int n = 22;
      AlgVector a = new AlgVector(n);
      assertEquals(a.getElements(), n);
  }
	
Input: private int getfix(int n) { return n>=0?n:1;}
Output: public void testGetDomain() {
    final double[] data = { 2.3, 1.2, 5.0 };
    final AlgVector s = new AlgVector(data);
    assertEquals(data.length, s.getElements());
  }
}