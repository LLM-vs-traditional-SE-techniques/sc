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


public class CodexTest_0_4_9 { 
  @Test
    public void testGetAsInstance() {
        int numAttributes = 3;
        int numInstances = 2;
        int numValues = 2;
        double[] values = {1.0, 2.0, 3.0};
        Random random = new Random(1);
        Instances dataset = new Instances("test", getAttributes(numAttributes, numValues), numInstances);
        AlgVector vector = new AlgVector(values);
        Instance instance = vector.getAsInstance(dataset, random);
        assertEquals(numAttributes, instance.numAttributes());
        assertEquals(numAttributes, instance.numValues());
        assertEquals(values[0], instance.value(0));
        assertEquals(values[1], instance.value(1));
        assertEquals(values[2], instance.value(2));
    }
}