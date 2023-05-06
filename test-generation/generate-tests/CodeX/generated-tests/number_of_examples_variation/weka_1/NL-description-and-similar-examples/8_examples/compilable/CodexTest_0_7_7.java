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


public class CodexTest_0_7_7 { 
  @Test
  public void testSum() {
    double[] data = {1.5, -3.2, 2.3, 5.6};
    AlgVector v1 = new AlgVector(data);
    AlgVector v2 = new AlgVector(data);
    AlgVector v3 = v1.add(v2);
    for (int i = 0; i < v3.numElements(); i++) {
      assertEquals((i+1) + ". value differs", data[i] * 2.0, v3.getElement(i), 0.0);
    }
  }
}