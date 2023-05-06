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


public class CodexTest_0_3_9 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "E,F,G\n" + "N,N,N\n" + "1,2,3\n" + "4,5,6\n" + "7,8,9\n"
                        + "10,11,12\n")));
        model.setClassIndex(model.numAttributes() - 1);
        Random random = new Random(1);
        AlgVector vector = new AlgVector(new double[] { 1, 2, 3 });
        Instance inst = vector.getAsInstance(model, random);
        assertEquals(1, inst.value(0), EPSILON);
        assertEquals(2, inst.value(1), EPSILON);
        assertEquals(3, inst.value(2), EPSILON);
    }
}