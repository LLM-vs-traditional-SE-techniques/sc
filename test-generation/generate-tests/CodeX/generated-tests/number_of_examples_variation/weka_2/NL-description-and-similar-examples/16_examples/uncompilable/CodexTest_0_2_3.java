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


public class CodexTest_0_2_3 { 
  @Test
    public void testGetAsInstance() {
        int numInstances = 10;
        int numAttributes = 5;
        int numNominal = 2;
        int numNumeric = 3;
        Random random = new Random(1);
        Instances dataset = new Instances(new BufferedReader(new StringReader(
                InstancesTest.makeInstancesTestString(numInstances, numAttributes,
                        numNominal, numNumeric))));
        AlgVector v = new AlgVector(numNumeric);
        for (int i = 0; i < numNumeric; i++) {
            v.setElement(i, i);
        }
        Instance inst = v.getAsInstance(dataset, random);
        assertEquals(numAttributes, inst.numAttributes());
        assertEquals(numNominal, inst.numNominalAttributes());
        assertEquals(numNumeric, inst.numNumericAttributes());
        for (int i = 0; i < numNumeric; i++) {
            assertEquals(i, inst.value(i), 1e-6);
        }
    }
}