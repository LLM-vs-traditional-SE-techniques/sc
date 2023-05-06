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


public class CodexTest_0_2_15 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(3);
    v.setElement(0, 1.0);
    v.setElement(1, 2.0);
    v.setElement(2, 3.0);
    AlgVector w = new AlgVector(3);
    w.setElement(0, 4.0);
    w.setElement(1, 5.0);
    w.setElement(2, 6.0);
    AlgVector u = v.add(w);
    assertEquals("Length differs", 3, u.numElements());
    assertEquals("1. value differs", 5.0, u.getElement(0));
    assertEquals("2. value differs", 7.0, u.getElement(1));
    assertEquals("3. value differs", 9.0, u.getElement(2));
  }
}