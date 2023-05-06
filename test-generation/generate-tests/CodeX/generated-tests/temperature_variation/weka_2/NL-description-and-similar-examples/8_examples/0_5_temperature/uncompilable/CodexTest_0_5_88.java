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


public class CodexTest_0_5_88 { 
  @Test
    public void testGetAsInstance() throws Exception {
        Instances inst = TestInstances.makeTestInstances();
        AlgVector v = new AlgVector(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 11, 12});
        Instance newInst = v.getAsInstance(inst, new Random(0));
        assertEquals(inst.numAttributes(), newInst.numAttributes());
        assertEquals(inst.numAttributes(), newInst.numValues());
        for (int i = 0; i < inst.numAttributes(); i++) {
            if (inst.attribute(i).isNumeric()) {
                assertEquals(i + 1, newInst.value(i), 1e-6);
            } else if (inst.attribute(i).isNominal()) {
                assertTrue("Value out of range: " + newInst.value(i),
                        0 <= newInst.value(i) && newInst.value(i) < inst.attribute(i).numValues());
            }
        }
    }
}