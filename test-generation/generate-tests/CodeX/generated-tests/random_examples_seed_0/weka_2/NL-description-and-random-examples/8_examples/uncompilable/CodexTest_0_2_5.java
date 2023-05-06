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


public class CodexTest_0_2_5 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c,d\n1,2,3,4\n5,6,7,8\n9,10,11,12\n13,14,15,16\n")));
        model.setClassIndex(model.numAttributes() - 1);
        Instance instance = new DenseInstance(model.numAttributes());
        instance.setDataset(model);
        instance.setValue(0, 1);
        instance.setValue(1, 2);
        instance.setValue(2, 3);
        instance.setValue(3, 4);
        Random random = new Random(1);
        Instance newInst = instance.getAsInstance(model, random);
        assertEquals(1.0, newInst.value(0), 0.0);
        assertEquals(2.0, newInst.value(1), 0.0);
        assertEquals(3.0, newInst.value(2), 0.0);
        assertEquals(4.0, newInst.value(3), 0.0);
    }
}