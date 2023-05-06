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


public class CodexTest_0_7_45 { 
    @Test
    public void testGetAsInstance() throws Exception {
        AlgVector v = new AlgVector(3);
        for (int i = 0; i < v.numElements(); i++)
            v.setElement(i, i);
        Instances model = new Instances(new BufferedReader(new StringReader(
                "D,C\n1,2\n")), 0);
        model.setClassIndex(model.numAttributes() - 1);
        Instance newInst = v.getAsInstance(model, new Random());
        assertEquals(model.numAttributes(), newInst.numAttributes());
        assertEquals(model.classIndex(), newInst.classIndex());
        assertEquals(model.classAttribute().numValues(),
                newInst.classAttribute().numValues());
        assertEquals(model.classAttribute().value(1),
                newInst.classAttribute().value(newInst.classValue()));
        assertEquals(0.0, newInst.value(0), 1e-10);
    }
}