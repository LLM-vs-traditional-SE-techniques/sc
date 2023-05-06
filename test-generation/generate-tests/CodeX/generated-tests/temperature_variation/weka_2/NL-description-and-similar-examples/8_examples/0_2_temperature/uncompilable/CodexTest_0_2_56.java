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


public class CodexTest_0_2_56 { 
  @Test
  public void testGetAsInstance() {
    int numInstances = 10;
    int numAttributes = 5;
    int numNominal = 2;
    int numNumeric = 3;
    int numClasses = 2;
    int numValues = 5;
    Random random = new Random(1);
    Instances data = new Instances(new BufferedReader(new StringReader(
								       InstancesTest.instancesToArff(new Instances(new BufferedReader(new StringReader(InstancesTest.arffHeader + InstancesTest.arffDataLine)))))), 0);
    data.setClassIndex(data.numAttributes() - 1);
    AlgVector v = new AlgVector(numInstances);
    for (int i = 0; i < numInstances; i++) {
      Instance inst = new DenseInstance(numAttributes);
      inst.setDataset(data);
      for (int n = 0; n < numNominal; n++) {
	inst.setValue(n, random.nextInt(numValues));
      }
      for (int n = numNominal; n < numNominal + numNumeric; n++) {
	inst.setValue(n, random.nextDouble());
      }
      inst.setClassValue(random.nextInt(numClasses));
      v.addElement(inst);
    }
    Instances model = new Instances(data, 0);
    Instance newInst = v.getAsInstance(model, random);
    assertEquals("Number of attributes differ", model.numAttributes(), 
		 newInst.numAttributes());
    for (int i = 0; i < model.numAttributes(); i++) {
      if (model.attribute(i).isNominal()) {
	assertEquals("Nominal value differs", model.attribute(i).numValues(), 
		     newInst.attribute(i).numValues());
      }
      if (model.attribute(i).isNumeric()) {
	assertTrue("Numeric value differs", 
		   newInst.value(i) >=
}