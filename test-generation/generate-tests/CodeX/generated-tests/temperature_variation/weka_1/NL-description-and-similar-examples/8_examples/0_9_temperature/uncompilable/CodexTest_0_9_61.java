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


public class CodexTest_0_9_61 { 
  @Test
    public void testAdd5() {
		AlgVector v1 = AlgVector.random();
		AlgVector v2 = AlgVector.random();
		AlgVector v3 = v1.add(v2);
		double w1 = Math.random();
		double w2 = Math.random();
		for (int i = 0; i < v1.numElements(); i++) {
			double x = w1 * v1.getElement(i) + w2 * v2.getElement(i);
			assertTrue("Value differs", DoubleMath.fuzzyEquals(x, v3.getElement(i), 0.0001));
		}
	}
}