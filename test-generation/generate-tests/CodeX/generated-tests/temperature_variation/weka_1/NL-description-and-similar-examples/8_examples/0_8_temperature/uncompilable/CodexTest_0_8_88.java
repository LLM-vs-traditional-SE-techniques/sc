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


public class CodexTest_0_8_88 { 
  @Test
    public void testAdd_shouldAddVectors() {
			// given
			double[] data = { 2.5, 2.5 };
			AlgVector v1 = new AlgVector(data);
			AlgVector v2 = new AlgVector(data);
			// when
			AlgVector v3 = v1.add(v2);
			// then
			assertEquals(5.0, v3.getElement(0), DELTA);
			assertEquals(5.0, v3.getElement(1), DELTA);
		}
}