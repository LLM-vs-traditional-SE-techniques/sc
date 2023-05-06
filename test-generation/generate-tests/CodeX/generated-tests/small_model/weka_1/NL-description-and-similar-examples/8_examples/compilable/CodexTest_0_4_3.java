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


public class CodexTest_0_4_3 { 
  @Test
  public void testVectorAdd() {
    double[] a = {1.0, 2.0, 3.0};
    double[] b = {1.0, 2.0, 3.0};
    AlgVector v1 = new AlgVector(a);
    AlgVector v2 = new AlgVector(b);
    AlgVector v3 = v1.add(v2);
    assertEquals(2.0, v3.getElement(0), 0.0);
    assertEquals(4.0, v3.getElement(1), 0.0);
    assertEquals(6.0, v3.getElement(2), 0.0);
  }
}