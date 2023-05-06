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


public class CodexTest_0_6_16 { 
  @Test
	public void testGetAsInstance() {
		AlgVector v = new AlgVector(new double[] { 1, 2, 3 });
		assertEquals(3, v.numElements());
		assertEquals(1.0, v.getElement(0), 1.0E-14);
		assertEquals(2.0, v.getElement(1), 1.0E-14);
		assertEquals(3.0, v.getElement(2), 1.0E-14);
	}
}