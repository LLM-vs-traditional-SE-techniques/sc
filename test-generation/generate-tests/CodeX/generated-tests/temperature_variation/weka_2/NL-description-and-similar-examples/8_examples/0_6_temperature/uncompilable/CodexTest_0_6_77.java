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


public class CodexTest_0_6_77 { 
  @Test
  public void testGetAsInstance() {
    AlgVector v = new AlgVector(1, 2, 3);
    Instances model = new Instances(new FastVector(), 0);
    model.insertAttributeAt(new Attribute("test1"), 0);
    model.insertAttributeAt(new Attribute("test2"), 1);
    model.insertAttributeAt(new Attribute("test3"), 2);
    model.insertAttributeAt(new Attribute("test4"), 3);
    model.setClassIndex(0);
    
    Instance newInst = null;
    try {
      newInst = v.getAsInstance(model, new Random(1));
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
    
    assertNotNull("Instance is null", newInst);
    assertEquals("Number of attributes differ", 
		 model.numAttributes(), newInst.numAttributes());
    assertEquals("1. value differs", v.getElement(0), 
		 newInst.value(0), 0.0);
    assertEquals("2. value differs", v.getElement(1), 
		 newInst.value(1), 0.0);
    assertEquals("3. value differs", v.getElement(2), 
		 newInst.value(2), 0.0);
    assertEquals("4. value differs", 0.0, newInst.value(3), 0.0);
  }
}