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


public class CodexTest_0_8_87 { 
    @Test
	public void testAddMethod() throws Exception {
		AlgVector v1 = new AlgVector(new double[] {2, 3});
		AlgVector v2 = new AlgVector(new double[] {1, -2});
		AlgVector v3 = v1.add(v2);
		assertEquals("Wrong X component in result.", 3., v3.getElement(0), 0.0);
		assertEquals("Wrong Y component in result.", 1., v3.getElement(1), 0.0);
	}
}