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


public class CodexTest_0_9_8 { 
  @Test
  public void testGetAsInstance() {
		  Instances model = new Instances(m_Instances, 10);
		  double[] values = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};
		  AlgVector test = new AlgVector(values);
		  try {
			Instance newInst = test.getAsInstance(model, m_Random);
			assertNotNull("Instance is null", newInst);
			for (int i = 0; i < model.numAttributes(); i++) {
			  if (model.attribute(i).isNumeric()) {
				assertEquals("Values differ", values[i], newInst.value(i));
			  }
			}
		  }
		  catch (Exception e) {
			fail("Exception occurred");
		  }
		}
}