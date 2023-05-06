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


public class CodexTest_0_6_5 { 
  @Test
    public void testGetAsInstance() throws Exception {
        Instances instances = new Instances(new BufferedReader(new StringReader(IRIS_DATA_SET)));
        Random random = new Random(1);
        DenseInstance instance = new DenseInstance(5.0, 3.0, 1.6, 0.2);
        instance.setDataset(instances);
        Instance newInstance = instance.getAsInstance(instances, random);
        assertEquals(newInstance.value(0), 5.0, EPSILON);
        assertEquals(newInstance.value(1), 3.0, EPSILON);
        assertEquals(newInstance.value(2), 1.6, EPSILON);
        assertEquals(newInstance.value(3), 0.2, EPSILON);
        assertEquals(newInstance.value(4), 0.0, EPSILON);
    }
}