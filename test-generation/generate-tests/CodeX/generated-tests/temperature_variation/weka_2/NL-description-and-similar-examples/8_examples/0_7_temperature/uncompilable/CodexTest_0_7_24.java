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


public class CodexTest_0_7_24 { 
  @Test
    public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(
                                          new StringReader(instances)));
    model.setClassIndex(model.numAttributes() - 1);
    AlgVector v = new AlgVector(3);
    v.setElement(0, 1);
    v.setElement(1, 2);
    v.setElement(2, 3);
    Instance in = null;
    try {
      in = v.getAsInstance(model, null);
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
    assertTrue("Instance null", in != null);
    assertTrue("Instance has wrong class value",
	       in.classValue() == 1);
    assertTrue("Instance has wrong number of values",
	       in.numValues() == model.numAttributes());
    assertEquals("Instance has wrong value for attribute 0",
		 1, in.value(0), EPSILON);
    assertEquals("Instance has wrong value for attribute 1",
		 2, in.value(1), EPSILON);
    assertEquals("Instance has wrong value for attribute 2",
		 3, in.value(2), EPSILON);
    assertEquals("Instance has wrong value for class attribute",
		 1, in.classValue(), EPSILON);
  }

}