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


public class CodexTest_0_9_39 { 
  @Test
  public void testRandomGeneration() {
    Random rand = new Random();
    rand.setSeed(42);
    
    Instances i = new Instances(m_Instances);
    DoubleVector v = new DoubleVector(m_Instance.toDoubleArray());
    Instance newInst = v.getAsInstance(i, rand);
    
    for (int j = 0; j < i.numAttributes(); j++) {
      if (i.attribute(j).isNumeric()) {
	assertEquals(v.getElement(j), newInst.value(j));
     }
    }
      
    boolean correctClass = true;
    for (int j = 0; j < i.numAttributes(); j++) {
     if (j == i.classIndex()) {
       if (!Utils.eq(newInst.value(j), m_Instance.value(j))) {
	 correctClass = false;
	 break;
       }
     }
    }
    
    assertTrue(!m_Instance.classIsMissing() || !correctClass);
  }
}