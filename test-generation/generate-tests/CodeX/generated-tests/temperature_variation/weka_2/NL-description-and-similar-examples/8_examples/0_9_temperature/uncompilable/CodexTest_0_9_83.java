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


public class CodexTest_0_9_83 { 
  @Test
    public void testGetAsInstance_wekaNumeric () throws Exception {
        AlgVector v = new AlgVector(new double[] {1, 2});
        assertEquals("elements", 1, v.getElement(0), 1e-15);
        assertEquals("elements", 2, v.getElement(1), 1e-15);
        Instances test = new Instances(new BufferedReader(new StringReader(InstancesTest.DATATYPE_HEADER + InstancesTest.DATATYPE_DATA_NOMINAL_INTEGER)));
        Instance asInstance = v.getAsInstance(test, null);
        assertEquals("values", 1.0, asInstance.value(0), 1e-15);
        assertEquals("values", 1.111111143, asInstance.value(1), 1e-15);
        assertEquals("values", 2.0, asInstance.value(2), 1e-15);
        assertEquals("values", 4.0, asInstance.value(3), 1e-15);
        assertEquals("values", 2, asInstance.value(4), 1e-15);
        assertEquals("values", 0, asInstance.value(5), 1e-15);
    }
}