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


public class CodexTest_0_7_18 { 
  @Test
  public void testGetAsInstance() throws Exception {
			// generate input
			double[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			AlgVector v = new AlgVector(arr);
			String[] attNames = {"c0", "c1", "c2", "c3", "c4"};
			String[] attVals = {"a", "b"};
			FastVector attributes = new FastVector(5);
			for (int i = 0; i < 5; i++)
				attributes.addElement(new Attribute(attNames[i], attVals));
			Instances dataset = new Instances("TestSet", attributes, 0);
			Random rand = new Random(1);
			Instance inst = v.getAsInstance(dataset, rand);
			// check result
			assertEquals(5, inst.numAttributes());
			assertEquals(0, inst.value(0), 0.01);
			assertEquals(1, inst.value(1), 0.01);
			assertEquals(2, inst.value(2), 0.01);
			assertEquals(3, inst.value(3), 0.01);
			assertEquals(1, inst.value(4), 0.01);
		}
}