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


public class CodexTest_0_5_1 { 
  @Test
    public void testGetAsInstance() {
        Instance inst = new Instance(1.0, new double[]{1.0});
        Instances model = new Instances(inst, 1);
        Instance newInst = new Instance(1, new double[]{1.0});
        Random random = new Random(1);
        newInst.setDataset(model);
        assertEquals(inst, newInst);
    }
}