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


public class CodexTest_0_9_1 { 
  @Test
  public void testAdd() {
    // Add random vectors
    Random r = new Random(1);
    int len = 20;
    double[] dataA = new double[len], dataB = new double[len];
    for (int i = 0; i < len; i++) {
      dataA[i] = r.nextDouble();
      dataB[i] = r.nextDouble();
    }
    AlgVector a = new AlgVector(dataA);
    AlgVector b = new AlgVector(dataB);
    assertTrue("adding two vectors", a.add(b) != a);
    a.addEquals(b);
    for (int i = 0; i < len; i++)
      assertEquals((i+1) + ". value differs", dataA[i] + dataB[i], a.getElement(i));
  }
}