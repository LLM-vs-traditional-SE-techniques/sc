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


public class CodexTest_0_9_9 { 
  @Test
    public void testAdd() {
    final int n = 10;
    AlgVector v1 = new AlgVector(n);
    double[] m1 = v1.getDataArray();
    for (int i = 0; i < 10; i++) {
      m1[i] = (i);
    }
    AlgVector v2 = new AlgVector(n);
    double[] m2 = v2.getDataArray();
    for (int i = 0; i < 10; i++) {
      m2[i] = (2 * i);
    }
    AlgVector v = v1.add(v2);
    for (int i = 0; i < 10; i++) {
      Assert.assertEquals(i + 2 * i, v.get(i), 1e-12);
    }
  }
}