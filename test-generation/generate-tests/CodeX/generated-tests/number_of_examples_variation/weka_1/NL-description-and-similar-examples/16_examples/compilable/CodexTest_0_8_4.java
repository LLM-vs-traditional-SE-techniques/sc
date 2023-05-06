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


public class CodexTest_0_8_4 { 
  @Test
  public void testAdd() {
      AlgVector v1 = new AlgVector(5);
      AlgVector v2 = new AlgVector(5);
      for (int i=0;i<5;i++) {
          v1.setElement(i,i);
          v2.setElement(i,10*i-7);
      }
      AlgVector v3 = v1.add(v2);
      assertEquals("testAdd", v3.getElement(0), -7, 0);
      assertEquals("testAdd", v3.getElement(1), 3, 0);
      assertEquals("testAdd", v3.getElement(2), 7, 0);
      assertEquals("testAdd", v3.getElement(3), 11, 0);
      assertEquals("testAdd", v3.getElement(4), 15, 0);
  }
}