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


public class CodexTest_0_2_6 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    int numInsts = 10;
    Random random = new Random(1);
    Instances data = new Instances(new BufferedReader(new StringReader(
								      "A,B,C\n"
								      + "0,0,0\n"
								      + "1,1,1\n"
								      + "2,2,2\n"
								      + "3,3,3\n"
								      + "4,4,4\n"
								      + "5,5,5\n"
								      + "6,6,6\n"
								      + "7,7,7\n"
								      + "8,8,8\n"
								      + "9,9,9\n")));
    data.setClassIndex(data.numAttributes() - 1);
    double[] values = new double[numAtts];
    for (int i = 0; i < numInsts; i++) {
      Instance inst = new DenseInstance(1.0, values);
      inst.setDataset(data);
      AlgVector v = new AlgVector(inst);
      Instance newInst = v.getAsInstance(data, random);
      assertEquals(numAtts, newInst.numAttributes());
      for (int j = 0; j < numAtts; j++) {
	if (data.attribute(j).isNumeric()) {
	  assertEquals(values[j], newInst.value(j), 1e-6);
	} else {
	  assertTrue(newInst.value(j) >= 0);
	  assertTrue(newInst.value(j) < numV
}