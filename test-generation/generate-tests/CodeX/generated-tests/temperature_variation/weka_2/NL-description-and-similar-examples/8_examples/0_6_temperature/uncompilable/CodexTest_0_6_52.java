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


public class CodexTest_0_6_52 { 
  @Test
    public void testGetAsInstance() throws Exception {
        // create a new instance
        Instances data = makeTestDataset(1);
        assertEquals(2, data.numAttributes());
        assertEquals(1, data.numInstances());
        Instance inst = new DenseInstance(2);
        inst.setDataset(data);
        
        // set a value on the first attributes
        inst.setValue(1, "value");
        
        // create a new vector using the instance
        AlgVector vector = new AlgVector(inst);
        assertEquals(2, vector.numElements());
        
        // convert the vector back to an instance
        Instance newInst = vector.getAsInstance(data, new Random(1));
        assertEquals(2, newInst.numAttributes());
        assertEquals("value", newInst.stringValue(0));
        assertEquals("value", newInst.stringValue(1));
    }
}