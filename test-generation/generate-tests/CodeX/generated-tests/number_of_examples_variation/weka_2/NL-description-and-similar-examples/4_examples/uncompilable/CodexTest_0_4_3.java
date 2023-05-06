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


public class CodexTest_0_4_3 { 
  @Test
    public void testGetAsInstance() {
        AlgVector v = new AlgVector(new double[] {1, 2, 3});
        Instances inst = new Instances(new FastVector(), new FastVector());
        inst.insertAttributeAt(new Attribute("a"), 0);
        inst.insertAttributeAt(new Attribute("b"), 1);
        inst.insertAttributeAt(new Attribute("c"), 2);
        try {
            Instance inst2 = v.getAsInstance(inst, new Random(1));
            assertEquals(inst.numAttributes(), inst2.numAttributes());
            assertEquals(inst.numAttributes(), v.numElements());
            assertEquals(inst.numAttributes(), inst2.numValues());
            assertEquals(1.0, inst2.value(0), 0.0);
            assertEquals(2.0, inst2.value(1), 0.0);
            assertEquals(3.0, inst2.value(2), 0.0);
        } catch (Exception ex) {
            fail("Exception thrown: " + ex.getMessage());
        }
    }
}