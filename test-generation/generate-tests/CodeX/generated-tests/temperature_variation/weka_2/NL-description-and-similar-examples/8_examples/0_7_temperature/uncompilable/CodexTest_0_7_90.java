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


public class CodexTest_0_7_90 { 
  @Test
    public void testGetAsInstance1() {
        AlgVector vec = new AlgVector(numElements);
        Instances model = null;
        Random random = null;
        try {
            vec.getAsInstance(model, random);
            fail("Expected Exception");
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "Datatypes are not compatible.");
        }
    }
}