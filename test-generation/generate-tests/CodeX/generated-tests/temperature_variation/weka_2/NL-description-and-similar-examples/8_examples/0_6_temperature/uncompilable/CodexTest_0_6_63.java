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


public class CodexTest_0_6_63 { 
  @Test
      public void testGetAsInstance() {
    Instances dataset = null;
    try {
      dataset = new Instances(new java.io.StringReader(
						       "Name, att1, att2\n"
						       + "dummy, 1, 3\n"));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Unable to create test instances");
    }
    dataset.setClassIndex(2);
    AlgVector vec = new AlgVector(1.0, 1.0);
    try {
      Instance inst = vec.getAsInstance(dataset, new Random(1));
      assertEquals("Wrong value for instance", 
		   1.0, inst.value(0), 1e-6);
      assertEquals("Wrong value for instance", 
		   1.0, inst.value(1), 1e-6);
      assertEquals("Wrong value for instance", 
		   1, inst.value(2), 1e-6);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Problem testing getAsInstance");
    }
  }
}