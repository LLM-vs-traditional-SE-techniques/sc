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


public class CodexTest_0_6_6 { 
  @Test
    public void testGetAsInstance() throws Exception {
        int length = 3;
        AlgVector v = new AlgVector(length);
        for (int i = 0; i < length; i++) {
            v.setElement(i, (double)i);
        }
        Instances model = new Instances(new StringReader(
                "A,B,C\n"
                + "0,1,2\n"
                + "0,0,1\n"
                + "1,0,0\n"));
        Instance inst = v.getAsInstance(model, new Random());
        assertEquals(3, inst.numAttributes());
        assertEquals(0, inst.value(0));
        assertEquals(0, inst.value(1));
        assertEquals(0, inst.value(2));
    }

}