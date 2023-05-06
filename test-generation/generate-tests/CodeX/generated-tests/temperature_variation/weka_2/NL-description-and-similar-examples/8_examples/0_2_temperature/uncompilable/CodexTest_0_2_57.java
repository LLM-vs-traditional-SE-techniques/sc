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


public class CodexTest_0_2_57 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    int numInsts = 5;
    int numTests = 10;
    int numElements = numAtts * numVals;
    double[] elements = new double[numElements];
    for (int i = 0; i < numElements; i++) {
      elements[i] = i;
    }
    AlgVector v = new AlgVector(elements);
    Instances insts = new Instances(numInsts);
    for (int i = 0; i < numAtts; i++) {
      Attribute att = new Attribute("att" + (i+1));
      insts.insertAttributeAt(att, i);
    }
    for (int i = 0; i < numInsts; i++) {
      Instance inst = v.getAsInstance(insts, new Random(i));
      assertEquals("Num attributes differs", numAtts, inst.numAttributes());
      for (int j = 0; j < numAtts; j++) {
	assertEquals("Value differs", (int) elements[j], (int) inst.value(j));
      }
    }
  }
}