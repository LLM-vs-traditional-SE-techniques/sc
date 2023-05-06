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
    int numInstances = 10;
    Instances insts = new Instances(new Instance(numAtts), numInstances);
    insts.setClassIndex(numAtts - 1);
    insts.setRelationName("test");
    for (int i = 0; i < numInstances; i++) {
      insts.add(new Instance(1.0, new double[numAtts]));
    }
    double[] values = new double[numAtts];
    for (int i = 0; i < numAtts; i++) {
      values[i] = Math.random();
    }
    AlgVector vec = new AlgVector(values);
    Instance inst = vec.getAsInstance(insts, new Random(1));
    assertEquals("Number of attributes differ", numAtts, inst.numAttributes());
    for (int i = 0; i < numAtts; i++) {
      if (i != numAtts - 1) {
	assertEquals("Values differ", values[i], inst.value(i));
      } else {
	assertEquals("Class values differ", 0, (int) inst.classValue());
      }
    }
  }
}