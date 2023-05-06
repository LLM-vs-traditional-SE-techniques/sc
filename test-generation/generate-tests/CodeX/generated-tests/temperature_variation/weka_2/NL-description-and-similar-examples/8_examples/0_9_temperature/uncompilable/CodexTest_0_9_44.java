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


public class CodexTest_0_9_44 { 
    @Test
    public void testGetAsInstance() {
        try {
            Instances rel1 = new Instances(relationName(), new ArrayList<Attribute>(), 0);
            MatlabAlgVector algVector1 = new MatlabAlgVector(new double[]{0.0, 1.0, 2.0});
            assertEquals(0.0, algVector1.getAsInstance(rel1, new Random(10)).value(0), 0.0);
            assertEquals(0.0, algVector1.getAsInstance(rel1, new Random(10)).value(1), 0.0);
            assertEquals(0.0, algVector1.getAsInstance(rel1, new Random(10)).value(2), 0.0);
        } catch (Exception e) {
            fail("Should not throw any exception: " + e);
        }
    }
}