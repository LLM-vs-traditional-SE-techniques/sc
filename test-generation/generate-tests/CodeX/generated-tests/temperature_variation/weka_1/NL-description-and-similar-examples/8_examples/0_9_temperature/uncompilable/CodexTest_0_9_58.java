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


public class CodexTest_0_9_58 { 
  @Test(expected = MatrixAlgException.class)
	public void testAdd_failWithNonMatchingSizes() {
		// given
		AlgVector v1 = new AlgVector(new double[] { -4.3, 2.2, 0, 3.4 });
		AlgVector v2 = new AlgVector(new double[] { 0, 1.2, 5.7 });
		// when
		AlgVector v3 = v1.add(v2);
		// then
		// throws MatrixAlgException exception
	}
}