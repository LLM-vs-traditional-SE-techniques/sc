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


public class CodexTest_0_4_90 { 
  @Test
  public void testGetAsInstance() {
    Random r = new Random(1);
    double[] data = {1.0, 2.0, 3.0};
    AlgVector v = new AlgVector(data);
    Instances dataset = null;
    try {
      dataset = v.getAsInstance(dataset, r);
    } catch (Exception e) {
      fail(e.getMessage());
    }
    assertNotNull(dataset);
    assertEquals(3, dataset.numAttributes());
    assertEquals(1, dataset.numInstances());
    assertEquals(1.0, dataset.instance(0).value(0), 0.0001);
    assertEquals(2.0, dataset.instance(0).value(1), 0.0001);
    assertEquals(3.0, dataset.instance(0).value(2), 0.0001);
  }
}