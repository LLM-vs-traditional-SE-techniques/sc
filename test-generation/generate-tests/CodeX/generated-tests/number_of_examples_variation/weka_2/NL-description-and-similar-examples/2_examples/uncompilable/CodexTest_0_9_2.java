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


public class CodexTest_0_9_2 { 
  @Test
  public void testGetInstance() {
    AlgVector v = null;
    Instance inst = null;
    try {
      v = new AlgVector(4);
      for (int i = 0; i < 4; i++) 
        v.setElement(i, i + 1);
      inst = v.getAsInstance(new Instances(this.getClass().getResourceAsStream("/org/burgers/alg/AlgVectorTest.testGetInstance.arff")), new Random());
      assertEquals("Vector length differs", v.numElements(), inst.numAttributes());
      for (int i = 0; i < v.numElements(); i++) {
        int dec = (int) (inst.value(i) * 10.0);
        dec = (dec > 0) ? dec : dec - 1;
        assertEquals("Vector value differs", v.getElement(i), dec / 10.0);
      }
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }
}