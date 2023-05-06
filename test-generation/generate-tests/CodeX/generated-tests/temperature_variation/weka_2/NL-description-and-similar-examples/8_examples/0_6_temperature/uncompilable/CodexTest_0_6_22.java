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


public class CodexTest_0_6_22 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances data = new Instances(new BufferedReader(new StringReader(
									 InstancesTest.simpleData)));
      AlgVector v = new AlgVector(data.numAttributes());
      for (int i = 0; i < data.numAttributes(); i++) {
	if (data.attribute(i).isNumeric()) {
	  v.setElement(i, i);
	}
      }
      Instance inst = v.getAsInstance(data, new Random(1));
      assertTrue("Datatype incorrect", inst.dataset() == data);
      for (int i = 0; i < data.numAttributes(); i++) {
	if (data.attribute(i).isNumeric()) {
	  assertEquals((i+1) + ". element incorrect", i, inst.value(i));
	} else {
	  assertEquals((i+1) + ". element incorrect", 0, inst.value(i));
	}
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown " + ex);
    }
  }
}