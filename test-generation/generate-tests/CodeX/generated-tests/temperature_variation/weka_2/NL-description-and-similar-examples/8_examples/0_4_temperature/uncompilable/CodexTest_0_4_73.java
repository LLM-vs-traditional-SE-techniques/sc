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


public class CodexTest_0_4_73 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 20;
    int numVals = 3;
    int numInsts = 10;
    int numTests = 10;
    int i, j, k;
    double[] values = new double[numAtts];
    Random random = new Random(1);
    Instances insts = new Instances(new Instances(new Instance(1.0, values), 0), 0);
    for (i = 0; i < numAtts; i++) {
      if (i % 2 == 0) {
	insts.insertAttributeAt(new Attribute("Nom" + (i + 1)), i);
      } else {
	insts.insertAttributeAt(new Attribute("Num" + (i + 1)), i);
      }
    }
    insts.insertAttributeAt(new Attribute("Class"), numAtts);
    insts.setClassIndex(numAtts);
    for (i = 0; i < numInsts; i++) {
      for (j = 0; j < numAtts; j++) {
	if (j % 2 == 0) {
	  values[j] = random.nextInt(numVals);
	} else {
	  values[j] = random.nextDouble();
	}
      }
      values[numAtts] = random.nextInt(numVals);
      insts.add(new Instance(1.0, values));
    }
    AlgVector vec = new AlgVector(insts);
    for (i = 0; i < numTests; i++) {
      Instance inst = vec.getAsInstance(insts, random);
      for (j = 0; j < numAtts; j++) {
	if (j % 2 == 0) {
	  assertTrue("Nominal value out of range", 
		     (inst.value(j) >= 0) && (inst.value(j) <= numVals));
	} else {
	  assertTrue("Numeric value out of range", 
		     (inst.value(j) >= 0)
}