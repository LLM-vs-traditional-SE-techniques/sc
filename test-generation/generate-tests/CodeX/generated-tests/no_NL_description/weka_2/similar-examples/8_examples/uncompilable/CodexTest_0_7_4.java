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


public class CodexTest_0_7_4 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances data = makeTestDataset(6, 2, 12);
    Random random = new Random(1);
    Instance inst = data.instance(0);
    AlgVector v = new AlgVector(inst);
    Instance inst2 = v.getAsInstance(data, random);
    assertEquals("Num attributes differ", inst.numAttributes(),
		 inst2.numAttributes());
    assertEquals("Num values differ", inst.numValues(), 
		 inst2.numValues());
    for (int i = 0; i < inst.numAttributes(); i++) {
      if (inst.isMissing(i)) {
	assertTrue("Attribute " + i + " is not missing in inst2",
		   inst2.isMissing(i));
      } else {
	assertEquals("Value of attribute " + i + " differs", 
		     inst.value(i), inst2.value(i));
      }
    }
  }
}