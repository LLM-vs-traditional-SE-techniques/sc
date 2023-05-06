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


public class CodexTest_0_8_27 { 
  @Test
    public void testGetAsInstance() {
        Instances data = makeSimpleData();
        AlgVector v = new AlgVector(22);
		assertEquals("Dataset size differs", 22, v.numElements());
        try {
            Instance inst = v.getAsInstance(data, new Random());
            assertEquals("Instances size differs", 
								22, inst.numValues());
            for (int i = 0; i < 22; i++) {
                if (data.attribute(i).isNumeric()) {
                    assertEquals("Numeric value differs", 
									v.getElement(i), inst.value(i));
                }
                if (data.attribute(i).isNominal()) {
                    assertTrue("Nominal value differs", 
									inst.isMissing(i));
                }
            }
        } catch (Exception e) {
            assertTrue("Exception thrown: " + e.getMessage(), 
								false);
        }
    }
}