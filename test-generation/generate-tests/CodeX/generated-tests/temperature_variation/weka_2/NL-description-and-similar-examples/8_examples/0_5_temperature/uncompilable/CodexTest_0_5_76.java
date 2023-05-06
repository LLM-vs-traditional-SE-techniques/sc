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


public class CodexTest_0_5_76 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 5;
    double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
    AlgVector v = new AlgVector(values);
    Instances i = new Instances(new TestInstances(), numAtts);
    try {
      Instance inst = v.getAsInstance(i, new Random(1));
      assertEquals("Number of attributes differs", numAtts, inst.numAttributes());
      assertEquals("Number of values differs", values.length, inst.numValues());
      for (int j = 0; j < numAtts; j++) {
	if (inst.attribute(j).isNumeric()) {
	  assertEquals((j+1) + ". value differs", values[j], inst.value(j));
	} else if (inst.attribute(j).isNominal()) {
	  assertEquals((j+1) + ". value differs", 0, (int) inst.value(j));
	}
      }
    } catch (Exception e) {
      fail("Exception occurred: " + e.getMessage());
    }
  }
}