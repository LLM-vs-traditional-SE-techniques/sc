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


public class CodexTest_0_7_66 { 
  @Test
  public void testAdd() {
    double[] data1 = {2.3, 1.2, 5.0};
    double[] data2 = {4.5, 1.1, 5.4};
    AlgVector v1 = new AlgVector(data1);
    AlgVector v2 = new AlgVector(data2);
    // add vectors
    AlgVector v3 = v1.add(v2);
    AlgVector v4 = v2.add(v1);
    // do the same with arrays
    int n = v1.numElements();
    double[] v5 = new double[n];
    double[] v6 = new double[n];
    for(int i = 0; i < n; i++) {
      v5[i] = v1.getElement(i) + v2.getElement(i);
    }
    Arrays.sort(v5);
    for(int i = 0; i < n; i++) {
      v6[i] = v2.getElement(i) + v1.getElement(i);
    }
    Arrays.sort(v6);
    // compare results
    for(int i = 0; i < n; i++) {
      assertEquals((i+1) + ". element differs", v3.getElement(i), v5[i]);
      assertEquals((i+1) + ". element differs", v4.getElement(i), v6[i]);
    }
  }
}