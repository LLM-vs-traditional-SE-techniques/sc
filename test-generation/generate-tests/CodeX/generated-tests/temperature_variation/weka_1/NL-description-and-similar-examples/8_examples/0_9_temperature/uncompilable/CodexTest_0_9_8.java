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


public class CodexTest_0_9_8 { 
     @Test(expected = AlgorithmRuntimeException.class)
	@SuppressWarnings("all")
	public void testAddWithNullShouldThrowExp() {
		AlgVector v = new AlgVector(2);
		AlgVector v1 = v;
		v.add(null);
		fail();
	}
}