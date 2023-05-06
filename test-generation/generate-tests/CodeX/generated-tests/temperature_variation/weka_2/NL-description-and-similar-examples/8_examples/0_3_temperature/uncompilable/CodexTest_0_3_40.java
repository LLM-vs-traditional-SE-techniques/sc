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


public class CodexTest_0_3_40 { 
  @Test
  public void testGetAsInstance() throws Exception {
    int numAtts = 4;
    int numVals = 3;
    double[] values = {1.0, 2.0, 3.0};
    Instances insts = makeTestInstances(numAtts, numVals, values);
    AlgVector v = new AlgVector(values);
    Instance inst = v.getAsInstance(insts, new Random(1));
    assertEquals("Number of attributes differs", numAtts, inst.numAttributes());
    assertEquals("Number of values differs", numVals, inst.numValues());
    for (int i = 0; i < inst.numAttributes(); i++) {
      if (insts.attribute(i).isNumeric()) {
	assertEquals("Numeric value differs", values[i], inst.value(i));
      }
    }
  }
}