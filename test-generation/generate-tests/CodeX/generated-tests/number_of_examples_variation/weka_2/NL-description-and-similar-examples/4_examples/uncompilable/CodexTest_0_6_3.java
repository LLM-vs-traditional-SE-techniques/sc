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
    public void testGetAsInstance() throws Exception {
        AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
        Instance inst = v.getAsInstance(getInstances(), null);
        assertEquals("Number of attributes differs", 3, inst.numAttributes());
        assertEquals("Attribute 0 differs", 1.0, inst.value(0), 0.0);
        assertEquals("Attribute 1 differs", 2.0, inst.value(1), 0.0);
        assertEquals("Attribute 2 differs", 3.0, inst.value(2), 0.0);
    }
}