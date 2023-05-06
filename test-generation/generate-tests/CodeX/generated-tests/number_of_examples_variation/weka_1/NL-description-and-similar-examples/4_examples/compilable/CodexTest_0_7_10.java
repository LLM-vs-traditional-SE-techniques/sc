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


public class CodexTest_0_7_10 { 
  @Test
      public void testAddMethod() {
				double[] data = {2.3, 1.2, 5.0};
				AlgVector v = new AlgVector(data);
				AlgVector v1 = new AlgVector(data);
				AlgVector res = v.add(v1);
				assertEquals(3, res.numElements());
				assertNotNull(res);
				assertEquals(4.5999999999999996,res.getElement(0), 1.0E-6);
				assertEquals(2.4, res.getElement(1), 1.0E-6);
				assertEquals(10.0, res.getElement(2), 1.0E-6);
			}

}