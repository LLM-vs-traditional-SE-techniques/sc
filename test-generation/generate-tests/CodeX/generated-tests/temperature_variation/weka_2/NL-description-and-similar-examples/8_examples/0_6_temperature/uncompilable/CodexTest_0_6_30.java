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


public class CodexTest_0_6_30 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numNumeric = 2;
    int numNominal = 1;
    try {
      // Create instance of a numeric attribute
      Attribute numericAttribute = Attribute.createNumericAttribute("numeric");
      // Create instance of a nominal attribute
      Attribute nominalAttribute = Attribute.createNominalAttribute("nominal", Arrays.asList("a", "b", "c"));
      // Create instance of Instances
      Instances instances = new Instances("instances", Arrays.asList(numericAttribute, numericAttribute, nominalAttribute), 0);
      // Create instance of AlgVector
      double[] elements = {1.0, 2.0};
      AlgVector vector = new AlgVector(elements);
      // Create instance of Random
      Random random = new Random(1);
      // Create instance of Instance
      Instance instance = vector.getAsInstance(instances, random);
      // Check if the number of attributes equals to 3
      assertEquals(numAttributes, instance.numAttributes());
      // Check if the number of numeric attributes equals to 2
      assertEquals(numNumeric, instance.numNumericAttributes());
      // Check if the number of nominal attributes equals to 1
      assertEquals(numNominal, instance.numNominalAttributes());
      // Check if the value of the first numeric attribute equals to 1.0
      assertEquals(1.0, instance.value(0));
      // Check if the value of the second numeric attribute equals to 2.0
      assertEquals(2.0, instance.value(1));
      // Check if the value of the nominal attribute equals to 0
      assertEquals(0, instance.value(2));
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }
}