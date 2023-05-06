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


public class CodexTest_0_6_64 { 
  @Test
  public void testAdd() {
    double[] data1 = {1.5, 2.5, 3.5, 4.5, 5.5};
    AlgVector a = new AlgVector(data1);
    double[] data2 = {11.5, 12.5, 13.5, 14.5, 15.5};
    AlgVector b = new AlgVector(data2);
    AlgVector c = a.add(b);
    assertEquals("Length differs", data1.length, c.numElements());
    for (int i = 0; i < data1.length; i++) {
      assertEquals((i+1) + ". value differs", data1[i] + data2[i], c.getElement(i));
    }
  }
}