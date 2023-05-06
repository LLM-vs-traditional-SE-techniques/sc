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


public class CodexTest_0_6_56 { 
  @Test
    public void testInstances() {
        double[] data = {1, 2, 3, 4, 5, 6};
        AlgVector v = new AlgVector(data);
        try {
            Instances model = new Instances(new BufferedReader(
                    new FileReader("/home/hongzhe/Documents/test/test.arff")));
            Instance instance = v.getAsInstance(model, new Random(0));
            assertNotNull("Instance is null", instance);
            assertEquals("Instance has wrong number of attributes", model.numAttributes(), instance.numAttributes());
            assertEquals("Instance has wrong number of values", model.numAttributes(), instance.numValues());
            for (int i = 0; i < instance.numAttributes(); i++) {
                if (instance.attribute(i).isNominal()) {
                    assertTrue("Instance has missing value", instance.isMissing(i));
                } else {
                    assertFalse("Instance has missing value", instance.isMissing(i));
                    assertEquals("Instance has wrong value", data[i], instance.value(i), 1e-6);
                }
            }
        } catch (Exception e) {
            fail("Exception raised: " + e.getMessage());
        }
    }
}