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


public class CodexTest_0_5_4 { 
  @Test
    public void testGetAsInstance() {
    double[] data = {1.0, 2.0, 3.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new FastVector(), 0);
    model.insertAttributeAt(new Attribute("Attr1"), 0);
    model.insertAttributeAt(new Attribute("Attr2"), 1);
    model.insertAttributeAt(new Attribute("Attr3"), 2);
    model.insertAttributeAt(new Attribute("Attr4", (FastVector) null), 3);
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Number of values differs", model.numAttributes(), 
		   inst.numValues());
      for (int i = 0; i < data.length; i++)
	assertEquals((i+1) + ". value differs", data[i], inst.value(i), 0);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}