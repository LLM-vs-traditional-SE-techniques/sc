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


public class CodexTest_0_2_28 { 
  @Test
  public void testGetAsInstance() {
    int num = 10;
    int numAtt = 5;
    double[] values = new double[numAtt];
    for (int i = 0; i < numAtt; i++) {
      values[i] = i;
    }
    AlgVector v = new AlgVector(values);
    Instances insts = new Instances(new Instances(new DenseInstance(numAtt), num));
    for (int i = 0; i < numAtt; i++) {
      insts.insertAttributeAt(new Attribute("Att" + (i+1)), i);
    }
    try {
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differ", numAtt, inst.numAttributes());
      for (int i = 0; i < numAtt; i++) {
	assertEquals((i+1) + ". value differs", values[i], inst.value(i));
      }
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}