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


public class CodexTest_0_7_4 { 
  @Test
  public void testAdd() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    double[] data2 = {3.4, 1.1, 2.0};
    AlgVector v2 = new AlgVector(data2);
    AlgVector res = v.add(v2);
    assertEquals("Length differs", data.length, res.numElements());
    for (int i = 0; i < data.length; i++) {
      assertEquals((i+1) + ". value differs", data[i]+data2[i], res.getElement(i));
    }
  }
}