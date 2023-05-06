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


public class CodexTest_0_5_6 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numValues = 4;
    int numInstances = 10;
    double[] values = new double[numAttributes * numInstances];
    for (int i = 0; i < values.length; i++)
      values[i] = i;
    Instances structure = new Instances("test", new ArrayList<Attribute>(), 
					numInstances);
    structure.add(new Attribute("nominal", new ArrayList<String>(numValues)));
    structure.add(new Attribute("nominal", new ArrayList<String>(numValues)));
    structure.add(new Attribute("numeric"));
    structure.add(new Attribute("numeric"));
    structure.add(new Attribute("numeric"));
    structure.add(new Attribute("numeric"));
    structure.add(new Attribute("nominal", new ArrayList<String>(numValues)));
    structure.add(new Attribute("nominal", new ArrayList<String>(numValues)));
    structure.add(new Attribute("numeric"));
    structure.add(new Attribute("numeric"));
    AlgVector vector = new AlgVector(values);
    Random random = new Random(1);
    Instance inst = vector.getAsInstance(structure, random);
    assertEquals("Number of values differs", numAttributes, 
		 inst.numValues());
    assertEquals("Number of attributes differs", numAttributes, 
		 inst.numAttributes());
    assertEquals("Value 0 differs", 0, inst.value(0));
    assertEquals("Value 1 differs", 0, inst.value(1));
    assertEquals("Value 2 differs", 0, inst.value(2));
    assertEquals("Value 3 differs", 1, inst.value(3));
    assertEquals("Value 4 differs", 2, inst.value(4));
    assertEquals("Value 5 differs", 3, inst.value(5));
    assertEquals("Value 6 differs", 0, inst.value(6));
    assertEquals
}