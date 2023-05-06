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


public class CodexTest_0_7_83 { 
  @Test
    public void testAdd() {
		AlgVector A = new AlgVector(new double[] { 1, 2, 3, 4 });
		AlgVector B = new AlgVector(new double[] { 6, 5, 4, 3 });
		AlgVector C = new AlgVector(new double[] { 7, 7, 7, 7 });
		AlgVector D = A.add(B);
		assertTrue(D.equals(C));
	}
}