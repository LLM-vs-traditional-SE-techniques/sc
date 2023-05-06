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


public class CodexTest_0_3_5 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "A,B,C\n" + "1,2,3\n" + "4,5,6\n" + "7,8,9")));
        AlgVector v = new AlgVector(new double[] { 1, 2, 3 });
        Random r = new Random(1);
        Instance i = v.getAsInstance(model, r);
        assertEquals(1.0, i.value(0));
        assertEquals(2.0, i.value(1));
        assertEquals(0.0, i.value(2));
    }
}