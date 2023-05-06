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


public class CodexTest_0_5_63 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 1;
    double[][] data = { {1.0, 2.0, 3.0} };
    Instances dataSet = makeTestInstances(numAttributes, numInstances, data);
    Instances dataSet2 = makeTestInstances(numAttributes, numInstances, data);
    AlgVector vector = new AlgVector(data[0]);
    try {
      Instance instance = vector.getAsInstance(dataSet, new Random(1));
      assertEquals("Number of attributes differ", numAttributes, 
		   instance.numAttributes());
      for (int i = 0; i < numAttributes; i++) {
	if (dataSet.attribute(i).isNumeric()) {
	  assertEquals("Values differ", data[0][i], instance.value(i));
	}
	if (dataSet.attribute(i).isNominal()) {
	  assertEquals("Values differ", data[0][i], instance.value(i));
	}
      }
      Instance instance2 = vector.getAsInstance(dataSet2, new Random(1));
      assertEquals("Instances differ", instance, instance2);
    } catch (Exception e) {
      fail("Exception occured: " + e.getMessage());
    }
  }
}