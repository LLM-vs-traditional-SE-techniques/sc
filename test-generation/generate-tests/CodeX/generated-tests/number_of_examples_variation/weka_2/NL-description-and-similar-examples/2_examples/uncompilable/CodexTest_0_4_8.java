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


public class CodexTest_0_4_8 { 
  @Test
  public void testGetAsInstance() {
    Instances model = null;
    try {
      model = TestInstances.createTestInstances();
    } catch (Exception ex) {
      fail("Problem creating test instances");
    }
    AlgVector v = new AlgVector(model.numAttributes());
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Number of attributes differs",
		   model.numAttributes(), inst.numAttributes());
      for (int i = 0; i < model.numAttributes(); i++) {
	if (model.attribute(i).isNumeric()) {
	  assertEquals((i+1) + ". value differs",
		       v.getElement(i), inst.value(i));
	}
	if (model.attribute(i).isNominal()) {
	  assertEquals((i+1) + ". value differs",
		       (int) v.getElement(i), (int) inst.value(i));
	}
      }
    } catch (Exception ex) {
      fail("Problem with getAsInstance");
    }
  }
}