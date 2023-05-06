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


public class CodexTest_0_6_5 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 5;
    int numInstances = 100;
    int numClasses = 2;
    int numNominal = 2;
    int numNumeric = 3;
    Random random = new Random(1);
    Instances insts = new Instances(getName(), createAtts(numAtts, numNominal, numNumeric), numInstances);
    insts.setClassIndex(numAtts - 1);
    for (int i = 0; i < numInstances; i++) {
      insts.add(createInstance(numAtts, numClasses, numNominal, numNumeric, random));
    }
    double[] d = new double[numNumeric];
    for (int i = 0; i < numNumeric; i++) {
      d[i] = random.nextDouble();
    }
    AlgVector v = new AlgVector(d);
    Instance inst = v.getAsInstance(insts, random);
    assertEquals(numAtts, inst.numAttributes());
    assertEquals(numNominal + numClasses, inst.numClassValues());
    assertEquals(numNumeric, inst.numInputAttributes());
    assertEquals(insts, inst.dataset());
  }
}