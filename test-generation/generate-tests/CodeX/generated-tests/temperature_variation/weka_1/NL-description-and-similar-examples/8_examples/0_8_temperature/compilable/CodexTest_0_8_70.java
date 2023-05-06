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


public class CodexTest_0_8_70 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(3);
    double[] data = {1, 2, 3};
    AlgVector u = new AlgVector(data);
    v = v.add(u);
    assertEquals("Length differs", 3, v.numElements());
    for(int i = 0; i < data.length; i++) {
      assertEquals((i+1) + ". value differs", data[i], v.getElement(i));
    }
  }
}