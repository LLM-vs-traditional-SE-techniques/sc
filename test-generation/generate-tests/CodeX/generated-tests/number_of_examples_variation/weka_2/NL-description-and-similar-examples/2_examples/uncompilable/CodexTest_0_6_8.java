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
  public void testGetAsInstance() {
    Instances data = null;
    try {
      data = TestInstances.makeTestDataset(1, 1, 1, 1.0, false, false);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Problem setting up test data");
    }
    AlgVector v = new AlgVector(data.numAttributes());
    try {
      Instance in = v.getAsInstance(data, new Random(1));
      assertNotNull("Instance is null", in);
      assertEquals("Num attributes differ", data.numAttributes(), in.numAttributes());
      assertEquals("Num values differ", data.numAttributes(), in.numValues());
    } catch (Exception e) {
      e.printStackTrace();
      fail("Problem creating instance");
    }
  }
}