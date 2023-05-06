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


public class CodexTest_0_3_65 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 1;
    Instances data = makeTestDataset(numAtts, numInstances);
    Random random = new Random(1);
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    Instance inst = v.getAsInstance(data, random);
    assertEquals("Number of attributes differs", numAtts, inst.numAttributes());
    assertEquals("Number of values differs", numAtts, inst.numValues());
    assertEquals("First value differs", 1.0, inst.value(0), 1e-6);
    assertEquals("Second value differs", 2.0, inst.value(1), 1e-6);
    assertEquals("Third value differs", 3.0, inst.value(2), 1e-6);
  }
}