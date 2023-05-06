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


public class CodexTest_0_4_80 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 1;
    Instances data = makeTestDataset(numAttributes, numInstances);
    AlgVector v = new AlgVector(numAttributes);
    v.setElement(0, 1.0);
    v.setElement(1, 2.0);
    v.setElement(2, 3.0);
    Instance inst = v.getAsInstance(data, new Random(1));
    assertEquals("Number of attributes differs", numAttributes, inst.numAttributes());
    assertEquals("1. value differs", 1.0, inst.value(0));
    assertEquals("2. value differs", 2.0, inst.value(1));
    assertEquals("3. value differs", 3.0, inst.value(2));
  }
}