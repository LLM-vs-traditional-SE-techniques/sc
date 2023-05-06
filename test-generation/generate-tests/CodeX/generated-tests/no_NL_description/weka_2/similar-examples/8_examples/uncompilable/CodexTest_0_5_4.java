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


public class CodexTest_0_5_4 { 
  @Test
    public void testGetAsInstance() {
        double[] data = {1, 2, 3};
        AlgVector vector = new AlgVector(data);
        Instances model = new Instances(new BufferedReader(new StringReader(
                "A,B,C,D\n"
                        + "A,B,C,D\n"
                        + "A,B,C,D\n")));
        Instance inst = vector.getAsInstance(model, new Random(1));
        assertEquals(data[0], inst.value(0));
        assertEquals(data[1], inst.value(1));
        assertEquals(data[2], inst.value(2));
        assertEquals(0, inst.value(3));
    }
}