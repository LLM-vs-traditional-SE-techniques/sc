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


public class CodexTest_0_8_61 { 
  @Test
  public void testGetAsInstanceWithDiffNumberAttributes() {
		AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
		Instances model = new Instances(new Instances(mock(Instances.class),0));
		m_Dataset = model;
		m_Attribute = new Attribute("dummy");
		m_Attribute.setWeight(3);
		m_Dataset.insertAttributeAt(m_Attribute, 0);
		m_Attribute = new Attribute("dummy");
		m_Attribute.setWeight(4);
		m_Dataset.insertAttributeAt(m_Attribute, 1);
		try {
			Instance newInst = v.getAsInstance(m_Dataset, m_Random);
			fail("Should have failed with exception");
		} catch (Exception e) {
			assertEquals("Datatypes are not compatible.", e.getMessage());
		}
	}
}