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


public class CodexTest_0_6_14 { 
  @Test
  public void testAdd() {
    int len = 3;
    AlgVector v1 = new AlgVector(len);
    v1.setElement(0, 1.0);
    v1.setElement(1, 2.0);
    v1.setElement(2, 3.0);
    AlgVector v2 = new AlgVector(len);
    v2.setElement(0, 0.1);
    v2.setElement(1, 0.2);
    v2.setElement(2, 0.3);
    AlgVector v = v1.add(v2);
    assertEquals("Length differs", len, v.numElements());
    assertEquals("1. value differs", 1.1, v.getElement(0), 1e-15);
    assertEquals("2. value differs", 2.2, v.getElement(1), 1e-15);
    assertEquals("3. value differs", 3.3, v.getElement(2), 1e-15);
  }
}