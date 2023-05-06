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


public class CodexTest_0_8_57 { 
  @Test
    public void testDoubleVector() {
		double[] attrs = {0, 1, 1.5, 0.5};
		int[] index = {1, 2, 3, 4};
		double[] c = {0.5, 1.5, 0, 1};
		double[] d = {1, 0, 0.5, 1.5};
		
		DoubleVector instance = new DoubleVector(attrs, index, 4);
		
		assertEquals(c[0], instance.valueSparse(0));
		assertEquals(c[1], instance.valueSparse(1));
		assertEquals(c[2], instance.valueSparse(2));
		assertEquals(c[3], instance.valueSparse(3));
		
		assertEquals(d[0], instance.value(0));
		assertEquals(d[1], instance.value(1));
		assertEquals(d[2], instance.value(2));
		assertEquals(d[3], instance.value(3));
	}
}