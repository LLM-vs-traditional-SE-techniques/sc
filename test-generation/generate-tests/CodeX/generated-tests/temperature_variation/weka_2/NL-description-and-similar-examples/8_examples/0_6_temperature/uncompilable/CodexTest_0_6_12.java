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


public class CodexTest_0_6_12 { 
  @Test
    public void testGetAsInstance() {
		int numAttributes = 11;
		int numElements = 6;
		Instances model = new Instances("test", new ArrayList(numAttributes),
				numElements);
		for (int i = 0; i < numAttributes; i++) {
			if (i % 2 == 0) {
				model.insertAttributeAt(new Attribute("A" + i), i);
			} else {
				model.insertAttributeAt(new Attribute("A" + i, (java.util.List) null), i);
			}
		}
		model.insertAttributeAt(new Attribute("class", (java.util.List) null), numAttributes);
		model.setClassIndex(numAttributes);
		double[] data = { 3, 2, 4, 6, 1, 3 };
		AlgVector v = new AlgVector(data);
		try {
			Instance i = v.getAsInstance(model, new Random());
			assertEquals(numAttributes, i.numAttributes());
			assertEquals(numElements, i.numValues());
			assertEquals(data[0], i.value(0), 0.000001);
			assertEquals(data[1], i.value(2), 0.000001);
			assertEquals(data[2], i.value(4), 0.000001);
			assertEquals(data[3], i.value(6), 0.000001);
			assertEquals(data[4], i.value(8), 0.000001);
			assertEquals(data[5], i.value(10), 0.000001);
		} catch (Exception ex) {
			fail();
		}
	}
}