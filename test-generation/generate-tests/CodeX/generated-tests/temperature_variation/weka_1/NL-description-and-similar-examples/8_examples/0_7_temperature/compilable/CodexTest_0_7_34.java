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


public class CodexTest_0_7_34 { 
  @Test
     public void testAdd() {
      int len = 22;
      AlgVector v = new AlgVector(len);
      AlgVector v2 = new AlgVector(len);
      v.setElement(0, 1);
      v.setElement(1, 2);
      v.setElement(2, 3);
      v2.setElement(0, 3);
      v2.setElement(1, 2);
      v2.setElement(2, 1);
      v.add(v2);
      assertEquals(1, v.getElement(0), 0);
      assertEquals(4, v.getElement(1), 0);
      assertEquals(4, v.getElement(2), 0);
    }
}