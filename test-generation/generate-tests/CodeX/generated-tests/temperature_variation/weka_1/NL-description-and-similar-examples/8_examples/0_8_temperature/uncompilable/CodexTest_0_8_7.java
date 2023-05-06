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


public class CodexTest_0_8_7 { 
  @Test
  public void testAdd() throws Exception {
		double[] d0 = {2.3, 1.2, 5.0};
		double[] d1 = {0.2, 3.2, -5.5};
		double[] d2 = {2.5, 4.4, -0.5};
		AlgVector v0 = createAlgVector(d0);
		AlgVector v1 = createAlgVector(d1);
		AlgVector v2 = v0.add(v1);
		assertTrue(Arrays.equals(d2, v2.getArray()));
	  }
}