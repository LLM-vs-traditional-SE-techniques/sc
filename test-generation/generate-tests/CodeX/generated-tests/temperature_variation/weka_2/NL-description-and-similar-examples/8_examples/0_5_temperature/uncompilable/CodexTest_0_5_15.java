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


public class CodexTest_0_5_15 { 
  @Test
    public void testGetAsInstance() {
        Instances result = null;
        try {
            result = (new AlgVector(new double[]{3.0, 4.0, 5.0})).getAsInstance(null, new Random(1));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        assertNotNull(result);
        assertEquals(3, result.numAttributes());
        assertEquals(3.0, result.instance(0).value(0), EPSILON);
        assertEquals(4.0, result.instance(0).value(1), EPSILON);
        assertEquals(5.0, result.instance(0).value(2), EPSILON);
    }
}