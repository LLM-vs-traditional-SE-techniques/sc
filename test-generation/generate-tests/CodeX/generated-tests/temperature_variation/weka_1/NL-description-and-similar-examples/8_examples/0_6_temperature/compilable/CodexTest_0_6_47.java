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


public class CodexTest_0_6_47 { 
  @Test
  public void testAddVector() {
    int len = 7;
    AlgVector v1 = new AlgVector(len);
    AlgVector v2 = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v1.setElement(i, i);
      v2.setElement(i, -i);
    }
    AlgVector v = v1.add(v2);
    for (int i = 0; i < len; i++) {
      assertEquals("Element " + i + " differs", 0.0, v.getElement(i));
    }
  }
}