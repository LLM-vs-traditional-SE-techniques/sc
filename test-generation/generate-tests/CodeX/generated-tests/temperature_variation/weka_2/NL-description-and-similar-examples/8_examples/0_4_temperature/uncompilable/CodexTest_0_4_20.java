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


public class CodexTest_0_4_20 { 
    @Test
    public void testGetAsInstance() {
        double[] data = {2.3, 1.2, 5.0};
        Instances inst = new Instances(new MockInstances(data.length));
        AlgVector v = new AlgVector(data);
        Instance inst2 = null;
        try {
            inst2 = v.getAsInstance(inst, new Random(1));
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertEquals("Length differs", data.length, inst2.numAttributes());
        for (int i = 0; i < data.length; i++) {
            assertEquals((i + 1) + ". value differs", data[i], inst2.value(i), 0.01);
        }
    }
}