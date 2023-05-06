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


public class CodexTest_0_3_5 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 5;
    int numClasses = 2;
    Random random = new Random(1);
    Instances data = new Instances(new FastVector(), 0);
    for (int i = 0; i < numAttributes; i++) {
      if (i < numAttributes - 1) {
	data.insertAttributeAt(new Attribute("Nominal " + (i+1)), i);
      } else {
	data.insertAttributeAt(new Attribute("Numeric " + (i+1)), i);
      }
    }
    data.insertAttributeAt(new Attribute("Class", numClasses), 
			   numAttributes);
    data.setClassIndex(numAttributes);
    for (int i = 0; i < numInstances; i++) {
      data.add(new DenseInstance(numAttributes + 1));
    }
    AlgVector v = new AlgVector(numAttributes);
    for (int i = 0; i < numInstances; i++) {
      Instance inst = v.getAsInstance(data, random);
      assertEquals("Number of attributes differ", numAttributes + 1, 
		   inst.numAttributes());
      for (int j = 0; j < numAttributes; j++) {
	if (j < numAttributes - 1) {
	  assertTrue("Value is not nominal", inst.isMissing(j));
	} else {
	  assertTrue("Value is not numeric", !inst.isMissing(j));
	}
      }
    }
  }
}