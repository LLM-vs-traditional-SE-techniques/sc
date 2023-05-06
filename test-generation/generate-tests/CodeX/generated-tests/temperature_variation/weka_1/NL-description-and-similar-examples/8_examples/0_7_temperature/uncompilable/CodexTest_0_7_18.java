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


public class CodexTest_0_7_18 { 
  @Test
  public static void testAdd_2() {
    int n = 3;
    double[] a = new double[n];
    double[] b = new double[n];
    for (int i = 0; i < n; i++) {
      a[i] = Math.random();
      b[i] = Math.random();
    }
    AlgVector v1 = new AlgVector(a);
    AlgVector v2 = new AlgVector(b);
    AlgVector v3 = v1.add(v2);
    for (int i = 0; i < n; i++) {
      assertEquals((i+1) + ". value differs", a[i] + b[i], v3.getElement(i));
    }
  }
```
}