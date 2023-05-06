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


public class CodexTest_0_5_94 { 
  @Test
  public void testGetAsInstance() {
    Instances inst = new Instances(new BufferedReader(new StringReader(
								     "A,B,C\n"
								     + "0,1,2\n"
								     + "3,4,5\n"
								     + "6,7,8\n")));
    AlgVector v = new AlgVector(inst.numAttributes());
    for (int i = 0; i < inst.numAttributes(); i++) {
      v.setElement(i, i + 1);
    }
    try {
      Instance newInst = v.getAsInstance(inst, new Random(0));
      assertEquals("Number of attributes differs", inst.numAttributes(),
		   newInst.numAttributes());
      assertEquals("Dataset differs", inst, newInst.dataset());
      for (int i = 0; i < inst.numAttributes(); i++) {
	if (inst.attribute(i).isNumeric()) {
	  assertEquals("Numeric attribute differs", i + 1, newInst.value(i), 1e-6);
	}
	if (inst.attribute(i).isNominal()) {
	  assertEquals("Nominal attribute differs", 1, newInst.value(i), 1e-6);
	}
      }
    } catch (Exception e) {
      fail("Exception occured: " + e.getMessage());
    }
  }
}