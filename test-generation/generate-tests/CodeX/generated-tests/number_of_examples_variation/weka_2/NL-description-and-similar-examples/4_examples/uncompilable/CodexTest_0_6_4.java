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


public class CodexTest_0_6_4 { 
  @Test
  public void testGetAsInstance() throws Exception {
    int num = (int) (Math.random() * 100);
    for (int i = 0; i < num; i++) {
      int numAtts = (int) (Math.random() * 100);
      Instances model = new Instances("test", new ArrayList(), numAtts);
      int numVals = (int) (Math.random() * 100);
      for (int j = 0; j < numAtts; j++) {
	if (j % 2 == 0) {
	  model.insertAttributeAt(new Attribute("Numeric" + j), j);
	} else {
	  ArrayList attVals = new ArrayList(numVals);
	  for (int k = 0; k < numVals; k++) {
	    attVals.add("val" + k);
	  }
	  model.insertAttributeAt(new Attribute("Nominal" + j, attVals), j);
	}
	model.setClassIndex(numAtts - 1);
      }
      AlgVector v = new AlgVector(numAtts);
      for (int j = 0; j < numAtts; j++) {
	if (j % 2 == 0) {
	  v.setElement(j, (Math.random() - 0.5) * 100);
	}
      }
      Instance inst = v.getAsInstance(model, new Random());
      assertEquals("Num attributes differs", numAtts, inst.numAttributes());
      for (int j = 0; j < numAtts; j++) {
	if (j % 2 == 0) {
	  assertTrue("Attribute " + j + " is not numeric", 
		     inst.attribute(j).isNumeric());
	  assertEquals("Attribute " + j + " differs", 
		       v.getElement(j), inst.value(j), 1e-6);
	} else {
	  assertTrue("Attribute " + j + " is not nominal", 
		     inst.attribute(j).isNominal());

}