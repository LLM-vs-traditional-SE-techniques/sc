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


public class CodexTest_0_3_6 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[] {2, 3, 4});
    AlgVector v2 = new AlgVector(new double[] {1, 2, 3});
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", 3, v3.numElements());
    assertEquals(3.0, v3.getElement(0), 0.0);
    assertEquals(5.0, v3.getElement(1), 0.0);
    assertEquals(7.0, v3.getElement(2), 0.0);
  }
}