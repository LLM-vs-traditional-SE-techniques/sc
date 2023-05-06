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


public class CodexTest_0_3_8 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 5;
    int numInstances = 10;
    int numNumeric = 3;
    int numNominal = 2;
    int numValues = 3;
    int numClasses = 2;
    int classIndex = numAttributes - 1;
    int numInstancesPerClass = numInstances / numClasses;
    Random random = new Random(1);
    Instances model = new Instances("Test", 
				    new ArrayList<Attribute>(), 
				    numInstances);
    for (int i = 0; i < numAttributes; i++) {
      if (i < numNumeric)
	model.insertAttributeAt(new Attribute("Numeric" + (i+1)), i);
      else if (i < numNumeric + numNominal)
	model.insertAttributeAt(new Attribute("Nominal" + (i+1), numValues), i);
      else
	model.insertAttributeAt(new Attribute("Class", numClasses), i);
    }
    model.setClassIndex(classIndex);
    double[] values = new double[numNumeric];
    for (int i = 0; i < numInstances; i++) {
      for (int j = 0; j < numNumeric; j++)
	values[j] = random.nextDouble();
      Instance inst = new DenseInstance(1.0, values);
      inst.setDataset(model);
      inst.setClassValue(i % numClasses);
      model.add(inst);
    }
    AlgVector v = new AlgVector(values);
    Instance inst = v.getAsInstance(model, random);
    assertEquals("Number of attributes differs", numAttributes, 
		 inst.numAttributes());
    for (int i = 0; i < numNumeric; i++)
      assertEquals("Numeric attribute differs", values[i], 
		   inst.value(i), 1e-6);
    for (int i = numNumeric; i < numNumeric + numN
}