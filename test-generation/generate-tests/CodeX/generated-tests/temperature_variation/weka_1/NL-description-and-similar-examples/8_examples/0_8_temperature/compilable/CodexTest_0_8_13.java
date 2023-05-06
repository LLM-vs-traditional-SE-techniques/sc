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


public class CodexTest_0_8_13 { 
  @Test
  public void testAdd() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			AlgVector v2 = v.add(v);
			assertEquals(3, v2.numElements());
			assertEquals(2.3 + 2.3, v2.getElement(0), 0.000001);
			assertEquals(1.2 + 1.2, v2.getElement(1), 0.000001);
			assertEquals(5.0 + 5.0, v2.getElement(2), 0.000001);
			
			AlgVector v3 = v.add(v2);
			assertEquals(3, v3.numElements());
			assertEquals(2.3 + 2.3 + 2.3, v3.getElement(0), 0.000001);
			assertEquals(1.2 + 1.2 + 1.2, v3.getElement(1), 0.000001);
			assertEquals(5.0 + 5.0 + 5.0, v3.getElement(2), 0.000001);
  }
}