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


public class CodexTest_0_6_26 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new BufferedReader(new StringReader(instances)));
        model.setClassIndex(1);
        double[] elements = {1, 2, 3};
        AlgVector v = new AlgVector(elements);
        Instance inst = v.getAsInstance(model, new Random());
        assertEquals("Wrong instance length", 3, inst.numValues());
        assertEquals("Wrong value", 1, inst.value(0), 1e-6);
        assertEquals("Wrong value", 2, inst.value(1), 1e-6);
        assertEquals("Wrong value", 3, inst.value(2), 1e-6);
    }
}