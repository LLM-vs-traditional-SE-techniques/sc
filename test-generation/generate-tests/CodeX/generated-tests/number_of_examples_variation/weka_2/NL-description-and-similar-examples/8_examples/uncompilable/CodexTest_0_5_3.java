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


public class CodexTest_0_5_3 { 
  @Test
  public void testGetAsInstance() throws Exception {
    int numAttributes = 7;
    Instances dataset = new Instances(new BufferedReader(new StringReader(InstancesTest.INSTANCE_DATA_ARFF)));
    Instance instance = dataset.instance(0);
    AlgVector vector = new AlgVector(instance);
    Instance newInstance = vector.getAsInstance(dataset, new Random(1));
    assertEquals("Number of attributes differ", numAttributes, newInstance.numAttributes());
    assertEquals("Instance value differs", instance.value(0), newInstance.value(0), 0.0);
    assertEquals("Instance value differs", instance.value(1), newInstance.value(1), 0.0);
    assertEquals("Instance value differs", instance.value(2), newInstance.value(2), 0.0);
    assertEquals("Instance value differs", instance.value(3), newInstance.value(3), 0.0);
    assertEquals("Instance value differs", instance.value(4), newInstance.value(4), 0.0);
    assertEquals("Instance value differs", instance.value(5), newInstance.value(5), 0.0);
    assertEquals("Instance value differs", instance.value(6), newInstance.value(6), 0.0);
  }
}