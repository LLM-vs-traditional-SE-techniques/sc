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


public class CodexTest_0_6_40 { 
    @Test
	public void testGetAsInstance() throws Exception {
		double[] data = {2.3, 1.2, 5.0};
		AlgVector v = new AlgVector(data);
		Instances model = new Instances(new BufferedReader(
				new StringReader("@RELATION test\n" + "@ATTRIBUTE a NUMERIC\n"
						+ "@ATTRIBUTE b NUMERIC\n" + "@ATTRIBUTE c NUMERIC\n"
						+ "@DATA\n" + "1.0,1.0,1.0\n" + "2.0,2.0,2.0\n"
						+ "3.0,3.0,3.0\n" + "4.0,4.0,4.0\n"
						+ "5.0,5.0,5.0\n" + "6.0,6.0,6.0\n" + "7.0,7.0,7.0\n"
						+ "8.0,8.0,8.0\n" + "9.0,9.0,9.0\n" + "10.0,10.0,10.0\n")));
		Random r = new Random(1);
		Instance newInst = v.getAsInstance(model, r);
		assertEquals("Wrong number of attributes", 3, newInst.numAttributes());
		assertEquals("Wrong number of values", 3, newInst.numValues());
		assertEquals("Wrong number of values", 3, newInst.numValues());
		assertTrue("Not missing", newInst.isMissing(2));
		assertEquals("Wrong attribute value", 1.0, newInst.value(0), 1e-7);
		assertEquals("Wrong attribute value", 2.0, newInst.value(1), 1e-7);
		assertEquals("Wrong attribute value", 3
}