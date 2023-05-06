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


public class CodexTest_0_5_7 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(3);
    AlgVector v2 = new AlgVector(3);
    v1.setElement(0, 1.0);
    v1.setElement(1, 2.0);
    v1.setElement(2, 3.0);
    v2.setElement(0, 4.0);
    v2.setElement(1, 5.0);
    v2.setElement(2, 6.0);
    AlgVector v3 = v1.add(v2);
    assertEquals("length differs", 3, v3.numElements());
    assertEquals("1. value differs", 5.0, v3.getElement(0));
    assertEquals("2. value differs", 7.0, v3.getElement(1));
    assertEquals("3. value differs", 9.0, v3.getElement(2));
  }
}