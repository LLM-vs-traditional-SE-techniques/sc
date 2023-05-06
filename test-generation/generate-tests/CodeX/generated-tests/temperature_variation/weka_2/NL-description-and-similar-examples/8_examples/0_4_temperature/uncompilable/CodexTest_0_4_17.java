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


public class CodexTest_0_4_17 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new StringReader("@relation dummy\n"
						     + "@attribute att1 numeric\n"
						     + "@attribute att2 numeric\n"
						     + "@attribute att3 numeric\n"
						     + "@attribute att4 numeric\n"
						     + "@attribute att5 numeric\n"
						     + "@attribute att6 numeric\n"
						     + "@attribute att7 numeric\n"
						     + "@attribute att8 numeric\n"
						     + "@attribute att9 numeric\n"
						     + "@attribute att10 numeric\n"
						     + "@attribute att11 numeric\n"
						     + "@data\n"
						     + "1,2,3,4,5,6,7,8,9,10,11\n"));
    AlgVector v = new AlgVector(new double[]{1,2,3,4,5,6,7,8,9,10,11});
    Instance inst = null;
    try {
      inst = v.getAsInstance(model, new Random(1));
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
    assertEquals("Number of attributes differ", model.numAttributes(), 
		 inst.numAttributes());
    for (int i = 0; i < model.numAttributes(); i++) {
      assertEquals("Value differs", model.instance(0).value(i), inst.value(i));
    }
  }
}