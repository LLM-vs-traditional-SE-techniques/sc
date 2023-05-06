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


public class CodexTest_0_9_45 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances model = InstancesTestHelper.createInstance();
    AlgVector vec = new AlgVector(model, new Random());
    Instance inst = vec.getAsInstance(model, new Random());
    assertNotNull("created instance should not be null", inst);
    assertEquals("number of attributes is different", 
		 model.numAttributes(), inst.numAttributes());
    for (int i = 0; i < model.numAttributes(); i++) {
      assertFalse("instance value is unknown", inst.isMissing(i));	
      if (model.attribute(i).isNominal()) {
	assertTrue("created value is not nominal", inst.isMissing(i));
	if (i < 5) {
	  assertTrue("created nominal value is different",
		     !inst.isMissing(i) && inst.value(i) == 3);
	} else {
	  assertTrue("created nominal value is different",
		     !inst.isMissing(i) && inst.value(i) == 2);
	}
      }
      if (model.attribute(i).isNumeric()) {
	assertTrue("created value is not numeric", inst.isMissing(i));
	if (i < 5) {
	  assertTrue("created numeric value is different",
		     !inst.isMissing(i) && inst.value(i) == 3);
	} else {
	  assertTrue("created numeric value is different",
		     !inst.isMissing(i) && inst.value(i) == 2);
	}    
      }
    }
  }
}