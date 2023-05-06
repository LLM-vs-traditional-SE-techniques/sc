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


public class CodexTest_0_4_4 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 7;
    int numNominal = 2;
    int numNumeric = numAttributes - numNominal;
    int[] nominalValues = {2, 3};
    int numElements = 5;
    double[] elements = {1.0, 2.0, 3.0, 4.0, 5.0};
    Instances model = createModel(numAttributes, numNominal, nominalValues);
    AlgVector vector = new AlgVector(elements);
    Random random = new Random(1);
    try {
      Instance instance = vector.getAsInstance(model, random);
      assertEquals("Number of attributes differs", numAttributes, instance.numAttributes());
      assertEquals("Number of values differs", numNominal + numNumeric, instance.numValues());
      assertEquals("Number of missing values differs", numNominal, instance.numMissing());
      for (int i = 0; i < numNominal; i++) {
	assertEquals("Nominal value differs", 0, instance.value(i));
      }
      for (int i = 0; i < numNumeric; i++) {
	assertEquals("Numeric value differs", elements[i], instance.value(i + numNominal));
      }
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
  }
}