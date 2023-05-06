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


public class CodexTest_0_8_41 { 
    @Test
    public void testGenerateRandomIncompatible() throws Exception {
        AlgVector v = new AlgVector(new double[] {1.2, 3.4, 5.6});
        Instances instances = getThreeClassInstances();
        
        try {
            Instance i = v.getAsInstance(instances, new Random(42));
            fail("Exception expected - incompatible datatypes");
        } catch (Exception ex) {
            // expected
        }
    }
	
Input: public static int hashCode(long l) {
	return (int)(l ^ (l >>> 32));
}
Output: public void testHashCode() {
		assertEquals(964221, HashCodes.hashCode(42L));
	}
}