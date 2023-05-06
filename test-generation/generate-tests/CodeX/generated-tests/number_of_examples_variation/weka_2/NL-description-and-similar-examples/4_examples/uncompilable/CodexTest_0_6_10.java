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


public class CodexTest_0_6_10 { 
  @Test
    public void testGetAsInstance() throws Exception {
        Instances model = TestInstances.createSimpleTestInstances();
        AlgVector v = new AlgVector(3);
        Instance inst = v.getAsInstance(model, new Random(1));
        assertEquals(3, inst.numAttributes());
        assertEquals(inst.value(0), v.getElement(0), 0.0);
        assertEquals(inst.value(1), v.classValue(), 0.0);
        assertEquals(inst.value(2), 1.0, 0.0);
    }
}