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


public class CodexTest_0_8_94 { 
    @Test
	public void testGetAsInstance() {
		double[] a1 = { 1, 2, 3 };
		double[] a2 = { 4, 5, 6 };
		double[] a3 = { 7, 8, 9 };
		AlgVector v1 = new AlgVector(a1);
		AlgVector v2 = new AlgVector(a2);
		AlgVector v3 = new AlgVector(a3);
		AlgVector[] vals = { v1, v2, v3 };
		AlgMatrix matrix = new AlgMatrix(vals);
		CustomInstanceGenerator generator = new CustomInstanceGenerator(matrix);
		Instances structure = generator.getStructure();
		try {
			structure.randomize(new Random(3));
		} catch (Exception e) {
		}
}