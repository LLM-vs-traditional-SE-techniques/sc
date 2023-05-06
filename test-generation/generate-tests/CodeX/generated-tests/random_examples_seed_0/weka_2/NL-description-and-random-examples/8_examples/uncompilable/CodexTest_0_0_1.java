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


public class CodexTest_0_0_1 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c\n" + "1,2,3\n" + "4,5,6\n" + "7,8,9\n")));
        model.setClassIndex(model.numAttributes() - 1);
        Instance instance = new DenseInstance(model.numAttributes());
        instance.setDataset(model);
        instance.setValue(0, 1);
        instance.setValue(1, 2);
        instance.setValue(2, 3);
        Instance newInst = null;
        try {
            newInst = instance.getAsInstance(model, new Random(1));
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
        assertEquals(instance.value(0), newInst.value(0), 0);
        assertEquals(instance.value(1), newInst.value(1), 0);
        assertEquals(instance.value(2), newInst.value(2), 0);
    }
}