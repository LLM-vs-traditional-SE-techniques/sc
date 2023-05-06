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


public class CodexTest_0_5_9 { 
  @Test
    public void testGetAsInstanceWithDataset() {
        try {
            double[][] values = new double[3][3];
            for (int i = 0; i < values.length; i++) {
                for (int j = 0; j < values[0].length; j++) {
                    values[i][j] = Math.random();
                }
            }
            Instances data = MatrixOps.createInstances(values, null, 3);
            AlgVector v = new AlgVector(values[0]);
            Instance inst = v.getAsInstance(data, new Random(1));
            assertEquals("Different number of values.", data.numAttributes(), inst.numAttributes());
            assertEquals("Different number of values.", v.numElements(), inst.numValues());
            for (int i = 0; i < data.numAttributes(); i++) {
                if (data.attribute(i).isNumeric()) {
                    assertEquals("Different values.", v.getElement(i), inst.value(i), 1.0e-8);
                }
            }
        } catch (Exception ex) {
            fail("Exception during getAsInstanceWithDataset: " + ex.getMessage());
        }
    }
}