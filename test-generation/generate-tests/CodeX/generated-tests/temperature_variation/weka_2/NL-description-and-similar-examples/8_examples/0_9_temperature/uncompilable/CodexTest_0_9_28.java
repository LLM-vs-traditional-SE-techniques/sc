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


public class CodexTest_0_9_28 { 
  @Test
  public void testGetAsInstanceNominal() {
    int numClasses = 3;
    int numAttributes = 3;
    Random random = new Random(123);
    Instances dataset = TestInstances.createRandomInstances(numAttributes+1, numClasses);
    
    
    AlgVector vector = new AlgVector(numAttributes);
    Instance instance = vector.getAsInstance(dataset, random);
    assertEquals(numAttributes+1, instance.numAttributes());
    assertEquals(dataset, instance.dataset());
    assertEquals(numAttributes, vector.numElements());
    for (int i = 0; i < numAttributes; i++) {
      assertEquals(vector.getElement(i), instance.value(i));
    }
    
    assertEquals(0, instance.classIndex());
    assertTrue(instance.classIsMissing());
  }
}