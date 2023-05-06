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


public class CodexTest_0_7_28 { 
    @Test
    public void testGetAsInstance() throws Exception {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			double[] expected = {2.3, 1.2, 5.0};
			double[] actual = new double[v.numElements()];
			for (int i = 0; i < v.numElements(); i++) {
			  actual[i] = v.getElement(i);
			}
			assertArrayEquals(expected, actual, 0);
		  }
}