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


public class CodexTest_0_2_76 { 
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
    int numMissing = 0;
    int classIndex = numAttributes - 1;
    int[] nominalCounts = {numClasses};
    int[] numericCounts = {numNumeric};
    int[] stringCounts = {numString};
    int[] dateCounts = {numDate};
    int[] relationalCounts = {numRelational};
    Instances data = makeTestDataset(42, numInstances, numAttributes,
				     numNominal, numNumeric, numString, numDate,
				     numRelational, numClasses, numMissing,
				     classIndex, nominalCounts, numericCounts,
				     stringCounts, dateCounts, relationalCounts);
    double[] values = {1.0, 2.0, 3.0};
    AlgVector v = new AlgVector(values);
    Instance inst = null;
    try {
      inst = v.getAsInstance(data, new Random(1));
    } catch (Exception ex) {
      fail("Exception thrown during getAsInstance: " + ex.getMessage());
    }
    assertEquals("Wrong number of attributes", numAttributes, inst.numAttributes());
    assertEquals("Wrong number of values", numAttributes, inst.numValues());
    assertEquals("Wrong number of missing values", numMissing, inst.numMissingAttributes());
    assertEquals("Wrong number of classes", numClasses, data.numClasses());
    assertEquals("Wrong class index", classIndex, data.classIndex());
    assertEquals("Wrong class attribute", data.classAttribute(), inst.classAttribute());
    assertEquals("Wrong class value", inst.classValue(), inst.value(classIndex));
    assertEquals("
}