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


public class CodexTest_0_4_81 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 5;
    int numVals = 4;
    int numInsts = 10;
    Instances insts = new Instances("Test", 
				    makeTestAttributes(numAtts, numVals), 
				    numInsts);
    insts.setClassIndex(numAtts - 1);
    double[] values = new double[numAtts];
    for (int i = 0; i < numInsts; i++) {
      for (int j = 0; j < numAtts; j++) {
	values[j] = (double) (i * numAtts + j);
      }
      Instance inst = new DenseInstance(1.0, values);
      insts.add(inst);
    }
    try {
      Instance inst = new DenseInstance(1.0, values);
      insts.add(inst);
      fail("Should have thrown an exception");
    } catch (Exception ex) {
      // OK
    }
  }
}