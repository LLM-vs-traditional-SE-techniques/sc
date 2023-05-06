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


public class CodexTest_0_8_33 { 
  @Test
    public void testEquals() {
		int len = 22;
		AlgVector v1 = new AlgVector(len);
		v1.setElement(0, 2);
		v1.setElement(1, 3);
		AlgVector v2 = new AlgVector(len);
		v2.setElement(0, 2);
		v2.setElement(1, 4);
		AlgVector v3 = new AlgVector(len);
		v3.setElement(0, 2);
		v3.setElement(1, 3);
		
		assertTrue(v1.equals(v1));
		assertFalse(v1.equals(v2));
		assertFalse(v1.equals(v3));
		assertTrue(v1.equals(v3));
	}
}