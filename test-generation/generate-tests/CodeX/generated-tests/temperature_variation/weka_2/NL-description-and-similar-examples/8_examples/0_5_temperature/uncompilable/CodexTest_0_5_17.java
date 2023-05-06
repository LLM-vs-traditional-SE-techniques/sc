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


public class CodexTest_0_5_17 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new StringReader(
                "E,D,A\n"
                + "0,0,0\n"
                + "1,1,1\n"));
        model.setClassIndex(model.numAttributes() - 1);
        DenseInstance instance = new DenseInstance(model.numAttributes());
        instance.setDataset(model);
        instance.setValue(0, 1.0);
        instance.setValue(1, 2.0);
        instance.setValue(2, 0.0);
        AlgVector v = new AlgVector(instance);
        Random random = new Random(1);
        Instance newInst = v.getAsInstance(model, random);
        assertEquals("Not compatible", instance, newInst);
    }
}