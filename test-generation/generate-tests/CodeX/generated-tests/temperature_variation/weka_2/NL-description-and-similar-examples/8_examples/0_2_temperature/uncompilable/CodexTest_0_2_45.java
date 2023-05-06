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


public class CodexTest_0_2_45 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "A,B,C\n" + "0,1,2\n" + "1,2,3\n" + "2,3,4\n" + "3,4,5\n"
                        + "4,5,6\n" + "5,6,7\n" + "6,7,8\n" + "7,8,9\n"
                        + "8,9,0\n" + "9,0,1\n")));
        AlgVector v = new AlgVector(new double[] { 1, 2, 3 });
        Instance i = v.getAsInstance(model, new Random(1));
        assertEquals(1.0, i.value(0), 0.0);
        assertEquals(2.0, i.value(1), 0.0);
        assertEquals(3.0, i.value(2), 0.0);
    }
}