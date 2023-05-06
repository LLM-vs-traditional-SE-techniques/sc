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


public class CodexTest_0_1_34 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    Instances insts = new Instances(new BufferedReader(new StringReader(
									InstancesTest.INSTANCE_DATA)), 0);
    insts.setClassIndex(insts.numAttributes() - 1);
    double[] vals = new double[numAtts];
    for (int i = 0; i < numAtts; i++) {
      vals[i] = i;
    }
    AlgVector vec = new AlgVector(vals);
    Instance inst = vec.getAsInstance(insts, new Random(1));
    assertEquals("Num attributes differ", numAtts, inst.numAttributes());
    for (int i = 0; i < numAtts; i++) {
      if (i != insts.classIndex()) {
	assertEquals("Value differs", i, inst.value(i));
      }
    }
  }
}