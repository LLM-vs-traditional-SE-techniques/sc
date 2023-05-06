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


public class CodexTest_0_7_50 { 
  @Test
  public void testAddition() {
    double[] data = {2.0, 1.0, 5.0};
    AlgVector v1 = new AlgVector(data);
    AlgVector v2 = new AlgVector(data);
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", v1.numElements(), v3.numElements());
    for (int i = 0; i < v1.numElements(); i++) {
      assertEquals("Value of " + i + "-th element differs",
		   2.0 * data[i], v3.getElement(i));
    }
  }
}