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


public class CodexTest_0_1_37 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances data = new Instances(new FastVector(numAtts), numInstances);
    data.add(new Attribute("A"));
    data.add(new Attribute("B"));
    data.add(new Attribute("C"));
    double[] vals = new double[numAtts];
    for (int i = 0; i < numInstances; i++) {
      vals[0] = i;
      vals[1] = i + 1;
      vals[2] = i + 2;
      data.add(new Instance(1.0, vals));
    }
    AlgVector vec = new AlgVector(vals);
    Instance inst = vec.getAsInstance(data, new Random(1));
    assertEquals("A", inst.value(0), vals[0]);
    assertEquals("B", inst.value(1), vals[1]);
    assertEquals("C", inst.value(2), vals[2]);
  }
}