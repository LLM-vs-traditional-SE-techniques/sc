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


public class CodexTest_0_8_53 { 
  @Test
  public void testAdd() {
    double[] d1 = new double[]{10, 20, 30, 40};
    double[] d2 = new double[]{1, 2, 3, 4};
    AlgVector v1 = new AlgVector(d1);
    AlgVector v2 = new AlgVector(d2);
    AlgVector v3 = v1.add(v2);
    assertEquals("Array length differs", d1.length, v3.m_Elements.length);
    for (int i = 0; i < d1.length; i++) {
      assertEquals("Element " + i + " differs", d1[i] + d2[i], v3.m_Elements[i]);
    }
  }
}