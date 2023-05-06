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


public class CodexTest_0_8_48 { 
    @Test public void testVectorAdd() {
	double[] d = {1.1, 2.2, 3.3};
	AlgVector v = new AlgVector(d);
	AlgVector v2 = new AlgVector(d);
	v = v.add(v2);
	for (int i = 0; i < d.length; i++) {
	    assertEquals(d[i] + d[i], v.getElement(i), 1.0e-6);
	}
    }
}