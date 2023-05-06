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


public class CodexTest_0_9_3 { 
  @Test
   public void testCross() {
    double[] data1 = new double[] {2.0, 3.0, 4.0};
    AlgVector v1 = new AlgVector(data1);
    double[] data2 = new double[] {1.0, 2.0, 3.0};
    AlgVector v2 = new AlgVector(data2);
    AlgVector v3 = v1.add(v2);
    assertEquals("V1 " + Arrays.toString(v1.toArray()) + " + V2 " + Arrays.toString(v2.toArray()) + " = V3 " + Arrays.toString(v3.toArray()), 3.0, v3.getElement(0), 1e-10);
    assertEquals("V1 " + Arrays.toString(v1.toArray()) + " + V2 " + Arrays.toString(v2.toArray()) + " = V3 " + Arrays.toString(v3.toArray()), 5.0, v3.getElement(1), 1e-10);
    assertEquals("V1 " + Arrays.toString(v1.toArray()) + " + V2 " + Arrays.toString(v2.toArray()) + " = V3 " + Arrays.toString(v3.toArray()), 7.0, v3.getElement(2), 1e-10);
  }
}