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


public class CodexTest_0_6_3 { 
  @Test
    public void testGetAsInstance() {
        double[] vals = { 1, 2, 3 };
        AlgVector v = new AlgVector(vals);
        Instances model = new Instances(new Instance(0), 0);
        model.insertAttributeAt(new Attribute("a1"), 0);
        model.insertAttributeAt(new Attribute("a2"), 1);
        model.insertAttributeAt(new Attribute("a3"), 2);
        Random r = new Random(1);
        Instance inst = null;
        try {
            inst = v.getAsInstance(model, r);
        } catch (Exception e) {
            fail("Exception: " + e.getMessage());
        }
        assertEquals("Num attributes differ", model.numAttributes(), inst.numAttributes());
        assertEquals("Num values differ", model.numAttributes(), inst.numValues());
        assertEquals("Attribute names differ", model.attribute(0).name(), inst.attribute(0).name());
        assertEquals("Attribute names differ", model.attribute(1).name(), inst.attribute(1).name());
        assertEquals("Attribute names differ", model.attribute(2).name(), inst.attribute(2).name());
        assertEquals("Attribute values differ", vals[0], inst.value(0), 1e-6);
        assertEquals("Attribute values differ", vals[1], inst.value(1), 1e-6);
        assertEquals("Attribute values differ", vals[2], inst.value(2), 1e-6);
    }
}