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


public class CodexTest_0_1_26 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances insts = new Instances(new Instance(numAtts), numInstances);
    insts.setClassIndex(numAtts - 1);
    insts.setRelationName("test");
    AlgVector v = new AlgVector(numAtts);
    for (int i = 0; i < numAtts; i++) {
      v.setElement(i, i);
    }
    try {
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differ", numAtts, inst.numAttributes());
      assertEquals("Number of values differ", numAtts, inst.numValues());
      assertEquals("Class differs", 0, inst.classValue());
      for (int i = 0; i < numAtts; i++) {
	assertEquals("Value differs", i, inst.value(i));
      }
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}