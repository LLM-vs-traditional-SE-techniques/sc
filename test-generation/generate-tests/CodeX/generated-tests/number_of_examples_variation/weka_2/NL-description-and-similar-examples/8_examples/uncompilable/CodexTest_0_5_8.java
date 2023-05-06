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


public class CodexTest_0_5_8 { 
  @Test
    public void testGetAsInstance() throws Exception {
        int numInstances = 2;
        int numAttributes = 2;
        Instances dataset = new Instances(new BufferedReader(new StringReader(
                "A,B\n1,2\n3,4")), numInstances);
        double[] values = {1, 2};
        AlgVector vector = new AlgVector(values);
        Instance instance = vector.getAsInstance(dataset, new Random(1));
        assertEquals("Instance: A", 1.0, instance.value(0));
        assertEquals("Instance: B", 2.0, instance.value(1));
    }

}