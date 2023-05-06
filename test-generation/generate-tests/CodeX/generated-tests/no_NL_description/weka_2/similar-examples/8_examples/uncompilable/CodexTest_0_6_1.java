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


public class CodexTest_0_6_1 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances inst = makeTestDataset();
      int classIndex = inst.numAttributes() - 1;
      inst.setClassIndex(classIndex);
      AlgVector v = new AlgVector(inst.numAttributes() - 1);
      for (int i = 0; i < v.numElements(); i++) {
	v.setElement(i, i);
      }
      Instance in = v.getAsInstance(inst, new Random(1));
      assertEquals("Wrong number of attributes", inst.numAttributes(), 
		   in.numAttributes());
      assertEquals("Wrong class value", (int) in.classValue(), 0);
      for (int i = 0; i < v.numElements(); i++) {
	assertEquals((i+1) + ". value differs", v.getElement(i), 
		     in.value(i));
      }
      assertEquals("class attribute is not set", in.classIndex(), classIndex);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}