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


public class CodexTest_0_5_1 { 
  @Test
    public void testGetAsInstance() {
			Instances model = new Instances(m_Data, 0);
			AlgVector v = new AlgVector(m_Data);
			try {
			  Instance i = v.getAsInstance(model, new Random(1));
			  assertEquals("Num attributes differ", model.numAttributes(), i.numAttributes());
			  for (int n = 0; n < m_Data.numAttributes(); n++) {
				if (m_Data.attribute(n).isNumeric()) {
				  assertEquals((n+1) + ". value differs", v.getElement(n), i.value(n));
				}
			  }
			} catch (Exception e) {
			  fail("Exception occurred: " + e);
			}
		  }
}