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


public class CodexTest_0_4_74 { 
  @Test
    public void testGetAsInstance() {
			AlgVector v = new AlgVector(new double[] {2.0, 3.0, 4.0});
			try {
				v.getAsInstance(null, null);
				fail("Should have thrown an exception");
			} catch (Exception e) {
				// expected
			}
		}
}