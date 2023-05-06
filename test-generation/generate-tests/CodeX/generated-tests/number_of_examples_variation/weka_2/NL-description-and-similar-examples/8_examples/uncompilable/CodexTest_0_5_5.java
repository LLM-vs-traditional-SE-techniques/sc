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


public class CodexTest_0_5_5 { 
    @Test
    public void testGetAsInstance() throws Exception {
        AlgVector vector = new AlgVector(new double[] {1.0, 2.0});
        Instances model = new Instances(new StringReader("@RELATION test\n"
                + "@ATTRIBUTE a NUMERIC\n"
                + "@ATTRIBUTE b NUMERIC\n"
                + "@ATTRIBUTE c NUMERIC\n"
                + "@ATTRIBUTE d NUMERIC\n"
                + "@DATA\n"
                + "1, 2, 3, 4\n"
                + "5, 6, 7, 8\n"));
        Instance instance = vector.getAsInstance(model, new Random(1));
        assertEquals(1.0, instance.value(0), 1e-6);
        assertEquals(2.0, instance.value(1), 1e-6);
        assertEquals(3.0, instance.value(2), 1e-6);
        assertEquals(4.0, instance.value(3), 1e-6);
    }
}