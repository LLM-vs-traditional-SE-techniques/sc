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


public class CodexTest_0_2_37 { 
  @Test
  public void testAdd() {
    double[] data = {1.0, 2.0, 3.0};
    AlgVector v = new AlgVector(data);
    AlgVector w = new AlgVector(data);
    AlgVector u = v.add(w);
    assertEquals("Length differs", v.numElements(), u.numElements());
    for (int i = 0; i < data.length; i++)
      assertEquals((i+1) + ". value differs", data[i] + data[i], u.getElement(i));
  }
}