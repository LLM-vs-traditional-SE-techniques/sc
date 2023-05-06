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


public class CodexTest_0_5_82 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Random random = new Random(1);
        Instances model = new Instances(new BufferedReader(new StringReader(
                "X,Y\n" + "N,N\n" + "1,2\n" + "3,4\n")));
        model.setClassIndex(1);
        AlgVector v = new AlgVector(new double[]{0.5, 2.5});
        assertArrayEquals(new double[]{0.5, 2.5}, v.getElements(), 1e-8);
        Instance inst = v.getAsInstance(model, random);
        assertEquals(1, inst.value(0));
        assertEquals(1, inst.value(1));
    }
}