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


public class CodexTest_0_4_38 { 
  @Test
  public void testGetAsInstance() {
    int num = 20;
    int numNom = 5;
    int numVal = 4;
    int numAtt = num + numNom;
    Random random = new Random(1);
    Instances insts = new Instances(new BufferedReader(
				     new StringReader(InstancesTest.INSTANCE_DATA)));
    insts.setClassIndex(insts.numAttributes() - 1);
    AlgVector v = new AlgVector(num);
    for (int i = 0; i < num; i++) {
      v.setElement(i, random.nextDouble());
    }
    try {
      Instance inst = v.getAsInstance(insts, random);
      assertEquals("Number of attributes differ", numAtt, inst.numAttributes());
      assertEquals("Number of values differ", numAtt, inst.numValues());
      for (int i = 0; i < num; i++) {
	assertEquals("Numeric values differ", v.getElement(i), 
		     inst.value(i), 1e-6);
      }
      for (int i = num; i < numAtt; i++) {
	assertTrue("Nominal value too large", 
		   (int) inst.value(i) < insts.attribute(i).numValues());
      }
    } catch (Exception ex) {
      fail("Exception occurred: " + ex.getMessage());
    }
  }
}