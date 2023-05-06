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


public class CodexTest_0_6_34 { 
    @Test
    public void testAdd() {
		AlgVector a = new AlgVector(new double[]{1, 2, 3});
		AlgVector b = new AlgVector(new double[]{2, 1, 0});
		AlgVector c = a.add(b);
		assertEquals("Length differs", 3, c.numElements());
		assertEquals("1. value differs", 3, c.getElement(0), 1e-6);
		assertEquals("2. value differs", 3, c.getElement(1), 1e-6);
		assertEquals("3. value differs", 3, c.getElement(2), 1e-6);
	}
}