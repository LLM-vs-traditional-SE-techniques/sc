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


public class CodexTest_0_6_8 { 
  @Test
    public void testGetAsInstance() {
    try {
      Instances data = new Instances(new BufferedReader(new FileReader(m_TestFile)));
      data.setClassIndex(0);
      TestInstances test = new TestInstances();
      test.setNumInstances(data.numInstances());
      test.setClassIndex(0);
      test.setNumAttributes(data.numAttributes());
      test.setNumNumeric(data.numAttributes());
      test.setRelationName("TestInstances");
      Instance inst = new Instance(data.numAttributes());
      inst.setDataset(data);
      double[] vals = new double[data.numAttributes()];
      for (int n = 0; n < data.numAttributes(); n++) {
        vals[n] = n;
      }
      inst.setValue(0, "classVal");
      for (int n = 1; n < data.numAttributes(); n++) {
        inst.setValue(n, n);
      }
      TestInstances testInst = new TestInstances();
      testInst.setInstance(inst);
      Instance inst2 = testInst.getAsInstance(data, new Random(1));
      assertTrue(inst2.dataset() != null);
      assertTrue(inst2.dataset().numAttributes() == data.numAttributes());
      assertTrue(inst2.dataset().numInstances() == data.numInstances());
      assertTrue(inst2.dataset().relationName().equals(data.relationName()));
      for (int i = 0; i < data.numAttributes(); i++) {
        if (i == 0) {
          assertTrue(inst2.dataset().attribute(i).index() == 0);
          assertTrue(inst2.dataset().attribute(i).isNominal());
          assertTrue(inst2.dataset().attribute(i).name().equals(data.attribute(i).name()));
          assertTrue(inst2.dataset().attribute(i).numValues() == data.attribute(i).numValues
}