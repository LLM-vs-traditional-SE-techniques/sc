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


public class CodexTest_0_4_2 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(m_Instances, 0);
    model.setClassIndex(model.numAttributes() - 1);
    Instance inst = null;
    try {
      inst = m_AlgVector.getAsInstance(model, new Random(1));
    } catch (Exception e) {
      fail("Problem with getAsInstance: " + e.getMessage());
    }
    assertEquals("Number of attributes differ", model.numAttributes(), 
		 inst.numAttributes());
    assertEquals("Class value differs", m_Instances.instance(0).classValue(), 
		 inst.classValue());
  }
}