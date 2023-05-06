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


public class CodexTest_0_5_89 { 
  @Test
  public void testGetAsInstance() throws Exception {
    double[] values = {1.0, 2.0};
    AlgVector vec = new AlgVector(values);
    Instances model = createModel();
    Instance newInst = vec.getAsInstance(model, new Random(1));
    assertNotNull(newInst);
    assertEquals(model.numAttributes(), newInst.numAttributes());
    assertEquals(model.numAttributes(), newInst.numValues());
    assertEquals(values[0], newInst.value(0));
    assertEquals(values[1], newInst.value(1));
    assertEquals(1, newInst.value(2));
    assertEquals(0, newInst.value(3));
    assertEquals(0, newInst.value(4));
  }
}