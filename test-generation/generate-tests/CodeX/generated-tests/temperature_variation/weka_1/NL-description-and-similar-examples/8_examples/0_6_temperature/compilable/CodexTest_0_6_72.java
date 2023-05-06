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


public class CodexTest_0_6_72 { 
  @Test
  public void testAdd() {
    int n = 5;
    AlgVector a = new AlgVector(n);
    AlgVector b = new AlgVector(n);
    for(int i = 0; i < n; i++) {
      a.setElement(i, i);
      b.setElement(i, n-i);
    }
    AlgVector c = a.add(b);
    for(int i = 0; i < n; i++) {
      assertTrue("Element " + i + " differs", 
		 Utils.eq(c.getElement(i), (double)(i + n - i)));
    }
  }
}