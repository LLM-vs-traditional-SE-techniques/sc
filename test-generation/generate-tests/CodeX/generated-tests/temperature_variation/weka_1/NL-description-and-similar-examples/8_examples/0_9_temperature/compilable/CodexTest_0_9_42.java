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


public class CodexTest_0_9_42 { 
  @Test
     public void testEqualsOtherMethod() {
		AlgVector v1 = new AlgVector(6);
		v1.setElement(1, -0.3869);
		v1.setElement(2, 0.7984);
		v1.setElement(3, 0.5503);
		v1.setElement(4, -0.7747);
		v1.setElement(5, -0.2703);
		v1.setElement(0, -0.2539);
		AlgVector v2 = new AlgVector(6);
		v2.setElement(1, -0.3869);
		v2.setElement(2, 0.7984);
		v2.setElement(3, 0.5503);
		v2.setElement(4, -0.7747);
		v2.setElement(5, -0.2703);
		v2.setElement(0, -0.2539);
		AlgVector result = v1.add(v2);
		assertEquals(result, v1.add(v2));
		assertEquals(result.equals(v2.add(v1)), result.equals(v2.add(v1)));
		assertEquals(v1.add(v2), v1.add(v2));
	}
}