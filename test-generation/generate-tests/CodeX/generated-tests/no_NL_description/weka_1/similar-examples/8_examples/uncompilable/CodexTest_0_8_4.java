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


public class CodexTest_0_8_4 { 
  @Test
  public void testSubtract() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v1 = new AlgVector(data);
    double[] otherData = {3.3, 3.2, 1.0};
    AlgVector other = new AlgVector(otherData);
    AlgVector result = v1.subtract(other);
    assertNotNull(result);
    assertEquals("Length differs", data.length, result.numElements());
    assertEquals("Length of original vector does not change", data.length, v1.numElements());
    for (int i = 0; i < data.length; i++) {
      assertEquals((i+1) + ". value differs", data[i] - otherData[i], result.getElement(i));
    }
  }
}