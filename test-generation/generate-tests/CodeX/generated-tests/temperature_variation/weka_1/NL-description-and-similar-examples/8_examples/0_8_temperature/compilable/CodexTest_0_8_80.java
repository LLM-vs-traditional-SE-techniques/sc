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


public class CodexTest_0_8_80 { 
  @Test
  public void testAddition() {
    double[] data1 = {1, 2, 3};
    double[] data2 = {2, 3, 4};
    AlgVector v1 = new AlgVector(data1);
    AlgVector v2 = new AlgVector(data2);
    AlgVector sum = v1.add(v2);
    assertEquals("Length differs", data1.length, sum.numElements());
    for (int i = 0; i < data1.length; i++) {
      assertEquals((i+1) + ". value differs", data1[i] + data2[i], sum.getElement(i));
    }
  }
}