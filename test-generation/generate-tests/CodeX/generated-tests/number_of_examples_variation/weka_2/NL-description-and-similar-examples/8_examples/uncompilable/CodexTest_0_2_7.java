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


public class CodexTest_0_2_7 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    int numInsts = 5;
    Random random = new Random(1);
    Instances insts = new Instances(new FastVector(), numAtts);
    for (int i = 0; i < numAtts; i++) {
      if (i < numAtts - 1) {
	insts.insertAttributeAt(new Attribute("Nominal" + (i+1)), i);
      } else {
	insts.insertAttributeAt(new Attribute("Numeric" + (i+1)), i);
      }
    }
    double[] vals = new double[numAtts];
    for (int i = 0; i < numInsts; i++) {
      for (int j = 0; j < numAtts - 1; j++) {
	vals[j] = random.nextDouble() * (double) numVals;
      }
      vals[numAtts - 1] = random.nextDouble();
      insts.add(new Instance(1.0, vals));
    }
    AlgVector vec = new AlgVector(insts.instance(0));
    Instance inst = vec.getAsInstance(insts, random);
    assertEquals("Number of attributes differ", insts.numAttributes(), 
		 inst.numAttributes());
    for (int i = 0; i < inst.numAttributes(); i++) {
      if (inst.attribute(i).isNominal()) {
	assertEquals("Nominal value differs", insts.instance(0).value(i), 
		     inst.value(i));
      }
      if (inst.attribute(i).isNumeric()) {
	assertEquals("Numeric value differs", insts.instance(0).value(i), 
		     inst.value(i));
      }
    }
  }
}