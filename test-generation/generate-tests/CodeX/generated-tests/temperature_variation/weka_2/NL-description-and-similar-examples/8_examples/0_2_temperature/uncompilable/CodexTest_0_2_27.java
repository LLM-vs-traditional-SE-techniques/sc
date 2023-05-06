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


public class CodexTest_0_2_27 { 
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
    int classIndex = 2;
    int[] nominalCounts = {2};
    int[] numericCounts = {0, 0};
    int[] stringCounts = {};
    int[] dateCounts = {};
    int[] relationalCounts = {};
    Instances data = makeTestDataset(42, numAttributes, numInstances, 
				     numNominal, numNumeric, numString, 
				     numDate, numRelational, numClasses, 
				     classIndex, nominalCounts, numericCounts, 
				     stringCounts, dateCounts, relationalCounts);
    double[] values = {1.0, 2.0};
    AlgVector v = new AlgVector(values);
    try {
      Instance inst = v.getAsInstance(data, new Random(1));
      assertEquals("Number of attributes differs", numAttributes, 
		   inst.numAttributes());
      assertEquals("Number of values differs", numAttributes, 
		   inst.numValues());
      assertEquals("Number of missing values differs", 0, 
		   inst.numMissingAttributes());
      assertEquals("Number of missing values differs", 0, 
		   inst.numMissingValues());
      assertEquals("Class index differs", classIndex, inst.classIndex());
      assertEquals("Class is not missing", false, inst.classIsMissing());
      assertEquals("Class value differs", 1.0, inst.classValue());
      assertEquals("Value differs", 1.0, inst.value(0));
      assertEquals("Value differs", 2.0, inst.value(1));
      assertEquals("Value differs", 1.0, inst.value(2));

}