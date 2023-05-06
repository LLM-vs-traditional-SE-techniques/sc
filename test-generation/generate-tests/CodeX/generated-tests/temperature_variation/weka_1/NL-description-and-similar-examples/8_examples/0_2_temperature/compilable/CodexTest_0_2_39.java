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


public class CodexTest_0_2_39 { 
  @Test
  public void testAdd() {
    double[] data1 = {1.0, 2.0, 3.0, 4.0, 5.0};
    double[] data2 = {5.0, 4.0, 3.0, 2.0, 1.0};
    AlgVector v1 = new AlgVector(data1);
    AlgVector v2 = new AlgVector(data2);
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", data1.length, v3.numElements());
    for (int i = 0; i < data1.length; i++) {
      assertEquals((i+1) + ". value differs", data1[i] + data2[i], v3.getElement(i));
    }
  }
}