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


public class CodexTest_0_5_64 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 10;
    int numVals = 3;
    int numInsts = 5;
    Instances insts = new Instances(numAtts);
    insts.setClassIndex(numAtts - 1);
    for (int i = 0; i < numAtts; i++) {
      if (i < numAtts - 1) {
	insts.setAttributeType(i, Attribute.NOMINAL);
	insts.setNumValues(i, numVals);
      } else {
	insts.setAttributeType(i, Attribute.NUMERIC);
      }
    }
    insts.setNumInstances(numInsts);
    double[] values = new double[numAtts];
    for (int i = 0; i < numInsts; i++) {
      for (int j = 0; j < numAtts; j++) {
	if (j < numAtts - 1) {
	  values[j] = (int) (Math.random() * numVals);
	} else {
	  values[j] = Math.random();
	}
      }
      insts.add(new DenseInstance(1.0, values));
    }
    AlgVector[] vectors = new AlgVector[numInsts];
    for (int i = 0; i < numInsts; i++) {
      vectors[i] = new AlgVector(insts.instance(i));
    }
    Random random = new Random(1);
    for (int i = 0; i < numInsts; i++) {
      Instance newInst = vectors[i].getAsInstance(insts, random);
      assertEquals("Number of attributes is not the same", numAtts, 
		   newInst.numAttributes());
      for (int j = 0; j < numAtts - 1; j++) {
	assertEquals("Values are not the same", 
		     newInst.value(j), insts.instance(i).value(j));
      }
    }
  }
}