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


public class CodexTest_0_1_23 { 
  @Test
    public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 10;
    int numNominal = 1;
    int numNumeric = 2;
    int numString = 0;
    int numDate = 0;
    int numRelational = 0;
    int numClasses = 2;
    int classIndex = numAttributes - 1;
    int numValues = 2;
    int numMissing = 0;
    int[] nominalCounts = {numValues, numValues, numValues};
    int[] missingCounts = {numMissing, numMissing, numMissing};
    int[] numericCounts = {numInstances, numInstances, numInstances};
    int[] stringCounts = {numInstances, numInstances, numInstances};
    int[] dateCounts = {numInstances, numInstances, numInstances};
    int[] relationalCounts = {numInstances, numInstances, numInstances};
    int[] classCounts = {numInstances, numInstances};
    Instances data = makeTestDataset(numInstances, numAttributes, numNominal,
				     numNumeric, numString, numDate,
				     numRelational, numClasses, classIndex,
				     numValues, numMissing, nominalCounts,
				     missingCounts, numericCounts, stringCounts,
				     dateCounts, relationalCounts, classCounts);
    double[] values = {1.0, 2.0, 3.0};
    AlgVector v = new AlgVector(values);
    try {
      Instance inst = v.getAsInstance(data, new Random(1));
      assertEquals("Number of attributes differs", numAttributes,
		   inst.numAttributes());
      assertEquals("Number of classes differs", numClasses,
		   inst.numClasses());
      assertEquals("Class index differs", classIndex, inst.classIndex());
      assertEquals("Class attribute differs", data.classAttribute(),
		   inst.classAttribute());
     
}