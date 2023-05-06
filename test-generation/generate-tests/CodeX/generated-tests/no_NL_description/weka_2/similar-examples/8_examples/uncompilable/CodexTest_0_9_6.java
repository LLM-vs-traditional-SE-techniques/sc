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


public class CodexTest_0_9_6 { 
  @Test
   public void testGetAsInstance() {
    Random random = new Random();
    Instances instances = new Instances(new BufferedReader(
        new StringReader(instancesData)));
    instances.setClassIndex(instances.numAttributes() - 1);
    AlgVector vector = new AlgVector(instances.numAttributes());
    for (int i = 0; i < vector.numElements(); i++) {
      vector.setElement(i, random.nextGaussian());
    }
    Instance instance = vector.getAsInstance(instances, random);
    assertTrue("class index not set", instance.classIndex() != -1);
    assertEquals("num attributes", instances.numAttributes(), 
        instance.numAttributes());
    assertEquals("num values", instances.numAttributes(), 
        instance.numValues());
    assertEquals("class value", (0.0 + vector.getElement(vector.numElements() - 1))
        , instance.value(instance.classIndex()));
    for (int i = 0; i < vector.numElements(); i++) {
      if (vector.getElement(i)!= 
	  instance.value(instance.classIndex())) {
	assertEquals((i+1) + " th value", vector.getElement(i), 
		     instance.value(i));
      }
    }
  }
}