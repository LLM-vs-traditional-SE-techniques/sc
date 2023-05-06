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


public class CodexTest_0_4_19 { 
  @Test
    public void testGetAsInstance() {
        AlgVector v = new AlgVector(new double[]{2.3, 1.2, 5.0});
        Instances data = new Instances(new BufferedReader(new StringReader(
                "a,b,c\n"
                + "0,0,0\n"
                + "0,0,1\n"
                + "0,1,0\n"
                + "0,1,1\n"
                + "1,0,0\n"
                + "1,0,1\n"
                + "1,1,0\n"
                + "1,1,1\n")));
        Instance inst = v.getAsInstance(data, new Random(0));
        assertEquals("a", 0.0, inst.value(0));
        assertEquals("b", 0.0, inst.value(1));
        assertEquals("c", 0.0, inst.value(2));
    }
}