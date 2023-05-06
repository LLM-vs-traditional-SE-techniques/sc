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


public class CodexTest_0_6_36 { 
    @Test
    public void testGetAsInstanceNumeric() throws Exception {
        AlgVector vector = new AlgVector(new double[]{1, 2, 3});
        Random random = new Random(123);
        Instances instances = new Instances(new BufferedReader(new StringReader("@RELATION fake\n@ATTRIBUTE a numeric\n@ATTRIBUTE b numeric\n@ATTRIBUTE c numeric\n@DATA\n1,2,3\n")));
        Instance instance = vector.getAsInstance(instances, random);
        assertEquals(1, instance.value(0), 1e-6);
        assertEquals(2, instance.value(1), 1e-6);
        assertEquals(3, instance.value(2), 1e-6);
    }
}