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


public class CodexTest_0_9_50 { 
  @Test
  public void testAdd_twoEqualsSizedVectors() {
    // prepare two vectors of equal size
    double[] values = {1, 2, 3};
    AlgVector v1 = new AlgVector(values);
    AlgVector v2 = new AlgVector(values);
    
    // assert that both vectors are of same size
    assertEquals("Unexpected vector sizes", v1.numElements(), v2.numElements());
    
    // add them
    AlgVector result = v1.add(v2);
    
    // assert that the result is equal to 2*values
    assertEquals("Wrong vector size", values.length, result.numElements());
    for (int i = 0; i < values.length; i++)
    	assertEquals("Wrong vector element", values[i]*2, result.getElement(i), DEFAULT_DELTA);
  }
}