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


public class CodexTest_0_4_62 { 
  @Test
  public void testGetAsInstance() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = makeModel();
    try {
      Instance inst = v.getAsInstance(model, new Random());
      assertEquals("Number of attributes differs", model.numAttributes(), 
		   inst.numAttributes());
      assertEquals("Number of values differs", data.length, 
		   inst.numValues());
      for (int i = 0; i < data.length; i++)
	assertEquals((i+1) + ". value differs", data[i], inst.value(i));
    } catch (Exception ex) {
      fail("Exception occured: " + ex.getMessage());
    }
  }
}