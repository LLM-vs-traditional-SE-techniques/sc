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


public class CodexTest_0_3_5 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
      Instances model = new Instances(new BufferedReader(new StringReader(
									 "1,2,3\n4,5,6\n")));
      Instance inst = v.getAsInstance(model, new Random());
      assertEquals("Dataset differs", model, inst.dataset());
      assertEquals("Length differs", model.numAttributes(), inst.numAttributes());
      for (int i = 0; i < model.numAttributes(); i++) {
	if (model.attribute(i).isNumeric())
	  assertEquals((i+1) + ". value differs",
		       model.instance(0).value(i), inst.value(i));
	if (model.attribute(i).isNominal())
	  assertTrue((i+1) + ". value differs",
		     model.instance(0).value(i) != inst.value(i));
      }
    } catch (Exception e) {
      fail("Exception occured: " + e.getMessage());
    }
  }
}