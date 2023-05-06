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


public class CodexTest_0_5_1 { 
  @Test
  public void testGetAsInstance() {
    int numAtt = 5;
    int numVal = 5;
    int numInsts = 5;
    Instances data = makeRandomData(numAtt, numVal, numInsts);
    AlgVector v = new AlgVector(numAtt);
    for (int i = 0; i < numInsts; i++) {
      Instance newInst = null;
      try {
	newInst = v.getAsInstance(data, new Random(i));
      }
      catch (Exception e) {
	e.printStackTrace();
	fail("Exception when making instance: " + e.getMessage());
      }
      assertEquals("Number of attributes differs", numAtt, newInst.numAttributes());
      for (int j = 0; j < numAtt; j++) {
	if (data.attribute(j).isNominal()) {
	  assertEquals("Value for nominal attribute " + j + " differs",
		       0, (int) newInst.value(j));
	}
	if (data.attribute(j).isNumeric()) {
	  assertEquals("Value for numeric attribute " + j + " differs",
		       0, newInst.value(j), 0.1);
	}
}