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


public class CodexTest_0_4_27 { 
  @Test
  public void testGetAsInstance() {
    int numInstances = 5;
    int numAttributes = 10;
    int numNominal = 3;
    int numNumeric = 7;
    int numString = 0;
    int numDate = 0;
    int numRelational = 0;
    int numClasses = 2;
    int numMissing = 2;
    Random random = new Random(1);
    Instances data = makeTestDataset(numInstances, numAttributes, numNominal,
				     numNumeric, numString, numDate,
				     numRelational, numClasses, numMissing,
				     random);
    double[] values = new double[numNumeric];
    for (int i = 0; i < numNumeric; i++) {
      values[i] = random.nextDouble();
    }
    AlgVector v = new AlgVector(values);
    try {
      Instance newInst = v.getAsInstance(data, random);
      assertEquals("Datatypes are not compatible.", numNumeric, 
		   newInst.numValues());
      for (int i = 0; i < numNumeric; i++) {
	assertEquals("Datatypes are not compatible.", values[i], 
		     newInst.value(i));
      }
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}