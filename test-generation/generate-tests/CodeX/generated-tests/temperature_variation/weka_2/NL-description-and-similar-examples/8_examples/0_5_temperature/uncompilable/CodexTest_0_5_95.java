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


public class CodexTest_0_5_95 { 
    @Test
    public void testGetAsInstance() {
        AlgVector v = new AlgVector(new double[]{1.0, 2.0});
        Instances model = new Instances(new ArrayList<Attribute>(), 2);
        Instance inst = v.getAsInstance(model, new Random());
        assertEquals(2, inst.numAttributes());
        assertEquals(1.0, inst.value(0), 1e-6);
        assertEquals(2.0, inst.value(1), 1e-6);
    }
}