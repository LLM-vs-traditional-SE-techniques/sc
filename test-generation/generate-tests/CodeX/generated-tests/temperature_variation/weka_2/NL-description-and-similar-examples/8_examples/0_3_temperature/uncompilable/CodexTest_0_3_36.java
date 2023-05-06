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


public class CodexTest_0_3_36 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "A,B,C,D\n" + "1,2,3,4\n" + "5,6,7,8\n" + "9,10,11,12\n"
                        + "13,14,15,16\n")));
        AlgVector v = new AlgVector(new double[] { 1, 2, 3, 4 });
        Instance newInst = v.getAsInstance(model, new Random(1));
        assertEquals(1.0, newInst.value(0));
        assertEquals(2.0, newInst.value(1));
        assertEquals(3.0, newInst.value(2));
        assertEquals(4.0, newInst.value(3));
    }
}