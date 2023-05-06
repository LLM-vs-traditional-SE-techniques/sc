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


public class CodexTest_0_2_35 { 
  @Test
  public void testGetAsInstance() {
    int num = 10;
    int numAtt = 5;
    int numVal = 3;
    double[] vals = new double[num];
    for (int i = 0; i < num; i++) {
      vals[i] = i;
    }
    AlgVector vec = new AlgVector(vals);
    Instances insts = new Instances(new Instances(new DenseInstance(numAtt), num));
    for (int i = 0; i < numAtt; i++) {
      if (i % 2 == 0) {
	insts.insertAttributeAt(new Attribute("Nom" + (i + 1)), i);
      } else {
	insts.insertAttributeAt(new Attribute("Num" + (i + 1)), i);
      }
    }
    insts.setClassIndex(numAtt - 1);
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differ", numAtt, inst.numAttributes());
      for (int i = 0; i < numAtt; i++) {
	if (i % 2 == 0) {
	  assertTrue("Attribute " + i + " is not nominal", inst.attribute(i).isNominal());
	  assertEquals("Attribute " + i + " has wrong number of values", numVal, inst.attribute(i).numValues());
	} else {
	  assertTrue("Attribute " + i + " is not numeric", inst.attribute(i).isNumeric());
	}
      }
      assertEquals("Class index is wrong", numAtt - 1, inst.classIndex());
      assertEquals("Class value is wrong", 0, inst.classValue());
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}