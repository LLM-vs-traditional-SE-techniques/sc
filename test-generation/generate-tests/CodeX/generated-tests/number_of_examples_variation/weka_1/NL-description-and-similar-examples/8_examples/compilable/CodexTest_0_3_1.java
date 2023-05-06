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


public class CodexTest_0_3_1 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[] {1.0, 2.0});
    AlgVector v2 = new AlgVector(new double[] {3.0, 4.0});
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", v1.numElements(), v3.numElements());
    assertEquals(4.0, v3.getElement(0), 1e-10);
    assertEquals(6.0, v3.getElement(1), 1e-10);
  }
}