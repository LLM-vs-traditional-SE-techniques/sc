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


public class CodexTest_0_5_8 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances model = new Instances(new BufferedReader(new StringReader(
					      m_Instances.toString())));
      Instance inst = m_AlgVector.getAsInstance(model, new Random(1));
      assertEquals("# attributes differ", model.numAttributes(), 
		   inst.numAttributes());
      assertEquals("# values differ", model.numAttributes(), 
		   inst.numValues());
      for (int i = 0; i < inst.numAttributes(); i++) {
	if (model.attribute(i).isNominal())
	  assertEquals("Nominal value differs", 1, (int) inst.value(i));
	else
	  assertEquals("Numeric value differs", i+1, (int) inst.value(i));
      }
    }
    catch (Exception e) {
      fail("Exception: " + e);
    }
  }
}