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


public class CodexTest_0_5_91 { 
  @Test
  public void testGetAsInstance() {
    int numAtt = 3;
    int numInst = 4;
    int numVal = 5;
    int[] attTypes = {Attribute.NUMERIC, Attribute.NOMINAL, Attribute.NUMERIC};
    Random random = new Random();
    Instances insts = makeInstances(numAtt, numInst, numVal, attTypes, random);
    double[] vals = {1.0, 3.0};
    AlgVector algV = new AlgVector(vals);
    Instance inst = null;
    try {
      inst = algV.getAsInstance(insts, random);
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
    assertEquals("Wrong number of attributes", numAtt, inst.numAttributes());
    assertEquals("Wrong number of values", numAtt, inst.numValues());
    assertEquals("Wrong number of missing values", 0, inst.numMissingValues());
    assertEquals("Wrong number of instance", numInst, insts.numInstances());
    assertEquals("Wrong number of instances", numInst, insts.numInstances());
    assertEquals("Wrong value", 1.0, inst.value(0));
    assertEquals("Wrong value", 2.0, inst.value(1));
    assertEquals("Wrong value", 3.0, inst.value(2));
  }
}