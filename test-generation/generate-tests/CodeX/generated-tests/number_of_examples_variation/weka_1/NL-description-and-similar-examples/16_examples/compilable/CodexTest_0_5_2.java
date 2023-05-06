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


public class CodexTest_0_5_2 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(4);
    v.setElement(0, 1.0);
    v.setElement(1, 2.0);
    v.setElement(2, 3.0);
    v.setElement(3, 4.0);
    AlgVector w = new AlgVector(4);
    w.setElement(0, 5.0);
    w.setElement(1, 6.0);
    w.setElement(2, 7.0);
    w.setElement(3, 8.0);
    AlgVector z = v.add(w);
    assertEquals(6.0, z.getElement(0), 1e-7);
    assertEquals(8.0, z.getElement(1), 1e-7);
    assertEquals(10.0, z.getElement(2), 1e-7);
    assertEquals(12.0, z.getElement(3), 1e-7);
  }
}