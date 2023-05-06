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


public class CodexTest_0_5_22 { 
  @Test
    public void testGetAsInstance() {
        int numAttributes = 2;
        int numInstances = 1;
        Instances dataset = 
            new Instances("test", makeAttributes(numAttributes), numInstances);
        dataset.setClassIndex(0);
        AlgVector v = new AlgVector(numAttributes);
        for (int i = 0; i < numAttributes; i++) {
            v.setElement(i, i);
        }
        try {
            Instance inst = v.getAsInstance(dataset, new Random(0));
            assertEquals("Number of attributes differ", numAttributes, 
                         inst.numAttributes());
            assertEquals("Number of values differ", numAttributes, 
                         inst.numValues());
            assertEquals("Class value differs", 0, (int) inst.classValue());
            for (int i = 0; i < numAttributes; i++) {
                assertEquals("Value differs", i, inst.value(i));
            }
        } catch (Exception ex) {
            fail("Exception during test: " + ex.getMessage());
        }
    }
}