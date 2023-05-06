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


public class CodexTest_0_7_9 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(10);
    AlgVector v2 = new AlgVector(10);
    AlgVector vres = v1.add(v2);
    assertEquals("Element 0 differs", 0, vres.getElement(0), 1E-10);
    assertEquals("Element 1 differs", 0, vres.getElement(1), 1E-10);
    assertEquals("Element 2 differs", 0, vres.getElement(2), 1E-10);
    assertEquals("Element 3 differs", 0, vres.getElement(3), 1E-10);
    assertEquals("Element 4 differs", 0, vres.getElement(4), 1E-10);
    assertEquals("Element 5 differs", 0, vres.getElement(5), 1E-10);
    assertEquals("Element 6 differs", 0, vres.getElement(6), 1E-10);
    assertEquals("Element 7 differs", 0, vres.getElement(7), 1E-10);
    assertEquals("Element 8 differs", 0, vres.getElement(8), 1E-10);
    assertEquals("Element 9 differs", 0, vres.getElement(9), 1E-10);
  }
```
}