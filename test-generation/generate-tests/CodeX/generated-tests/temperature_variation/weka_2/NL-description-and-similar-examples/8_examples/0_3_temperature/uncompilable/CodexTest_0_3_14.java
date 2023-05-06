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


public class CodexTest_0_3_14 { 
  @Test
    public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 1;
    int numNumeric = 2;
    int numNominal = 1;
    int numValues = 3;
    int numClasses = 2;
    int classIndex = 2;
    Instances data = new Instances("Test", new ArrayList<Attribute>(), numInstances);
    ArrayList<String> nominalValues = new ArrayList<String>();
    nominalValues.add("0");
    nominalValues.add("1");
    nominalValues.add("2");
    data.insertAttributeAt(new Attribute("Nominal", nominalValues), 0);
    data.insertAttributeAt(new Attribute("Numeric1"), 1);
    data.insertAttributeAt(new Attribute("Numeric2"), 2);
    data.setClassIndex(classIndex);
    double[] values = new double[numAttributes];
    for (int i = 0; i < numInstances; i++) {
      values[0] = i % numValues;
      values[1] = i;
      values[2] = i % numClasses;
      data.add(new DenseInstance(1.0, values));
    }
    AlgVector v = new AlgVector(values);
    Instance inst = v.getAsInstance(data, new Random(1));
    assertEquals("Wrong number of attributes", numAttributes, inst.numAttributes());
    assertEquals("Wrong number of values", numAttributes, inst.numValues());
    assertEquals("Wrong number of missing values", 0, inst.numMissing());
    assertEquals("Wrong number of nominal values", numNominal, inst.attribute(0).numValues());
    assertEquals("Wrong number of numeric values", numNumeric, inst.attribute(1).numValues());
    assertEquals("Wrong number of class values", numClasses, inst.attribute(classIndex).numValues());
    assertEquals("Wrong class value", 0, (int) inst.classValue());
    assertEquals("Wrong class attribute", data.classAttribute(), inst
}