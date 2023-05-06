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


public class CodexTest_0_9_81 { 
    @Test
    public void testGetAsInstanceNominalAttributesOnlyRandom() {
        Instances data = getTestInstancesWithOnlyNominalTestData();
        AlgVector v = new AlgVector(data);
        Instance instance = v.getAsInstance(data, new Random());
        assertEquals(data.numAttributes(), instance.numAttributes());
    }
    @Test
    public void testGetAsInstanceNominalAttributesOnlySeededRandom() {
        Instances data = getTestInstancesWithOnlyNominalTestData();
        AlgVector v = new AlgVector(data);
        Random r = new Random(55);
        Instance instance = v.getAsInstance(data, r);
        assertEquals(data.numAttributes(), instance.numAttributes());
    }
    @Test
    public void testGetAsInstanceNumericAttributesOnlyRandom() {
        Instances data = getTestInstancesWithOnlyNominalTestData();
        double[] dataArray = weightVector.getElement(taxC).getAttributeWeights();
        AlgVector v = new AlgVector(dataArray);
        Instance instance = v.getAsInstance(data, new Random());
        assertEquals(data.numAttributes(), instance.numAttributes());
    }

}