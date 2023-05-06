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


public class CodexTest_0_7_8 { 
  @Test
   public void testAdd() {
    double[] d1 = {1, 2, 3, 4, 5};
    double[] d2 = {10, 20, 30, 40, 50};
    double[] d3 = {11, 22, 33, 44, 55};
    AlgVector v1 = new AlgVector(d1);
    AlgVector v2 = new AlgVector(d2);
    AlgVector v3 = v1.add(v2);
    for (int i = 0; i < v3.numElements(); i++) {
      assertEquals((i+1) + ". value differs", d3[i], v3.m_Elements[i], 1e-8);
    }
  }
}