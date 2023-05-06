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


public class CodexTest_0_3_7 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 2;
    int numInstances = 5;
    Instances data = new Instances(new FastVector(numAtts), numInstances);
    data.add(new Attribute("nominal", (FastVector) null));
    data.add(new Attribute("numeric"));
    double[] vals = new double[data.numAttributes()];
    for (int i = 0; i < numInstances; i++) {
      vals[0] = (i % 2);
      vals[1] = i + 2;
      data.add(new Instance(1.0, vals));
    }
    try {
      Instance inst = new DenseInstance(1.0, vals);
      inst.setDataset(data);
      Instance inst2 = inst.getAsInstance(data, new Random(1));
      assertTrue(inst2 != null);
      assertTrue(inst2.dataset() != null);
      assertTrue(inst2.dataset() == data);
      assertTrue(inst2.numAttributes() == data.numAttributes());
      assertTrue(inst2.numValues() == data.numAttributes());
      assertTrue(inst2.classIndex() == data.classIndex());
      assertTrue(inst2.classIsMissing() == false);
      assertTrue(inst2.classValue() == inst.classValue());
      assertTrue(inst2.equalHeaders(data));
      assertTrue(inst2.equalHeaders(inst));
      assertTrue(inst2.equalValues(inst));
      assertTrue(inst2.equalValues(inst2));
      assertTrue(inst2.hashCode() == inst.hashCode());
      assertTrue(inst2.toString().equals(inst.toString()));
      assertTrue(inst2.value(0) == inst.value(0));
      assertTrue(inst2.value(1) == inst.value(1));
      assertTrue(inst2.weight() == inst.weight());
    } catch (Exception ex) {
      ex.printStackTrace();
}