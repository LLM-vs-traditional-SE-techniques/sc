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


public class CodexTest_0_7_99 { 
  @Test
    public void testGetAsInstance_ZeroLengthVector() {
			// given
			double[] data = new double[0];
			AlgVector v = new AlgVector(data);
			// when
			Instance newInst = v.getAsInstance(null, null);
			// then
			assertNull(newInst);
		}
}