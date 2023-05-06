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


public class CodexTest_0_1_51 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 4;
    int numInsts = 5;
    double[] vals = new double[numAtts];
    for (int i = 0; i < numAtts; i++) {
      vals[i] = i;
    }
    Instances insts = new Instances(new Instance(1.0, vals), numInsts);
    for (int i = 0; i < numAtts; i++) {
      insts.insertAttributeAt(new Attribute("Att" + (i+1)), i);
    }
    insts.setClassIndex(insts.numAttributes() - 1);
    for (int i = 0; i < numVals; i++) {
      insts.attribute(insts.classIndex()).addStringValue("val" + (i+1));
    }
    AlgVector vec = new AlgVector(vals);
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals("Num attributes differ", numAtts, inst.numAttributes());
      for (int i = 0; i < numAtts; i++) {
	assertEquals("Value " + i + " differs", vals[i], inst.value(i));
      }
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
}