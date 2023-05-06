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


public class CodexTest_0_8_36 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{1, 2, 3, 4});
    AlgVector v2 = new AlgVector(new double[]{1, -2, 3, -4});
    AlgVector v = v1.add(v2);
    assertEquals(1.0, v.getElement(0), DELTA);
    assertEquals(0.0, v.getElement(1), DELTA);
    assertEquals(6.0, v.getElement(2), DELTA);
    assertEquals(0.0, v.getElement(3), DELTA);
  }
}