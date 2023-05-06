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


public class CodexTest_0_6_53 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(m_Instances);
    data.deleteAttributeAt(data.numAttributes() - 1);
    AlgVector v = new AlgVector(data);
    for (int i = 0; i < data.numAttributes(); i++)
      v.setElement(i, 1.0);
    try {
      Instance inst = v.getAsInstance(data, new Random(1));
      assertEquals("Length differs", data.numAttributes(), inst.numAttributes());
      assertEquals("Class differs", m_Instances.classIndex(), inst.classIndex());
      for (int j = 0; j < data.numAttributes(); j++) {
	if (data.attribute(j).isNumeric()) {
	  assertEquals("Value differs", 1.0, inst.value(j));
	} else if (data.attribute(j).isNominal()) {
	  assertEquals("Value differs", 1, (int) inst.value(j));
	}
      }
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}