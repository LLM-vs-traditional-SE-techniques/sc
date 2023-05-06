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


public class CodexTest_0_8_6 { 
  @Test
  public void testClone() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v1 = new AlgVector(data);
			AlgVector v2 = new AlgVector(data);
			AlgVector v3 = v1.add(v2);
			assertNotSame("Add returns identical object", v1, v3);
			assertEquals("Wrong length", v1.numElements(), v3.numElements());
			for (int i = 0; i < data.length; i++) {
			  assertEquals("Wrong element " + i, v3.getElement(i),
				       2.0 * v1.getElement(i));
			}
		  }
}