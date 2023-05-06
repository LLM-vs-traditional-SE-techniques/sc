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


public class CodexTest_0_7_14 { 
  @Test
  public void testGetAsInstance() {
    int numAttribs = 5;
    int numInstances = 20;
    Instances data = new Instances(this.getName(), makeAttInfo(numAttribs), numInstances);
    Instance inst;
    double[] elements = new double[numAttribs];
    for (int i = 0; i < numInstances; i++) {
      for (int j = 0; j < numAttribs; j++) {
	elements[j] = j;
      }
      AlgVector v = new AlgVector(elements);
      // test boolean
      try {
	inst = v.getAsInstance(data, new Random(1));
	assertEquals("\n" + v, inst.numAttributes(), numAttribs);
	for (int j = 0; j < numAttribs; j++) {
	  if (data.attribute(j).isNumeric()) {
	    assertEquals("\n" + v, inst.value(j), elements[j]);
	  }
	  if (data.attribute(j).isNominal()) {
	    if (j == 2) {
	      assertEquals("\n" + v, inst.value(j), 0.0);
	    } else {
	      assertEquals("\n" + v, inst.value(j), 1.0);
	    }
	  }
	}
      } catch (Exception ex) {
	ex.printStackTrace();
	fail("Exception during call to getAsInstance: " + ex.getMessage());
      }
    }
  }
}