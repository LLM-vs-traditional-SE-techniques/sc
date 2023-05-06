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


public class CodexTest_0_6_7 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInsts = 20;
    Instances insts = new Instances(getName(), makeAttInfo(numAtts, 2), numInsts);
    for (int i = 0; i < numInsts; i++) {
      insts.add(makeRandomInstance(numAtts, 2));
    }
    double[] vals = new double[numAtts];
    for (int i = 0; i < numInsts; i++) {
      for (int j = 0; j < numAtts; j++) {
	vals[j] = insts.instance(i).value(j);
      }
      DenseInstance inst = new DenseInstance(1, vals);
      assertTrue(insts.instance(i).equals(inst.getAsInstance(insts, new Random(1))));
    }
  }
}