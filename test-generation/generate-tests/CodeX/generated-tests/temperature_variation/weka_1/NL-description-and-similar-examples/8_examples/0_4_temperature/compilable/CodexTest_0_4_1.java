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


public class CodexTest_0_4_1 { 
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
    AlgVector a = v.add(w);
    assertEquals(5.0, a.getElement(0), 1e-10);
    assertEquals(7.0, a.getElement(1), 1e-10);
    assertEquals(9.0, a.getElement(2), 1e-10);
  }
}