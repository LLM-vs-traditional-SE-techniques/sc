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


public class CodexTest_0_6_84 { 
  @Test
  public void testGetAsInstance() {
    Random random = new Random(1);
    Instances data = makeTestDataset(5, 0.0, 1.0);
    AlgVector v = makeTestVector();
    Instance inst = v.getAsInstance(data, random);
    assertEquals("Wrong number of values", data.numAttributes(), inst.numValues());
    for (int i = 0; i < inst.numValues(); i++) {
      if (data.attribute(i).isNumeric()) {
	assertTrue("Instance value too low: " + inst.value(i), 
		   inst.value(i) >= data.attribute(i).getLowerNumericBound());
	assertTrue("Instance value too high: " + inst.value(i), 
		   inst.value(i) <= data.attribute(i).getUpperNumericBound());
      }
      else if (data.attribute(i).isNominal()) {
	assertTrue("Instance value too low: " + inst.value(i), 
		   inst.value(i) >= 0);
	assertTrue("Instance value too high: " + inst.value(i), 
		   inst.value(i) < data.attribute(i).numValues());
      }
    }
  }
}