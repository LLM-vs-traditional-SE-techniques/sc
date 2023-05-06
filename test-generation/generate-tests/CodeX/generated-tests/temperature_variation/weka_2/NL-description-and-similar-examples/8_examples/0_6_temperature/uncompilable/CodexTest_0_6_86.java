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


public class CodexTest_0_6_86 { 
  @Test
  public void testGetAsInstance() {
    int numInstances = 10;
    int numAttributes = 5;
    Instances instances = new Instances(new FastVector(numAttributes), numInstances);
    instances.setClassIndex(3);
    instances.add(new Instance(5));
    AlgVector vector = new AlgVector(5);
    assertEquals("Wrong size.", 5, vector.numElements());
    Random random = new Random(1);
    try {
      Instance instance = vector.getAsInstance(instances, random);
      assertEquals("Wrong number of attributes.", 5, instance.numAttributes());
      assertEquals("Wrong number of classes.", 2, instance.numClasses());
      assertEquals("Wrong class index.", 3, instance.classIndex());
      assertEquals("Wrong class.", 0, instance.classValue());
      assertEquals("Wrong value.", 0.0, instance.value(0));
      assertEquals("Wrong value.", 0.0, instance.value(1));
      assertEquals("Wrong value.", 0.0, instance.value(2));
      assertEquals("Wrong value.", 0.0, instance.value(3));
      assertEquals("Wrong value.", 0.0, instance.value(4));
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}