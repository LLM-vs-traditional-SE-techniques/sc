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


public class CodexTest_0_7_12 { 
  @Test
    public void testGetAsInstance() throws Exception {
        Instances instances = new Instances(new BufferedReader(new StringReader(
                "a,b,c,d\n" + "0,0,0,1\n" + "1,0,0,0\n" + "0,1,0,0\n" + "0,0,1,0\n")));
        instances.setClassIndex(0);
        AlgVector test = new AlgVector(new double[] { 1, 2, 3, 4 });
        AlgVector test2 = new AlgVector(new double[] { 1 });
        Instance inst = test.getAsInstance(instances, new Random(1));
        assertEquals("a", inst.stringValue(0));
        assertTrue("b", inst.value(1) < 1);
        assertEquals("c", inst.stringValue(2));
        assertEquals("d", inst.stringValue(3));
        inst = test2.getAsInstance(instances, new Random(1));
        assertTrue("a", inst.value(0) < 1);
        assertEquals("b", inst.stringValue(1));
        assertEquals("c", inst.stringValue(2));
        assertEquals("d", inst.stringValue(3));
    }
}