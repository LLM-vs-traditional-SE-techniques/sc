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


public class CodexTest_0_6_8 { 
  @Test
  public void testAdd() {
    double[] data = {1.0, 2.0, 3.0};
    AlgVector v1 = new AlgVector(data);
    AlgVector v2 = new AlgVector(data);
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", data.length, v3.numElements());
    for (int i = 0; i < data.length; i++) {
      assertEquals((i+1) + ". value differs", 2.0*data[i], v3.getElement(i));
    }
  }
}