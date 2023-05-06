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


public class CodexTest_0_6_8 { 
  @Test
  public void testAdd() {
    int len = 5;
    AlgVector a = new AlgVector(len);
    AlgVector b = new AlgVector(len);
    AlgVector c = null;
    for (int i = 0; i < len; i++) {
      a.setElement(i, i + 1);
      b.setElement(i, i + 1);
    }
    c = a.add(b);
    for (int i = 0; i < len; i++) {
      assertEquals((i + 1) + + + (i + 1) + = + c.getElement(i),
		   2*(i + 1), c.getElement(i), 1e-12);
    }
  }
}