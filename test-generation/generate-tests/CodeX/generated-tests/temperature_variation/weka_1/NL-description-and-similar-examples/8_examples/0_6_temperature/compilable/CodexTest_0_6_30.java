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


public class CodexTest_0_6_30 { 
  @Test
  public void testAdd() {
    double[] data = {2.3, 1.2, 5.0};
    double[] data1 = {1.3, 2.2, 4.0};
    AlgVector v = new AlgVector(data);
    AlgVector v1 = new AlgVector(data1);
    AlgVector v2 = v.add(v1);
    assertEquals(v.numElements(), v2.numElements());
    for (int i = 0; i < v.numElements(); i++) {
      assertEquals(data[i] + data1[i], v2.getElement(i));
    }
  }
}