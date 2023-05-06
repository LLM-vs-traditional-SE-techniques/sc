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


public class CodexTest_0_4_53 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new StringReader("@relation test\n" + "@attribute a numeric\n" + "@attribute b numeric\n" + "@attribute c numeric\n" + "@data\n" + "1,2,3"));
        AlgVector v = new AlgVector(new double[]{1, 2, 3});
        Instance inst = v.getAsInstance(model, new Random());
        assertEquals(1, inst.value(0), 1e-6);
        assertEquals(2, inst.value(1), 1e-6);
        assertEquals(3, inst.value(2), 1e-6);
    }
}