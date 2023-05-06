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


public class CodexTest_0_3_23 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c,d\n" + "1,2,3,4\n" + "5,6,7,8\n")));
        Random random = new Random(0);
        AlgVector v = new AlgVector(new double[] { 1, 2, 3, 4 });
        Instance inst = v.getAsInstance(model, random);
        assertEquals(1.0, inst.value(0), 1e-6);
        assertEquals(2.0, inst.value(1), 1e-6);
        assertEquals(3.0, inst.value(2), 1e-6);
        assertEquals(4.0, inst.value(3), 1e-6);
    }
}