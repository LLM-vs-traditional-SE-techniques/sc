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


public class CodexTest_0_6_9 { 
  @Test
  public void testAdd_whenElementCountsAreDifferent() {
    double[] a = { 1.0, 2.0, 3.0, 4.0 };
    double[] b = { 2.0, 3.0, 4.0, 5.0 };
    AlgVector v1 = new AlgVector(a);
    AlgVector v2 = new AlgVector(b);
    AlgVector v3 = v1.add(v2);
    assertEquals(5.0, v3.getElement(0), 0.0);
    assertEquals(5.0, v3.getElement(1), 0.0);
    assertEquals(5.0, v3.getElement(2), 0.0);
    assertEquals(5.0, v3.getElement(3), 0.0);
  }
}