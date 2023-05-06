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


public class CodexTest_0_3_89 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(m_Instances, 0);
    model.setClassIndex(1);
    Random random = new Random(1);
    try {
      Instance inst = m_AlgVector.getAsInstance(model, random);
      assertEquals("Datatypes are not compatible.", 
		   m_AlgVector.numElements(), inst.numAttributes());
      for (int i = 0; i < m_AlgVector.numElements(); i++) {
	assertEquals("Values differ.", m_AlgVector.getElement(i), 
		     inst.value(i));
      }
    } catch (Exception e) {
      fail("Exception occurred: " + e.getMessage());
    }
  }
}