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


public class CodexTest_0_7_3 { 
    @Test
	public void testGetAsInstanceNominal() throws Exception {
		Random random = new Random(0L);
		Instances dataset = InstancesTest.createRandomDataset(1, 0, 1, -1);
		dataset.setClassIndex(0);
		
		double[] values = new double[]{0.0, 1.0, 2.0};
		
		Instance instance = new DenseInstance(3);
		instance.setDataset(dataset);
		instance.setValue(0, 0.0);
		instance.setValue(1, 1.0);
		instance.setValue(2, 2.0);
		
		Vector vector = new Vector(values);
		Instance newInstance = vector.getAsInstance(dataset, random);
		assertEquals("Number of attributes differ", instance.numAttributes(), newInstance.numAttributes());
		assertEquals("Number of classes differ", instance.numClasses(), newInstance.numClasses());
		assertEquals("Dataset differ", instance.dataset(), newInstance.dataset());
		assertEquals("Values differ", instance.toString(), newInstance.toString());
	}
}