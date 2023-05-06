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


public class CodexTest_0_5_23 { 
  @Test
    public void testGetAsInstance() {
        AlgVector v = new AlgVector(2);
        v.setElement(0, 1.0);
        v.setElement(1, 2.0);
        Instances inst = new Instances(new Instance(2));
        inst.setClassIndex(1);
        try {
            Instance newInst = v.getAsInstance(inst, new Random(1));
            assertEquals(1.0, newInst.value(0), 0.0);
            assertEquals(0.0, newInst.value(1), 0.0);
        } catch (Exception e) {
            fail("Exception: " + e.getMessage());
        }
    }
}