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


public class CodexTest_0_4_12 { 
  @Test
  public void testGetAsInstance() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    try {
      Instances insts = new Instances(new BufferedReader(
					 new FileReader(new File(TEST_FILE))));
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differ", insts.numAttributes(),
		   inst.numAttributes());
      assertEquals("Number of values differ", insts.numAttributes(),
		   inst.numValues());
      for (int i = 0; i < inst.numAttributes(); i++) {
	if (inst.attribute(i).isNumeric()) {
	  assertEquals("Value differs", data[i], inst.value(i));
	}
      }
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}