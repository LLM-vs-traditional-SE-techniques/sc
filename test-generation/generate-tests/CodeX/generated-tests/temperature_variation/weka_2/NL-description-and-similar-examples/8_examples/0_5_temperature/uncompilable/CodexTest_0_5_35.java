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


public class CodexTest_0_5_35 { 
  @Test
  public void testGetAsInstance() {
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    Instances model = null;
    try {
      model = v.getAsInstance(null, null);
    } catch (Exception ex) {
      fail(ex.getMessage());
    }
    assertNotNull(model);
    assertEquals(3, model.numAttributes());
    assertEquals(0, model.numInstances());
  }
}