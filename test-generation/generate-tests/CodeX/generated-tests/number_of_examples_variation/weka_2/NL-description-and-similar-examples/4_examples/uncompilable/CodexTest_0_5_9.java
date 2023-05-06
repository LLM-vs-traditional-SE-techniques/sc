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
    public void testGetAsInstance() {
        Instances model = getTestInstances();
        Random random = new Random(1);
        AlgVector v = new AlgVector(new double[] {1, 2, 3});
        try {
            Instance inst = v.getAsInstance(model, random);
            assertEquals("Wrong length", 3, inst.numAttributes());
            assertEquals("Wrong value", 1, inst.value(0), 1e-6);
            assertEquals("Wrong value", 2, inst.value(1), 1e-6);
            assertEquals("Wrong value", 0, inst.value(2), 1e-6);
        } catch (Exception ex) {
            fail("Unexpected Exception: " + ex.getMessage());
        }
    }
}