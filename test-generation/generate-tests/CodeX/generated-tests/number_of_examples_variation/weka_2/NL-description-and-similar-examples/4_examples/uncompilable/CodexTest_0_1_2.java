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


public class CodexTest_0_1_2 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    int numInsts = 1;
    Instances insts = new Instances("test", new ArrayList<Attribute>(), numInsts);
    for (int i = 0; i < numAtts; i++) {
      ArrayList<String> vals = new ArrayList<String>();
      for (int j = 0; j < numVals; j++) {
	vals.add("val" + (j+1));
      }
      insts.insertAttributeAt(new Attribute("att" + (i+1), vals), i);
    }
    insts.insertAttributeAt(new Attribute("att" + (numAtts+1)), numAtts);
    insts.setClassIndex(numAtts);
    double[] vals = new double[numAtts];
    for (int i = 0; i < numAtts; i++) {
      vals[i] = i;
    }
    AlgVector vec = new AlgVector(vals);
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differ", numAtts, inst.numAttributes());
      for (int i = 0; i < numAtts; i++) {
	if (i == numAtts-1) {
	  assertEquals("Class value differs", 0, (int) inst.value(i));
	} else {
	  assertEquals("Value differs", i, inst.value(i));
	}
      }
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
  }
}