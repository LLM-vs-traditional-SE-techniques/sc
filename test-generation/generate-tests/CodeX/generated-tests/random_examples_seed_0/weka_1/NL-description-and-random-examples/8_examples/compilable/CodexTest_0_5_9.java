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


public class CodexTest_0_5_9 { 
  @Test
  public void testAdd() {
		AlgVector a = new AlgVector(new double[] { 1, 2 });
		AlgVector b = new AlgVector(new double[] { 3, 4 });
		AlgVector c = a.add(b);
		assertEquals(4, c.getElement(0), 0);
		assertEquals(6, c.getElement(1), 0);
	}

}