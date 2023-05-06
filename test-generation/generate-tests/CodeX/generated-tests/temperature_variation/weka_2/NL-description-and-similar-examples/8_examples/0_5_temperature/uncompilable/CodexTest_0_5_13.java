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


public class CodexTest_0_5_13 { 
   @Test
    public void testGetAsInstance() {
        AlgVector vector = new AlgVector(new double[]{0.2, 0.3});
        Instances instances = new Instances(null, new ArrayList<>(Arrays.asList(new Attribute("first"), new Attribute("second"))), 1);
        Instance instance = vector.getAsInstance(instances, new Random(1));
        assertEquals(0.2, instance.value(0), 0.0001);
        assertEquals(0.3, instance.value(1), 0.0001);
    }
}