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


public class CodexTest_0_7_5 { 
  @Test
  public void testAdd() {
    double[] data1 = {2.3, 1.2, 5.0};
    double[] data2 = {1.2, 5.0, 3.2};
    double[] data3 = {3.5, 6.2, 8.2};
    AlgVector v1 = new AlgVector(data1);
    AlgVector v2 = new AlgVector(data2);
    AlgVector v3 = new AlgVector(data3);
    assertEquals("Length differs", data1.length, v1.numElements());
    assertEquals("Length differs", data2.length, v2.numElements());
    assertEquals("Length differs", data3.length, v3.numElements());
    assertEquals("addition failed", v3, v1.add(v2));
  }
}