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


public class CodexTest_0_3_61 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 5;
    int numVals = 5;
    int numInsts = 10;
    double[] vals = new double[numAtts];
    for (int i = 0; i < numAtts; i++) {
      vals[i] = i;
    }
    Instances insts = new Instances(new TestInstances(), numInsts);
    for (int i = 0; i < numAtts; i++) {
      insts.insertAttributeAt(new Attribute("Att" + (i+1)), i);
    }
    for (int i = 0; i < numInsts; i++) {
      insts.add(new DenseInstance(1.0, vals));
    }
    AlgVector vec = new AlgVector(vals);
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals("Num attributes differ", numAtts, inst.numAttributes());
      assertEquals("Num values differ", numVals, inst.numValues());
      assertEquals("Dataset reference differs", insts, inst.dataset());
      assertEquals("Weight differs", 1.0, inst.weight());
      for (int i = 0; i < numAtts; i++) {
	assertEquals("Value differs", vals[i], inst.value(i));
      }
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
}