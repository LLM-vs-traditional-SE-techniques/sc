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


public class CodexTest_0_4_3 { 
  @Test
    public void testGetAsInstance() {
        AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
        Instances insts = new Instances(new FastVector(), new FastVector());
        insts.add(new Attribute("att1"));
        insts.add(new Attribute("att2"));
        insts.add(new Attribute("att3"));
        insts.add(new Attribute("att4", (FastVector) null));
        insts.add(new Attribute("att5", (FastVector) null));
        try {
            Instance inst = v.getAsInstance(insts, new Random(1));
            assertEquals(1.0, inst.value(0), 1e-6);
            assertEquals(2.0, inst.value(1), 1e-6);
            assertEquals(3.0, inst.value(2), 1e-6);
            assertEquals(0, inst.value(3));
            assertEquals(0, inst.value(4));
        } catch (Exception ex) {
            fail("Exception: " + ex.getMessage());
        }
    }
}