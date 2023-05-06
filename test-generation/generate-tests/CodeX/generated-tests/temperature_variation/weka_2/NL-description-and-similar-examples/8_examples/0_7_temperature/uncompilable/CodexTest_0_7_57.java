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


public class CodexTest_0_7_57 { 
  @Test
   public void testgetAsInstance() {
		try {
			double[] data = { 2.3, 1.2, 5.0 };
			AlgVector v = new AlgVector(data);
			Random random = new Random(1);
			Instances insts = new Instances(new BufferedReader(new StringReader(instances)));
			insts.setClassIndex(insts.numAttributes() - 1);
			Instance i = v.getAsInstance(insts, random);
			assertEquals("Number of attributes differ", insts.numAttributes(),
					i.numAttributes());
			assertEquals("First value differs", data[0], i.value(0), 1E-15);
			assertEquals("Second value differs", data[1], i.value(1), 1E-15);
			assertEquals("3rd value differs", data[2], i.value(2), 1E-15);
			assertEquals("4th value differs", 0, i.value(3), 1E-15);
			assertEquals("5th value differs", 1, i.value(4), 1E-15);
			assertEquals("6th value differs", 1, i.value(5), 1E-15);
			assertEquals("7th value differs", 1, i.value(6), 1E-15);
			assertEquals("8th value differs", 1, i.value(7), 1E-15);
			assertEquals("9th value differs", 1, i.value(8), 1E-15);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Exception occured: " + e.getMessage());
		}
	}
}