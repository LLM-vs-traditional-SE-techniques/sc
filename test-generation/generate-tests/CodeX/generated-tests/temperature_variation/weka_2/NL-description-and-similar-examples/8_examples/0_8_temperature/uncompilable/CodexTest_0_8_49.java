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


public class CodexTest_0_8_49 { 
  @Test
   public void testGetAsInstanceWithDataset() {
			final Random random = new Random(12344);
			int[] values = { 1, 2, 4, 5, 7 };
			AlgVector v = new AlgVector(values);
			double[] expected = { 1, 2, 4, 5, 7, 0.0, 0.0, 0.0, 0.0, 0.0 };
			Instances data = AlgVectorTest.create10AttributeDataset();
			Instance inst = v.getAsInstance(data, random);
			assertEquals(data.numAttributes(), inst.numAttributes());
			for (int i = 0; i < data.numAttributes(); i++) {
				if (i >= values.length) {
					assertTrue(inst.attribute(i).isNumeric());
					assertEquals(expected[i], inst.value(i), 0.00001);
				} else {
					assertTrue(inst.attribute(i).isNominal());
					assertEquals(values[i], (int) inst.value(i));
				}
			}
		}
}