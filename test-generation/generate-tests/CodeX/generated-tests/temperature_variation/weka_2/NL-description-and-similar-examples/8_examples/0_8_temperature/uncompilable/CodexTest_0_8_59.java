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


public class CodexTest_0_8_59 { 
  @Test
    public void testGetAsInstance() {
      Instances model = setUpNominalTestData();
      m_Elements = new double[2];
      m_Elements[0] = 1;
      m_Elements[1] = 2;
      Random random = new Random(0);
      try {
	Instance newInst = getAsInstance(model, random);
	assertEquals("Notification of incorrect number of values failed",
		     model.numAttributes(), newInst.numAttributes());
	assertEquals(newInst.toString(), 
		     "0,1.0,0,2.0,0,1.0", newInst.toString());
      } catch (Exception e) {
	fail("Exception generated: " + e.getMessage());
      }
    }
}