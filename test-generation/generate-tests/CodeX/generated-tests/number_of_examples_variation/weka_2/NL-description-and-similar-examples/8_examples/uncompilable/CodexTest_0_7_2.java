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


public class CodexTest_0_7_2 { 
  @Test
  public void testAsInstance() throws Exception {
    int numInstances = 100;
    int numAttributes = 10;
    double[] vals = new double[numAttributes];
    for (int j = 0; j < numAttributes; j++) {
      vals[j] = j;
    }
    AlgVector vec = new AlgVector(vals);
    Instances insts = new Instances(vec.getAsInstance(numInstances));
    for (int i = 0; i < numInstances; i++) {
      Instance inst = insts.instance(i);
      assertEquals("Different number of attributes!", numAttributes, inst.numAttributes());
      for (int j = 0; j < numAttributes; j++) {
        if (j < vals.length) {
	  assertEquals((j+1) + ". values differ", vals[j], inst.value(j));
	}
	else {
	  assertFalse("Attribute is not nominal!", inst.attribute(j).isNumeric());
	  assertTrue("Attribute is not nominal!", inst.attribute(j).isNominal());
	}
      }
    }
  }
}