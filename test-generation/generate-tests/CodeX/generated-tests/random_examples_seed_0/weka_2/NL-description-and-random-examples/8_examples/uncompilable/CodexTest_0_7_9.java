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


public class CodexTest_0_7_9 { 
  @Test
  public void testGetAsInstance() {
    Instance inst = null;
    try {
      inst = m_Instance.getAsInstance(m_Instances, new Random(1));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception when constructing instance from Instance "
	+ "object");
    }
    assertEquals("Class value differs", inst.classValue(), 
		 m_ClassValue, m_Delta);
    assertEquals("Weight differs", inst.weight(), m_Weight, m_Delta);
    assertEquals("Number of values differs", inst.numAttributes(), 
		 m_Instances.numAttributes());
    for (int i = 0; i < inst.numAttributes(); i++) {
      assertEquals("Value differs for attribute " + i, inst.value(i),
		   m_Values[i], m_Delta);
    }
  }

}