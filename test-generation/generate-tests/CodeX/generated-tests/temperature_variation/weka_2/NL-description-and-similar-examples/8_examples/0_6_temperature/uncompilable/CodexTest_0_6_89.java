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


public class CodexTest_0_6_89 { 
  @Test
    public void testGetAsInstance() {
			int numAtts = 5;
			int numElements = 2;
			Random random = new Random(1);
			Instances model = new Instances(Test, attInfo, numAtts);
			model.setClassIndex(model.numAttributes() - 1);
			double[] elements = new double[numElements];
			for (int i = 0; i < numElements; i++) {
				elements[i] = random.nextDouble();
			}
			AlgVector vector = new AlgVector(elements);
			Instance instance = vector.getAsInstance(model, random);
			assertEquals(numAtts, instance.numAttributes());
			assertEquals(numElements, vector.numElements());
			for (int i = 0; i < numElements; i++) {
				assertEquals("" + i, elements[i], instance.value(i), 0.00001);
			}
			for (int i = numElements; i < numAtts; i++) {
				assertEquals("" + i, 0, instance.value(i), 0.00001);
			}
		}
}