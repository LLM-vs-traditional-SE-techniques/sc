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


public class CodexTest_0_6_39 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(m_Instances, 0, 3);
    data.setClassIndex(data.numAttributes() - 1);
    AlgVector v = new AlgVector(data.instance(1));
    try {
      Instance inst = v.getAsInstance(data, new Random(1));
      assertTrue("Datatypes are not compatible.", 
		 data.instance(0).dataset() == inst.dataset());
      assertTrue("Datatypes are not compatible.", 
		 data.instance(1).dataset() == inst.dataset());
      assertTrue("Datatypes are not compatible.", 
		 data.instance(2).dataset() == inst.dataset());
    } catch (Exception e) {
      fail("Problem with getAsInstance: " + e.getMessage());
    }
  }
}