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


public class CodexTest_0_5_51 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instances dataset = getRandomDataset(3);
        AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
        Instance inst = v.getAsInstance(dataset, new Random(1));
        assertNotNull(inst);
        assertEquals("Num attributes differ", dataset.numAttributes(), inst.numAttributes());
        assertEquals("Num values differ", dataset.numAttributes(), inst.numValues());
        assertEquals("Dataset differs", dataset, inst.dataset());
        assertEquals("Value differs", 1.0, inst.value(0), 1e-6);
        assertEquals("Value differs", 2.0, inst.value(1), 1e-6);
        assertEquals("Value differs", 3.0, inst.value(2), 1e-6);
    }
}