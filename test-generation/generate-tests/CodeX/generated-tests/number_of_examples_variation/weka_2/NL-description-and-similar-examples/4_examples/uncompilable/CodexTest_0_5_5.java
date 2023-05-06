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
    public void testGetAsInstance() {
        Instances model = new Instances(new DummyInstances());
        Random random = new Random(1);
        AlgVector v = new AlgVector(new double[]{1.0, 2.0});
        Instance result = v.getAsInstance(model, random);
        assertEquals("Wrong class value", 0.0, result.classValue(), EPSILON);
        assertEquals("Wrong number of attributes", 3, result.numAttributes());
        assertEquals("Wrong number of values", 3, result.numValues());
        assertEquals("Wrong value at position 0", 1.0, result.value(0), EPSILON);
        assertEquals("Wrong value at position 1", 2.0, result.value(1), EPSILON);
        assertEquals("Wrong value at position 2", 0.0, result.value(2), EPSILON);
    }
}