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


public class CodexTest_0_3_76 { 
  @Test
    public void testGetAsInstance() {
    int numInstances = 10;
    int numAttributes = 10;
    int numNominal = 5;
    int numNumeric = 5;
    int numClasses = 5;
    int numValues = 5;
    Random random = new Random(1);
    Instances data = new Instances(new FastVector(), 0);
    for (int i = 0; i < numAttributes; i++) {
      if (i < numNominal) {
	data.insertAttributeAt(new Attribute(Att + i, numValues), i);
      } else {
	data.insertAttributeAt(new Attribute(Att + i), i);
      }
    }
    data.insertAttributeAt(new Attribute(Class, numClasses), 
			   data.numAttributes());
    data.setClassIndex(data.numAttributes() - 1);
    for (int i = 0; i < numInstances; i++) {
      Instance inst = new DenseInstance(data.numAttributes());
      inst.setDataset(data);
      for (int j = 0; j < numAttributes; j++) {
	if (j < numNominal) {
	  inst.setValue(j, (int) (random.nextDouble() * (double) numValues));
	} else {
	  inst.setValue(j, random.nextDouble());
	}
      }
      inst.setClassValue((int) (random.nextDouble() * (double) numClasses));
      data.add(inst);
    }
    AlgVector v = new AlgVector(numNumeric);
    for (int i = 0; i < numNumeric; i++) {
      v.setElement(i, random.nextDouble());
    }
    try {
      Instance inst = v.getAsInstance(data, random);
      assertEquals(inst.numAttributes(), data.numAttributes());
      assertEquals(inst.numClasses(), data.numClasses());
      for (int i = 0; i < numNominal; i++) {

}