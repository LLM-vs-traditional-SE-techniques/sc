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


public class CodexTest_0_1_48 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances insts = new Instances(new Instances(m_Instances, 0), numInstances);
    insts.setClassIndex(numAtts - 1);
    double[] vals = new double[numAtts];
    for (int i = 0; i < numInstances; i++) {
      for (int j = 0; j < numAtts; j++) {
	if (j != insts.classIndex()) {
	  vals[j] = i;
	} else {
	  vals[j] = i % 2;
	}
      }
      insts.add(new DenseInstance(1.0, vals));
    }
    AlgVector vec = new AlgVector(insts.numAttributes());
    for (int i = 0; i < insts.numAttributes(); i++) {
      vec.setElement(i, i);
    }
    Instance inst = vec.getAsInstance(insts, new Random(1));
    assertEquals("Number of attributes differ", insts.numAttributes(), inst.numAttributes());
    for (int i = 0; i < insts.numAttributes(); i++) {
      if (i != insts.classIndex()) {
	assertEquals("Values differ", i, inst.value(i));
      } else {
	assertEquals("Values differ", i % 2, inst.value(i));
      }
    }
  }
}