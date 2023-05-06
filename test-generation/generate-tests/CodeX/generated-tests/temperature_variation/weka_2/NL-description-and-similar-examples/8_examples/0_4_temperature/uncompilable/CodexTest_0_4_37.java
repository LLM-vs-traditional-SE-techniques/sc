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


public class CodexTest_0_4_37 { 
  @Test
  public void testGetAsInstance() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = null;
    try {
      model = v.getAsInstance(model, null);
    } catch (Exception e) {
      fail("Exception caught: " + e.getMessage());
    }
    assertEquals("Length differs", data.length, model.numAttributes());
    for (int i = 0; i < data.length; i++)
      assertEquals((i+1) + ". value differs", data[i], model.instance(0).value(i));
  }
}