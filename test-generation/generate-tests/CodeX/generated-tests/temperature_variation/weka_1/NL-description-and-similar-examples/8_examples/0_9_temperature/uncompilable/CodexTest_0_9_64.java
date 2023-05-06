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


public class CodexTest_0_9_64 { 
    @Test
  public void testAdd() throws Exception {
      int len = 22;
      AlgVector a = new AlgVector(len);
      AlgVector b = new AlgVector(len);
      a.setElement(3, 1.23);
      a.setElement(5, 2.34);
      b.setElement(3, 1.23);
      b.setElement(5, 2.34);
      assertEquals("add for matching vectors failed",
               a.add(b), b.add(a));
      a.setElement(12, 5.67);
      assertEquals("add for differently sized vectors failed",
               a.add(b).getElement(12), a.getElement(12));
      a.setElement(0, 0);
      b.setElement(0, 0);
      a.setElement(3, 0);
      a.setElement(5, 0);
      a.add(b);
      assertEquals("add without setElement failed",
               a.getElement(5), 0, DEFAULT_DELTA);
  }
}