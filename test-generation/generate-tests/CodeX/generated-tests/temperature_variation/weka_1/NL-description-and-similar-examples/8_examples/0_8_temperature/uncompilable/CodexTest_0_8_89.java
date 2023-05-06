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


public class CodexTest_0_8_89 { 
  @Test
  public void testMultiply() {
    double[] data1 = {3, 5, 7};
    double[] data2 = {2, 3, 1};
    AlgVector v1 = new AlgVector(data1);
    AlgVector v2 = new AlgVector(data2);
    assertEquals(v1.multiply(v2), 33.0, 0.0);
    assertArrayEquals(v1.toArray(), data1, 0.0);
  }
}