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


public class CodexTest_0_3_58 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    int num = 5;
    double[] vals = new double[numAtts];
    for (int i = 0; i < numAtts; i++) {
      vals[i] = i;
    }
    Instances insts = new Instances(new Instances(new DenseInstance(1.0, vals), num), 0);
    for (int i = 0; i < numAtts; i++) {
      insts.insertAttributeAt(new Attribute("Att" + (i+1)), i);
    }
    insts.insertAttributeAt(new Attribute("Class", numVals), numAtts);
    insts.setClassIndex(numAtts);
    AlgVector vec = new AlgVector(vals);
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals(numAtts, inst.numAttributes());
      assertEquals(numVals, inst.classAttribute().numValues());
      assertEquals(numAtts, inst.numValues());
      assertEquals(numAtts, inst.numInputAttributes());
      assertEquals(numVals, inst.numClasses());
      assertEquals(numAtts, inst.numInputAttributes());
      assertEquals(numAtts, inst.numInputAttributes());
      assertEquals(numAtts, inst.numInputAttributes());
      assertEquals(numAtts, inst.numInputAttributes());
      assertEquals(numAtts, inst.numInputAttributes());
      assertEquals(numAtts, inst.numInputAttributes());
      assertEquals(numAtts, inst.numInputAttributes());
      assertEquals(numAtts, inst.numInputAttributes());
      assertEquals(numAtts, inst.numInputAttributes());
      assertEquals(numAtts, inst.numInputAttributes());
      assertEquals(numAtts, inst.numInputAttributes());
      assertEquals(numAtts, inst.numInputAttributes());
}