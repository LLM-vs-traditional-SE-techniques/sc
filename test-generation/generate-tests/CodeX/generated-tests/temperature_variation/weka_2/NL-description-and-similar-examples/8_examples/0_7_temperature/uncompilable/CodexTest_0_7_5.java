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


public class CodexTest_0_7_5 { 
  @Test
    public void testInstanceCreator() {
    	Instances model = new Instances(new ArrayList<Attribute>(), 10);
    	AlgVector v = new AlgVector(new double[]{1, 2, 3});
    	try {
    		Instance instance = v.getAsInstance(model, new Random());
    		assertEquals("Length differs", v.numElements(), instance.numAttributes());
    	} catch (Exception e) {
    		fail("Exception thrown: " + e.getMessage());
    	}
    }
}