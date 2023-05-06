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


public class CodexTest_0_6_2 { 
  @Test
    public void testAdd() {
		AlgVector v1 = new AlgVector(new double[] { 1, 2 });
		AlgVector v2 = new AlgVector(new double[] { 1, 2 });
		AlgVector v3 = v1.add(v2);
		assertEquals(2.0, v3.getElement(0), 1.0e-12);
		assertEquals(4.0, v3.getElement(1), 1.0e-12);
	}
}