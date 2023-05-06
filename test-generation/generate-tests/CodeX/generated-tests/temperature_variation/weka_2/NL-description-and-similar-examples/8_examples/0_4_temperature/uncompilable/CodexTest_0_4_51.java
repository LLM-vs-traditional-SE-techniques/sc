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


public class CodexTest_0_4_51 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 5;
    int numClasses = 2;
    int numNumeric = 1;
    int numNominal = 2;
    int numString = 0;
    int numDate = 0;
    int numRelational = 0;
    int numMissing = 2;
    int numUniqueVals = 3;
    int missingLevel = 20;
    int uniqueValsLevel = 20;
    int classIndex = 2;
    int[] nominalCounts = {2, 3};
    Random random = new Random(1);
    Instances structure = null;
    try {
      structure = makeTestDataset(42, numAtts, numInstances, numClasses, 
				  numNumeric, numNominal, numString, numDate, 
				  numRelational, numMissing, numUniqueVals, 
				  missingLevel, uniqueValsLevel, classIndex, 
				  nominalCounts, random);
    } catch (Exception ex) {
      fail("Problem setting up test instances");
    }
    double[] values = new double[]{1.0, 0.0, 1.0};
    AlgVector vec = new AlgVector(values);
    Instance inst = null;
    try {
      inst = vec.getAsInstance(structure, random);
    } catch (Exception ex) {
      fail("Problem getting instance from vector");
    }
    assertEquals("Number of attributes differ", numAtts, inst.numAttributes());
    assertEquals("Number of classes differ", numClasses, 
		 structure.numClasses());
    assertEquals("Number of instances differ", numInstances, 
		 structure.numInstances());
    assertEquals("Number of numeric attributes differ", numNumeric, 
		 structure.numAttributes());
    assertEquals("Number of nominal attributes differ", numNominal, 
		 structure.numAttributes());
    assertEquals("Number of string attributes differ", numString, 

}