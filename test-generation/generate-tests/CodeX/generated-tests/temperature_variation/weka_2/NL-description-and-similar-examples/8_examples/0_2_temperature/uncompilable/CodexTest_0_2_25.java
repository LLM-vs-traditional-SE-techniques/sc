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


public class CodexTest_0_2_25 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances insts = new Instances(new Instance(numAtts), numInstances);
    insts.setClassIndex(0);
    AlgVector v = new AlgVector(numAtts);
    for (int i = 0; i < numInstances; i++) {
      try {
	Instance newInst = v.getAsInstance(insts, new Random(i));
	assertEquals("Number of attributes differ", numAtts, newInst.numAttributes());
	assertEquals("Number of values differ", numAtts, newInst.numValues());
	assertEquals("Class value differs", i % insts.numClasses(), newInst.classValue());
      } catch (Exception ex) {
	ex.printStackTrace();
	fail("Exception thrown: " + ex.getMessage());
      }
    }
  }
}