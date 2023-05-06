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


public class CodexTest_0_5_19 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(m_Instances, 0);
    model.setClassIndex(model.numAttributes() - 1);
    Random random = new Random(1);
    Instance newInst = m_AlgVector.getAsInstance(model, random);
    assertEquals("Datatypes are not compatible.", 
		 m_AlgVector.numElements(), newInst.numAttributes());
    for (int i = 0; i < m_AlgVector.numElements(); i++) {
      assertEquals("Values are not equal.", m_AlgVector.getElement(i),
		   newInst.value(i));
    }
  }
}