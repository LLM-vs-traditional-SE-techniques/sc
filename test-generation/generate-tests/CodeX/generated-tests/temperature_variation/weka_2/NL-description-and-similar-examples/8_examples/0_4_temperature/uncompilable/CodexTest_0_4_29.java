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


public class CodexTest_0_4_29 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c,d\n" + "1,2,3,4\n" + "5,6,7,8\n" + "9,10,11,12\n"
                        + "13,14,15,16\n" + "17,18,19,20\n"
                        + "21,22,23,24\n" + "25,26,27,28\n"
                        + "29,30,31,32\n")));
        model.setClassIndex(model.numAttributes() - 1);
        AlgVector v = new AlgVector(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
                26, 27, 28, 29, 30, 31, 32 });
        try {
            Instance inst = v.getAsInstance(model, new Random(123));
            assertEquals("Class is not correct", 1, inst.classValue());
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Exception thrown on getAsInstance");
        }
    }
}