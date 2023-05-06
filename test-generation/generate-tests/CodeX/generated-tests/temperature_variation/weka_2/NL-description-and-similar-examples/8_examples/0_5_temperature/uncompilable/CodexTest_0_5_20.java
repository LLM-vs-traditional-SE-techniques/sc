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


public class CodexTest_0_5_20 { 
  @Test
    public void testGetAsInstance() {
    int length = 3;
    double[] data = {1, 2, 3};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new FastVector(), length);
    for (int i = 0; i < length; i++)
      model.insertAttributeAt(new Attribute("" + i), i);
    try {
      Instance newInst = v.getAsInstance(model, new Random(1));
      for (int i = 0; i < length; i++)
	assertEquals((i+1) + ". value differs", data[i], newInst.value(i));
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}