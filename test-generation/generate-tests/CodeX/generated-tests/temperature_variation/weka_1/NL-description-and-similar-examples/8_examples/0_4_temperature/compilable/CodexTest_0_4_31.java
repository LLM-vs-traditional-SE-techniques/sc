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


public class CodexTest_0_4_31 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{1, 2, 3, 4, 5});
    AlgVector v2 = new AlgVector(new double[]{4, 3, 2, 1, 0});
    AlgVector v3 = v1.add(v2);
    for (int i = 0; i < v3.numElements(); i++) {
      assertEquals("Element " + i + " differs", 5, v3.getElement(i), 1e-10);
    }
  }
}