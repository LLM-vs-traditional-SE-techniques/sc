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


public class CodexTest_0_4_69 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances insts = makeTestInstances();
      AlgVector vec = new AlgVector(insts.numAttributes());
      for (int i = 0; i < insts.numAttributes(); i++) {
	if (insts.attribute(i).isNumeric()) {
	  vec.setElement(i, 1.0);
	}
      }
      Instance newInst = vec.getAsInstance(insts, new Random(42));
      assertEquals("Number of attributes differs", 
		   insts.numAttributes(), newInst.numAttributes());
      for (int i = 0; i < insts.numAttributes(); i++) {
	if (insts.attribute(i).isNumeric()) {
	  assertEquals("Value differs", 1.0, newInst.value(i));
	}
	if (insts.attribute(i).isNominal()) {
	  assertEquals("Value differs", 0, newInst.value(i));
	}
      }
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}