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


public class CodexTest_0_2_51 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c\n" + "1,2,3\n" + "4,5,6\n" + "7,8,9\n")));
        AlgVector v = new AlgVector(new double[]{1, 2, 3});
        try {
            Instance newInst = v.getAsInstance(model, new Random(1));
            assertEquals("a", newInst.stringValue(0));
            assertEquals("b", newInst.stringValue(1));
            assertEquals("c", newInst.stringValue(2));
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}