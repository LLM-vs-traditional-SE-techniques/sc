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


public class CodexTest_0_6_74 { 
  @Test
  public void testGetAsInstance() {
    int numInstances = 20;
    int numAttributes = 3;
    double[] values = new double[numAttributes];
    for (int i = 0; i < values.length; i++) {
      values[i] = i;
    }
    Random random = new Random(1);
    Instances ins = new Instances(new MockInstances(numInstances, numAttributes));
    AlgVector algVector = new AlgVector(values);
    Instance inst = algVector.getAsInstance(ins, random);
    assertTrue(inst.numAttributes() == numAttributes);
    assertTrue(inst.value(0) == 0);
    assertTrue(inst.value(1) == 1);
    assertTrue(inst.value(2) == 2);
    assertTrue(inst.classIndex() == -1);
  }

}