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


public class CodexTest_0_7_56 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    v.setElement(1, 2.0);
    v.setElement(20, -1.0);
    AlgVector v2 = new AlgVector(len);
    v2.setElement(1, 1.0);
    v2.setElement(20, 1.0);
    AlgVector sum = v.add(v2);
    assertEquals("Length differs", len, sum.numElements());
    assertEquals("value differs", 3.0, sum.getElement(1));
    assertEquals("value differs", 0.0, sum.getElement(20));
  }
}