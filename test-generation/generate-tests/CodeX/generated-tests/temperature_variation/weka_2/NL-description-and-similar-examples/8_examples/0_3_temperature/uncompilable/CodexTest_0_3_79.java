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


public class CodexTest_0_3_79 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 5;
    int numVals = 3;
    int numInsts = 10;
    int numClasses = 2;
    int numNumeric = 2;
    int numNominal = 3;
    int numString = 0;
    int numDate = 0;
    int numRelational = 0;
    int numInstances = 10;
    int numClasses = 2;
    int numNumeric = 2;
    int numNominal = 3;
    int numString = 0;
    int numDate = 0;
    int numRelational = 0;
    Random random = new Random(1);
    Instances data = makeTestDataset(42, numAtts, numVals, numInsts, numClasses, numNumeric, numNominal, numString, numDate, numRelational);
    double[] values = new double[numAtts];
    for (int i = 0; i < numAtts; i++) {
      if (data.attribute(i).isNumeric()) {
        values[i] = random.nextDouble();
      }
    }
    AlgVector v = new AlgVector(values);
    Instance inst = v.getAsInstance(data, random);
    assertEquals("Number of attributes differs", numAtts, inst.numAttributes());
    for (int i = 0; i < numAtts; i++) {
      if (data.attribute(i).isNumeric()) {
        assertEquals("Value differs", values[i], inst.value(i), 1e-6);
      }
    }
  }
}