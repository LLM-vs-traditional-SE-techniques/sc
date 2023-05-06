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


public class CodexTest_0_3_46 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "A,B,C\n" +
                "1,2,3\n" +
                "4,5,6\n")));
        AlgVector v = new AlgVector(new double[]{1, 2, 3});
        Instance i = v.getAsInstance(model, new Random(1));
        assertEquals(1, i.value(0), 1e-6);
        assertEquals(2, i.value(1), 1e-6);
        assertEquals(3, i.value(2), 1e-6);
    }
}