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


public class CodexTest_0_4_4 { 
  @Test
  public void testGetAsInstance() {
    int numAtt = 3;
    int numInst = 10;
    int numClasses = 3;
    Instances model = new Instances("Test", 
				    new FastVector(numAtt), numInst);
    for (int i = 0; i < numAtt; i++) {
      if (i == numAtt - 1) {
	model.insertAttributeAt(new Attribute("Att" + i, numClasses), i);
      } else {
	model.insertAttributeAt(new Attribute("Att" + i), i);
      }
    }
    model.insertAttributeAt(new Attribute("Class", numClasses), numAtt);
    model.setClassIndex(numAtt);
    double[] values = new double[numAtt];
    for (int i = 0; i < numInst; i++) {
      for (int j = 0; j < numAtt; j++) {
	values[j] = i + j;
      }
      model.add(new DenseInstance(1.0, values));
    }
    AlgVector v = new AlgVector(values);
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Number of attributes differ", numAtt, inst.numAttributes());
      for (int i = 0; i < numAtt; i++) {
	if (i == numAtt - 1) {
	  assertEquals("Value differs", (int) inst.value(i), 1);
	} else {
	  assertEquals("Value differs", inst.value(i), i + i);
	}
      }
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
}