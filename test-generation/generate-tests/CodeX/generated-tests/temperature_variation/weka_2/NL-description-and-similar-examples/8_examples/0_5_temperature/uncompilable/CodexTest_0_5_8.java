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


public class CodexTest_0_5_8 { 
  @Test
    public void testToInstance() {
        Instances insts = makeTestDataset();
        AlgVector vec = new AlgVector(new double[]{3.0, 2.0, 1.0});
        Instance inst = vec.getAsInstance(insts, new Random(0));
        assertEquals("Wrong number of attributes", insts.numAttributes(),
                inst.numAttributes());
        assertEquals("Wrong number of values", insts.numAttributes(),
                inst.numValues());
        assertEquals("Wrong 1st value", 3.0, inst.value(0), 0.0);
        assertEquals("Wrong 2nd value", 2.0, inst.value(1), 0.0);
        assertEquals("Wrong 3rd value", 1.0, inst.value(2), 0.0);
        assertEquals("Wrong 4th value", 0.0, inst.value(3), 0.0);
        assertEquals("Wrong 5th value", 1.0, inst.value(4), 0.0);
    }
}