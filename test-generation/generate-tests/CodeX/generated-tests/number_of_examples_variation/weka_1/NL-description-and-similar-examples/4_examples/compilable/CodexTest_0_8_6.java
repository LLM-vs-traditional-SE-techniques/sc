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


public class CodexTest_0_8_6 { 
  @Test
  public void testAdd() {
    double[] data = {1, 4, 1};
    AlgVector v1 = new AlgVector(data);
    AlgVector v2 = new AlgVector(data);
    AlgVector v3 = v1.add(v2);
    double[] control = {2, 8, 2};
    for (int i = 0; i < v3.numElements(); i++) {
      assertEquals((i+1) + ". value differs", control[i], v3.getElement(i));
    }
    assertNotSame("Vector was not cloned", v1, v3);
  }
}