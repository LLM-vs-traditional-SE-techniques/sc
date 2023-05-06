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


public class CodexTest_0_8_10 { 
    @Test
	public void testAdd() {
		double[] data1 = { 1, 2, 3 };
		double[] data2 = { 4, 5, 6 };
		AlgVector v1 = new AlgVector(data1);
		AlgVector v2 = new AlgVector(data2);
		AlgVector v3 = v1.add(v2);
		double[] expected = { data1[0] + data2[0], data1[1] + data2[1],
				data1[2] + data2[2] };
		assertArrayEquals(expected, v3.getElements(), 10e-10);
	}
}