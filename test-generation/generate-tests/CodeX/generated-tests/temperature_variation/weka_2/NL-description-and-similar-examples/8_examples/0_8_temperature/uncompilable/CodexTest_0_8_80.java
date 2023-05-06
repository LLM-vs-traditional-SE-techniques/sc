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


public class CodexTest_0_8_80 { 
  @Test
  public void testGetAsInstanceWithNominalVariables() {
    int NUMBER_ATTRIBUTES = 2;
    int NUMBER_DATAPOINTS = 1;
    double[][] data = {{0.0}, {1.0}};
    String[] labels = {"a", "b", "c"};
    try {
      Instances dataset = new Instances("instances", 
					createAttributes(NUMBER_ATTRIBUTES, 3),
					NUMBER_DATAPOINTS);
      AlgVector vector = new AlgVector(data[0]);
      Instance instance = vector.getAsInstance(dataset, new Random(1));
      assertTrue("#attributes differ", 
		 NUMBER_ATTRIBUTES == instance.numAttributes());
      assertTrue("#values differ", NUMBER_DATAPOINTS == instance.numValues());
      int counter = 0;
      while (counter < instance.numAttributes()) { 
	if (instance.isNominal(counter) || instance.isString(counter)) {
	  assertTrue("a value differ", "a" == instance.stringValue(counter));
	  counter++;
	} else {
	  assertTrue("a value differ", data[0][0] == instance.value(counter));
	  counter++;
	}
      }
    } catch (Exception e) {
      fail("Error getting instance:" + e.getMessage());
    }
  }
}