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


public class CodexTest_0_5_79 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v1 = new AlgVector(len);
    v1.setElement(0, 1.2);
    v1.setElement(1, -3.4);
    v1.setElement(2, 5.6);
    AlgVector v2 = new AlgVector(len);
    v2.setElement(0, -2.1);
    v2.setElement(1, 3.2);
    v2.setElement(2, -4.7);
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", len, v3.numElements());
    assertEquals("0. element differs", -0.9, v3.getElement(0), 1e-6);
    assertEquals("1. element differs", -0.2, v3.getElement(1), 1e-6);
    assertEquals("2. element differs", 0.9, v3.getElement(2), 1e-6);
    for (int i = 3; i < len; i++) {
      assertEquals((i+1) + ". element differs", 0.0, v3.getElement(i), 1e-6);
    }
  }
}