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


public class CodexTest_0_5_32 { 
  @Test
  public void testAdd() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    AlgVector v2 = new AlgVector(data);
    AlgVector v3 = v.add(v2);
    assertEquals(3, v3.numElements());
    assertEquals(4.6, v3.getElement(0), 1e-6);
    assertEquals(2.4, v3.getElement(1), 1e-6);
    assertEquals(10.0, v3.getElement(2), 1e-6);
  }
}