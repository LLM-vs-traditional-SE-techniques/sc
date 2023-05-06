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


public class CodexTest_0_6_12 { 
  @Test
  public void testAdd() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    AlgVector v2 = new AlgVector(data.length);
    double[] data2 = {2.0, 3.0, 4.0};
    v2.setElements(data2);
    AlgVector v3 = v.add(v2);
    assertEquals("Length differs", data.length, v3.numElements());
    for (int i = 0; i < data.length; i++)
      assertEquals((i+1) + ". value differs", data[i] + data2[i], v3.getElement(i));
  }
}