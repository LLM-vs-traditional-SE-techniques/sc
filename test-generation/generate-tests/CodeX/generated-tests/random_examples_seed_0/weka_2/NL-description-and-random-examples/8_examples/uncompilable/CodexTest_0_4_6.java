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


public class CodexTest_0_4_6 { 
    @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c\n" +
                        "1,2,3\n" +
                        "4,5,6\n" +
                        "7,8,9")));
        Instance newInst = new Instance(model.numAttributes());
        newInst.setDataset(model);
        newInst.setValue(0, 1);
        newInst.setValue(1, 2);
        newInst.setValue(2, 3);
        Instance newInst1 = new Instance(model.numAttributes());
        newInst1.setDataset(model);
        newInst1.setValue(0, 4);
        newInst1.setValue(1, 5);
        newInst1.setValue(2, 6);
        Instance newInst2 = new Instance(model.numAttributes());
        newInst2.setDataset(model);
        newInst2.setValue(0, 7);
        newInst2.setValue(1, 8);
        newInst2.setValue(2, 9);
        assertEquals(newInst, new Instance(newInst.toDoubleArray()).getAsInstance(model, new Random()));
        assertEquals(newInst1, new Instance(newInst1.toDoubleArray()).getAsInstance(model, new Random()));
        assertEquals(newInst2, new Instance(newInst2.toDoubleArray()).getAsInstance(model, new Random()));
    }
}