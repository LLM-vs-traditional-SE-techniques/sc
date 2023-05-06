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


public class CodexTest_0_7_1 { 
    @Test
	public void testAdd() {
		AlgVector v1 = new AlgVector(new double[]{1, 2, 3, 4});
		AlgVector v2 = new AlgVector(new double[]{10, 20, 30, 40});
		AlgVector v3 = v1.add(v2);
		AlgVector v4 = new AlgVector(new double[]{11, 22, 33, 44});
		assertEquals(v3, v4);
	}
}