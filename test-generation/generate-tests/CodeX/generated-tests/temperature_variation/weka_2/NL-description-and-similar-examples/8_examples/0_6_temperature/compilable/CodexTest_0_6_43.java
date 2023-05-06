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


public class CodexTest_0_6_43 { 
  @Test
  public void testDoubleArrayConstructor() {
    int nval = 20;
    double[] data = new double[nval];
    for (int i = 0; i < nval; i++)
      data[i] = i;
    AlgVector v = new AlgVector(data);
    assertEquals("Number of values differs", nval, v.numElements());
    for (int i = 0; i < nval; i++) {
      assertEquals("Value differs", i, v.getElement(i), 0.0);
    }
  }
}