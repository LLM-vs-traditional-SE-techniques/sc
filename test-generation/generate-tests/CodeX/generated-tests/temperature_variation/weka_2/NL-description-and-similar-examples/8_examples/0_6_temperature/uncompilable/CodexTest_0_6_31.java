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


public class CodexTest_0_6_31 { 
  @Test
  public void testGetAsInstance() {
    int numAtt = 10;
    int numInst = 100;
    Instances dataset = null;
    int i, j;
    double [] vec;
    Instance inst;
    double diff;
    dataset = new Instances(new BufferedReader(new StringReader(data)));
    // test the set values
    vec = new double [numAtt];
    for (j = 0; j < numAtt; j++) {
      vec[j] = Math.random();
    }
    AlgVector algVec = new AlgVector(vec);
    AlgVector algVec2 = new AlgVector();
    inst = algVec.getAsInstance(dataset, new Random(1));
    try {
      algVec2.setAsInstance(inst);
    } catch (Exception ex) {
      fail("Exception thrown when setting instance values.");
    }
    for (j = 0; j < numAtt; j++) {
      diff = Math.abs(algVec.getElement(j) - algVec2.getElement(j));
      assertTrue("Attribute values differ after setAsInstance/getAsInstance.",
		 diff < 1.0e-6);
    }
    // test the random values
    for (i = 0; i < numInst; i++) {
      inst = algVec.getAsInstance(dataset, new Random(i));
      for (j = 0; j < numAtt; j++) {
	if (dataset.attribute(j).isNumeric()) {
	  diff = Math.abs(inst.value(j) - algVec.getElement(j));
	  assertTrue("Attribute values differ after setAsInstance/getAsInstance.",
		     diff < 1.0e-6);
	} 
      }
    }
  }
}