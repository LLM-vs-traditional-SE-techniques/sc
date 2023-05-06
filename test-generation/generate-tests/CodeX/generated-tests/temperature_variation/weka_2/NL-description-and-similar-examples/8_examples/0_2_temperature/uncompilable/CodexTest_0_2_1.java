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


public class CodexTest_0_2_1 { 
  @Test
  public void testGetAsInstance() {
    int numAtt = 3;
    int numInst = 20;
    Instances insts = new Instances(new FastVector(), numAtt);
    for (int i = 0; i < numAtt; i++) {
      if (i % 2 == 0) {
	insts.insertAttributeAt(new Attribute("Nom" + (i + 1)), i);
      } else {
	insts.insertAttributeAt(new Attribute("Num" + (i + 1)), i);
      }
    }
    insts.insertAttributeAt(new Attribute("Class"), numAtt);
    insts.setClassIndex(numAtt);
    double[] vals = new double[numAtt];
    for (int i = 0; i < numInst; i++) {
      for (int j = 0; j < numAtt; j++) {
	if (j % 2 == 0) {
	  vals[j] = i % 2;
	} else {
	  vals[j] = i;
	}
      }
      insts.add(new Instance(1.0, vals));
    }
    AlgVector vec = new AlgVector(numAtt);
    for (int i = 0; i < numAtt; i++) {
      vec.setElement(i, i);
    }
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals("Num of atts differ", numAtt, inst.numAttributes());
      for (int i = 0; i < numAtt; i++) {
	if (i % 2 == 0) {
	  assertEquals("Nominal value differs", 0, inst.value(i));
	} else {
	  assertEquals("Numeric value differs", i, inst.value(i));
	}
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}