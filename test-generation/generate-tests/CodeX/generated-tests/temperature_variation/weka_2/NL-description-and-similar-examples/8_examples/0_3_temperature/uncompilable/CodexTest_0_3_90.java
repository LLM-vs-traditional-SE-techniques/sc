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


public class CodexTest_0_3_90 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(m_Instances, 0);
    model.deleteAttributeAt(0);
    model.deleteAttributeAt(0);
    model.deleteAttributeAt(0);
    AlgVector v = new AlgVector(m_Instances.numAttributes());
    for (int i = 0; i < m_Instances.numAttributes(); i++) {
      v.setElement(i, m_Instances.instance(0).value(i));
    }
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Number of attributes differ", model.numAttributes(),
		   inst.numAttributes());
      for (int i = 0; i < model.numAttributes(); i++) {
	assertEquals("Values differ", v.getElement(i), inst.value(i));
      }
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}