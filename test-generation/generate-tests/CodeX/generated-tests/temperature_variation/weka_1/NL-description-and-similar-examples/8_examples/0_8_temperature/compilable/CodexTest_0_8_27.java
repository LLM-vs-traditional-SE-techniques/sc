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


public class CodexTest_0_8_27 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{1.0, 2.0, 3.0});
    AlgVector v2 = new AlgVector(new double[]{4.0, 5.0, 6.0});
    AlgVector v3 = v1.add(v2);
    assertNotNull("Addition failed", v3);
    assertEquals("Number of components differ", v1.numElements(), v3.numElements());
    assertEquals("1st component differs", 1.0 + 4.0, v3.getElement(0), 1e-20);
    assertEquals("2nd component differs", 2.0 + 5.0, v3.getElement(1), 1e-20);
    assertEquals("3rd component differs", 3.0 + 6.0, v3.getElement(2), 1e-20);
  }
}