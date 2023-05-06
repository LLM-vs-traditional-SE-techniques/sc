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


public class CodexTest_0_3_91 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 2;
    int numInstances = 10;
    double[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Instances insts = new Instances(new Instances(m_Instances, 0), 0);
    for (int i = 0; i < numAtts; i++) {
      insts.insertAttributeAt(new Attribute("Att" + (i + 1)), i);
    }
    insts.insertAttributeAt(new Attribute("Class"), numAtts);
    insts.setClassIndex(numAtts);
    for (int i = 0; i < numInstances; i++) {
      Instance inst = new DenseInstance(numAtts + 1);
      inst.setDataset(insts);
      for (int j = 0; j < numAtts; j++) {
	inst.setValue(j, values[i]);
      }
      inst.setValue(numAtts, i % 2);
      insts.add(inst);
    }
    AlgVector vec = new AlgVector(values);
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertTrue("Instance is null", inst != null);
      assertTrue("Number of attributes incorrect", inst.numAttributes() == numAtts + 1);
      assertTrue("Number of values incorrect", inst.numValues() == numAtts + 1);
      assertTrue("Dataset incorrect", inst.dataset() == insts);
      assertTrue("Class value incorrect", inst.classValue() == 0);
      assertTrue("Class is not missing", !inst.classIsMissing());
      for (int i = 0; i < numAtts; i++) {
	assertTrue("Value incorrect", inst.value(i) == values[0]);
	assertTrue("Value is missing", !inst.isMissing(i));
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
}