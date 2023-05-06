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


public class CodexTest_0_4_10 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c\n1,2,3\n4,5,6\n")));
        Instance inst = new DenseInstance(1, new double[] { 1, 2, 3 });
        inst.setDataset(model);
        Instance newInst = inst.getAsInstance(model, new Random(0));
        assertEquals(inst, newInst);
    }
}