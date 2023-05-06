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


public class CodexTest_0_8_51 { 
  @Test
    public void testGetAsInstance() {
        int numAtts = 10;
        Instances insts = new Instances("Test", 
                                        makeTestAttributes(numAtts), 1);
        double[] elements = new double[numAtts/2];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = i;
        }
        AlgVector v = new AlgVector(elements);
        try {
            Instance inst = v.getAsInstance(insts, new Random(1));
            assertEquals("Num atts differ", insts.numAttributes(), 
                         inst.numAttributes());
            for (int i = 0; i < numAtts/2; i++) {
                assertEquals("val differs", i, inst.value(i));
            }
            for (int i = numAtts/2; i < numAtts - 1; i++) {
                assertEquals("val differs", 0, inst.value(i));
            }
            assertEquals("val differs", 1, inst.value(numAtts - 1));
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}