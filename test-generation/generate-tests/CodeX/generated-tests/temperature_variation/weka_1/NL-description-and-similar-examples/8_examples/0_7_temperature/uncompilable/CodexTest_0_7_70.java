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


public class CodexTest_0_7_70 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(2);
    AlgVector v2 = new AlgVector(2);
    v1.setElement(0, 4.0);
    v1.setElement(1, 5.0);
    v2.setElement(0, 6.0);
    v2.setElement(1, 7.0);
    
    AlgVector v3 = v1.add(v2);
    
    assertEquals("Length differs", v1.numElements(), v3.numElements());
    assertEquals(10.0, v3.getElement(0), 1e-40);
    assertEquals(12.0, v3.getElement(1), 1e-40);
  }
  public void testAddSelf() {
    AlgVector v1 = new AlgVector(2);
    AlgVector v2 = new AlgVector(2);
    v1.setElement(0, 4.0);
    v1.setElement(1, 5.0);
    v2.setElement(0, 6.0);
    v2.setElement(1, 7.0);
    
    v1.addSelf(v2);
    
    assertEquals(10.0, v1.getElement(0), 1e-40);
    assertEquals(12.0, v1.getElement(1), 1e-40);
  }
}