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


public class CodexTest_0_7_33 { 
    @Test
    public void testGetAsInstance() {
        try {
            AlgVector v = new AlgVector(new double[]{0.5, 0.5});
            v.getAsInstance(new Instances(new StringReader(VECTOR_TEST_ARFF)),
                    new Random());
        } catch (Exception e) {
            fail("Exception thrown " + e.getMessage());
        }
    }
}