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


public class CodexTest_0_3_62 { 
  @Test
  public void testGetAsInstance() {
    int numInst = 10;
    int numAtt = 10;
    int numVal = 10;
    Instances inst = new Instances(new Random(1));
    for (int i = 0; i < numAtt; i++) {
      if (i % 2 == 0) {
	inst.insertAttributeAt(new Attribute("Att" + i), i);
      } else {
	FastVector attVals = new FastVector(numVal);
	for (int n = 0; n < numVal; n++) {
	  attVals.addElement("val" + (n + 1));
	}
	inst.insertAttributeAt(new Attribute("Att" + i, attVals), i);
      }
    }
    inst.insertAttributeAt(new Attribute("class"), inst.numAttributes());
    inst.setClassIndex(inst.numAttributes() - 1);
    for (int i = 0; i < numInst; i++) {
      inst.add(new DenseInstance(1.0, new double[numAtt]));
    }
    try {
      AlgVector v = new AlgVector(inst.numAttributes());
      Instance inst2 = v.getAsInstance(inst, new Random(1));
      assertEquals("Num attributes differ", inst.numAttributes(), 
		   inst2.numAttributes());
      for (int i = 0; i < inst.numAttributes(); i++) {
	if (inst.attribute(i).isNominal()) {
	  assertTrue("Nominal value not in range", 
		     (inst2.value(i) >= 0) && (inst2.value(i) < numVal));
	}
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}