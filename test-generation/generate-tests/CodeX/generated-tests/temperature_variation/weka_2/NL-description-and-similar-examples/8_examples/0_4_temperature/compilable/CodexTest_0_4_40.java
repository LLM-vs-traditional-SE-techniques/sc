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


public class CodexTest_0_4_40 { 
  @Test
	public void testGetAsInstance() {
		AlgVector v = new AlgVector(new double[] { 1.0, 2.0 });
		try {
			Instance inst = v.getAsInstance(null, null);
			assertNull(inst);
		} catch (Exception e) {
			fail("Exception should not be thrown");
		}
	}
}