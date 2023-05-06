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


public class CodexTest_0_6_61 { 
  @Test
    public void testGetAsInstance() {
        Instances dataset = new Instances(new BufferedReader(new StringReader(
                "A,B,C\n" + "1,2,3\n" + "4,5,6\n")));
        AlgVector vector = new AlgVector(new double[] { 1, 2, 3 });
        Instance inst = vector.getAsInstance(dataset, new Random(1));
        assertEquals(inst.value(0), 1);
        assertEquals(inst.value(1), 2);
        assertEquals(inst.value(2), 3);
    }
}