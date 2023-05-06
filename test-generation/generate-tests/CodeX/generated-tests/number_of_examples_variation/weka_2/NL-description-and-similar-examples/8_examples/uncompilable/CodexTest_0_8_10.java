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
    public void testGetAsInstance() throws Exception {
		int missingVals = 0;
		for (int i = 0; i < numAttributes(); i++) {
			if (!attribute(i).isNumeric() && attribute(i).isNominal()) {
				missingVals++;
			}
		}
		DenseInstance vect = new DenseInstance(numAttributes());
		vect.setDataset(this);
		vect.randomize(new Random(1));
		Instance inst = vect.getAsInstance(this, new Random(1));
		assertEquals(numAttributes(), inst.numAttributes());
		assertEquals(numClasses(), inst.numClasses());
		assertTrue(inst.equalHeaders(this));
		for (int i = 0; i < numAttributes(); i++) {
			if (attribute(i).isNumeric()) {
				assertEquals("Attribute " + i + " differs", vect.value(i), inst.value(i), Utils.SMALL);
			} else if (attribute(i).isNominal()) {
				assertTrue("Attribute " + i + " differs", vect.value(i) != (numValues(i) - 1));
			}
		}
	}
}