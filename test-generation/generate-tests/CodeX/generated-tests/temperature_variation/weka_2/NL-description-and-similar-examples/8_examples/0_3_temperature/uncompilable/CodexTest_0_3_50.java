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


public class CodexTest_0_3_50 { 
  @Test
    public void testGetAsInstanceWithRandom() {
        int numAttrs = 5;
        int numVals = 3;
        double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
        Instances insts = new Instances(new DenseInstance(numAttrs));
        for (int i = 0; i < numAttrs; i++) {
            if (i % 2 == 0) {
                insts.insertAttributeAt(new Attribute("Nom" + i), i);
            } else {
                insts.insertAttributeAt(new Attribute("Num" + i), i);
            }
        }
        AlgVector vec = new AlgVector(values);
        try {
            Instance inst = vec.getAsInstance(insts, new Random(1));
            assertEquals(numAttrs, inst.numAttributes());
            for (int i = 0; i < numAttrs; i++) {
                if (i % 2 == 0) {
                    assertEquals(0, inst.value(i));
                } else {
                    assertEquals(values[(i - 1) / 2], inst.value(i));
                }
            }
        } catch (Exception ex) {
            fail("Exception during getAsInstance: " + ex.getMessage());
        }
    }
}