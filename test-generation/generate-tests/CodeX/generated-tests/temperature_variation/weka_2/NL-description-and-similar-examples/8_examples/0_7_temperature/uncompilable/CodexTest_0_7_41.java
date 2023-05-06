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


public class CodexTest_0_7_41 { 
  @Test
  public void testGetAsInstance() {
		Instances data = DatasetLoader.loadCars();
		Random random = new Random();
		try {
			// first try with all numeric attributes
			AlgVector vector = new AlgVector(data.numAttributes());
			// create instance to access values
			Instance inst = new DenseInstance(data.numAttributes());
			inst.setDataset(data);
			// fill vector with values
			for (int i = 0; i < inst.numAttributes(); i++) {
				vector.setElement(i, inst.value(i));
			}
			// get instance from vector
			Instance instFromVector = vector.getAsInstance(data, random);
			// compare both instances
			for (int i = 0; i < inst.numAttributes(); i++) {
				assertEquals("Value differs", inst.value(i), instFromVector.value(i));
			}
		} catch (Exception e) {
			fail("Exception thrown: " + e.getMessage());
		}
	}
}