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


public class CodexTest_0_3_1 { 
  @Test
    public void testGetAsInstance() {
        int numAttributes = 2;
        Instances model = new Instances("model", new ArrayList<Attribute>(), numAttributes);
        model.add(new DenseInstance(numAttributes));
        model.add(new DenseInstance(numAttributes));
        model.setClassIndex(1);
        AlgVector v = new AlgVector(numAttributes);
        Random random = new Random(1);
        try {
            Instance newInst = v.getAsInstance(model, random);
            assertEquals("Num attributes differ", numAttributes, newInst.numAttributes());
            assertEquals("Num values differ", numAttributes, newInst.numValues());
            assertEquals("Value differs", 0.0, newInst.value(0), 0.0);
            assertEquals("Value differs", 1.0, newInst.value(1), 0.0);
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
}