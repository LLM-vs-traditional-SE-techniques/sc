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


public class CodexTest_0_3_73 { 
  @Test
    public void testGetAsInstance() {
        double[] data = {2.3, 1.2, 5.0};
        AlgVector v = new AlgVector(data);
        Instances model = new Instances(new FastVector(), 0);
        model.insertAttributeAt(new Attribute("A1"), 0);
        model.insertAttributeAt(new Attribute("A2"), 1);
        model.insertAttributeAt(new Attribute("A3"), 2);
        Random random = new Random(1);
        try {
            Instance inst = v.getAsInstance(model, random);
            assertEquals("Number of attributes differ", model.numAttributes(), inst.numAttributes());
            assertEquals("1. value differs", 2.3, inst.value(0), 1e-6);
            assertEquals("2. value differs", 1.2, inst.value(1), 1e-6);
            assertEquals("3. value differs", 5.0, inst.value(2), 1e-6);
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}