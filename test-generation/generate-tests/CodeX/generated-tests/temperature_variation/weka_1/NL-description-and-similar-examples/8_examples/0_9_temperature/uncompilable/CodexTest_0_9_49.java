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


public class CodexTest_0_9_49 { 
  @Test(expected = ArithmeticException.class)
	public void fatal_error_if_vector_length_is_0() {
		AlgVector a = new AlgVector();
		AlgVector b = new AlgVector(new double[] {1,2,3});
		AlgVector c = a.add(b);
	}
}