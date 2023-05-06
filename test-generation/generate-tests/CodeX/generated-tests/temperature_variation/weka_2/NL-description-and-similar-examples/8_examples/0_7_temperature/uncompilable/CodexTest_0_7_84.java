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


public class CodexTest_0_7_84 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    double[] values = {1,2,3};
    DenseInstance instance = new DenseInstance(numAttributes, values);
    AlgVector vector = new AlgVector(instance);
    assertEquals("Wrong value for number of attributes", 
		 numAttributes, vector.numAttributes());
    assertEquals("Wrong value for number of elements", 
		 numAttributes, vector.numElements());
    for (int i = 0; i < numAttributes; i++) {
      assertEquals("Wrong value for element "+i, 
		   values[i], vector.getElement(i));
    }
  }
}