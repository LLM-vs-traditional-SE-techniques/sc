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


public class CodexTest_0_4_67 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    int numInsts = 10;
    Instances insts = new Instances(new TestInstances(), numInsts);
    insts.setClassIndex(numAtts - 1);
    Instances insts2 = new Instances(insts, numInsts);
    AlgVector vec = new AlgVector(numAtts);
    Random r = new Random(1);
    for (int i = 0; i < numInsts; i++) {
      Instance orig = insts.instance(i);
      Instance copy = vec.getAsInstance(insts2, r);
      for (int j = 0; j < numAtts - 1; j++) {
	if (insts.attribute(j).isNominal()) {
	  assertEquals("Attribute " + j + " differs", 
		       orig.value(j), copy.value(j));
	} else {
	  assertEquals("Attribute " + j + " differs", 
		       orig.value(j), copy.value(j), 0.0);
	}
      }
    }
  }
}