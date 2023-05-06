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


public class CodexTest_0_4_83 { 
  @Test
  public void testGetAsInstance() {
    int numInstances = 10;
    int numAttributes = 5;
    Instances data = new Instances(new FastVector(), new FastVector());
    for (int i = 0; i < numAttributes; i++) {
      data.insertAttributeAt(new Attribute("A" + (i + 1)), i);
    }
    data.insertAttributeAt(new Attribute("Class"), numAttributes);
    data.setClassIndex(numAttributes);
    for (int i = 0; i < numInstances; i++) {
      Instance inst = new DenseInstance(data.numAttributes());
      for (int j = 0; j < numAttributes; j++) {
	inst.setValue(j, j);
      }
      inst.setValue(numAttributes, i % 2);
      data.add(inst);
    }
    AlgVector v = new AlgVector(numAttributes);
    for (int i = 0; i < numAttributes; i++) {
      v.setElement(i, i);
    }
    try {
      Instance inst = v.getAsInstance(data, new Random(1));
      for (int i = 0; i < numAttributes; i++) {
	assertEquals("Attribute " + i + " differs", 
		     inst.value(i), v.getElement(i));
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}