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


public class CodexTest_0_4_32 { 
    @Test
    public void testGetAsInstance() {
        double[] data = {1.0, 2.0, 3.0};
        AlgVector v = new AlgVector(data);
        Instances model = new Instances(new FastVector(), 0);
        model.insertAttributeAt(new Attribute("att1"), 0);
        model.insertAttributeAt(new Attribute("att2"), 1);
        model.insertAttributeAt(new Attribute("att3"), 2);
        model.insertAttributeAt(new Attribute("att4"), 3);
        model.insertAttributeAt(new Attribute("att5"), 4);
        model.insertAttributeAt(new Attribute("att6"), 5);
        model.insertAttributeAt(new Attribute("att7"), 6);
        model.insertAttributeAt(new Attribute("att8"), 7);
        model.insertAttributeAt(new Attribute("att9"), 8);
        model.insertAttributeAt(new Attribute("att10"), 9);
        model.setClassIndex(model.numAttributes() - 1);
        Random r = new Random(1);
        try {
            Instance newInst = v.getAsInstance(model, r);
            assertEquals("First value differs", 1.0, newInst.value(0), 1e-6);
            assertEquals("Second value differs", 2.0, newInst.value(1), 1e-6);
            assertEquals("Third value differs", 3.0, newInst.value(2), 1e-6);
            assertEquals("Fourth value differs", 0.0, newInst.value(3), 1e-6);
            assertEquals("Fifth value differs", 0.0, newInst.value(4), 1e-6);
            assertEquals("Sixth value differs", 0.0, newInst.value(5), 1e-6);
            assertEquals("Seventh value differs", 0.0, newInst.value(6), 1e-6);
            assertEquals("Eighth value differs", 0.0, newInst.value(7), 1e-6);
            assertEquals("Ninth value
}