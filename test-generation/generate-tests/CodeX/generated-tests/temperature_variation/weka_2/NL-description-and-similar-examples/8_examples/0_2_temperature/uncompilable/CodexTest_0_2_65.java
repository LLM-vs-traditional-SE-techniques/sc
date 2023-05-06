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


public class CodexTest_0_2_65 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "A,B,C\n" + "1,2,3\n" + "4,5,6\n" + "7,8,9\n")));
        AlgVector v = new AlgVector(new double[] { 1, 2, 3 });
        Instance inst = v.getAsInstance(model, new Random(1));
        assertEquals("A", 1.0, inst.value(0), 1e-6);
        assertEquals("B", 2.0, inst.value(1), 1e-6);
        assertEquals("C", 3.0, inst.value(2), 1e-6);
    }
}