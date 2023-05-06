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


public class CodexTest_0_4_8 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c,d\n1,2,3,4\n5,6,7,8\n9,10,11,12\n13,14,15,16\n")));
        model.setClassIndex(model.numAttributes() - 1);
        Random random = new Random(1);
        Instance newInst = new DenseInstance(model.numAttributes());
        newInst.setDataset(model);
        Instance result = getAsInstance(model, random);
        assertEquals(newInst.toString(), result.toString());
    }
}