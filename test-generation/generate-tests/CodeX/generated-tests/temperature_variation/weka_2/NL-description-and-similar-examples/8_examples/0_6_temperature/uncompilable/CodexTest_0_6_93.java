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


public class CodexTest_0_6_93 { 
  @Test
  public void testGetAsInstance() throws Exception {
				int numAttributes = 4;
				int numInstances = 3;
				int numValues = 2;
				Instances model = new Instances("Test", new ArrayList(), numAttributes);
				model.insertAttributeAt(new Attribute("att1"), 0);
				model.insertAttributeAt(new Attribute("att2"), 1);
				model.insertAttributeAt(new Attribute("att3", numValues), 2);
				model.insertAttributeAt(new Attribute("att4", numValues), 3);
				model.setClassIndex(0);
				Random random = new Random(0);
				for (int i = 0; i < numInstances; i++) {
					model.add(new DenseInstance(numAttributes));
				}
				double[] elements = new double[numAttributes - 1];
				for (int i = 0; i < elements.length; i++) {
					elements[i] = random.nextDouble();
				}
				AlgVector algVector = new AlgVector(elements);
				Instance instance = algVector.getAsInstance(model, random);
				assertEquals(numAttributes, instance.numAttributes());
				assertEquals(numValues, instance.attribute(2).numValues());
				assertEquals(numValues, instance.attribute(3).numValues());
				assertEquals(elements[0], instance.value(1), 0);
				assertEquals(elements[1], instance.value(2), 0);
			}

}