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


public class CodexTest_0_5_30 { 
  @Test
    public void testGetAsInstance() {
        int numAtts = 5;
        int numVals = 5;
        int numInsts = 10;
        Instances insts = null;
        try {
            insts = makeTestInstances(numAtts, numVals, numInsts);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Problem creating test instances");
        }
        Instance inst = insts.instance(0);
        AlgVector v = new AlgVector(inst);
        Random random = new Random(1);
        Instance newInst = null;
        try {
            newInst = v.getAsInstance(insts, random);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Problem converting vector to instance");
        }
        for (int i = 0; i < numAtts; i++) {
            if (insts.attribute(i).isNumeric()) {
                assertEquals("Numeric attribute not converted correctly", inst.value(i), newInst.value(i), 0);
            }
            if (insts.attribute(i).isNominal()) {
                assertNotSame("Nominal attribute not converted correctly", inst.value(i), newInst.value(i));
            }
        }
    }
}