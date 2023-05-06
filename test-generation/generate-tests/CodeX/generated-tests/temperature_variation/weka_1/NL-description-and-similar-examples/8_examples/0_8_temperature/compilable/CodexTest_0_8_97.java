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


public class CodexTest_0_8_97 { 
  @Test
  public void testAddVector() {
    // Test vector addition
    double[] aData = {1.0, 2.0, 3.0};
    double[] bData = {4.0, 5.0, 6.0};
    double[] result = {5.0, 7.0, 9.0};
    AlgVector a = new AlgVector(aData);
    AlgVector b = new AlgVector(bData);
    AlgVector c = a.add(b);
    for (int i = 0; i < 3; i++) {
      assertEquals("Element " + i + " differs", result[i], c.getElement(i));
    }
  }

}