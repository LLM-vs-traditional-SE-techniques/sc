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


public class CodexTest_0_8_30 { 
    @Test
	public void testGetAsInstance() {
		Random random = mock(Random.class);
		Instances model = mock(Instances.class);
		when(model.numAttributes()).thenReturn(5);
		when(model.attribute(0)).thenReturn(new Attribute("NominalAttribute"));
		when(model.attribute(1)).thenReturn(new Attribute("NominalAttribute"));
		when(model.attribute(2)).thenReturn(new Attribute("NominalAttribute"));
		when(model.attribute(3)).thenReturn(new Attribute("NominalAttribute"));
		when(model.attribute(4)).thenReturn(new Attribute("NominalAttribute"));
		double[] elements = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
		AlgVector vector = new AlgVector(elements);
		Instance expectedInstance, actualInstance;
		when(random.nextDouble()).thenReturn(0.5);
		expectedInstance = new DenseInstance(5, elements);
		try {
			actualInstance = vector.getAsInstance(model, random);
		} catch (Exception e) {
			Assert.fail("Unexpected exception: " + e.getMessage());
		}
		assertEquals("The value of the created Instance is not expected.", expectedInstance, actualInstance);
	}
}