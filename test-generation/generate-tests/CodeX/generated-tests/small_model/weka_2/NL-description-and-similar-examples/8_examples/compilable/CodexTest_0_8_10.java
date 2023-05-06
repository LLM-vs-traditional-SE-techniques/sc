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


public class CodexTest_0_8_10 { 
    @Test(expected = Exception.class)
    public void testZeroLengthInstancesShouldThrowException() throws Exception {
        Instance newInst = null;
        try {
            newInst = new DenseInstance(0);
            assertEquals(0, newInst.numAttributes());
        } catch (Exception e) {
            assertEquals("Datatypes are not compatible.", e.getMessage());
            throw e;
        }
    }
}