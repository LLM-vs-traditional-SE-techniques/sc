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


public class CodexTest_0_7_73 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(m_Instances, 10);
    data.setClassIndex(data.numAttributes() - 1);
    for (int i = 0; i < data.numInstances(); i++) {
      Instance inst = data.instance(i);
      AlgVector v = new AlgVector(inst);
      try {
	Instance newInst = v.getAsInstance(data, new Random(1));
	assertNotNull(newInst);
	assertEquals(inst.numAttributes(), newInst.numAttributes());
	for (int j = 0; j < inst.numAttributes(); j++) {
	  if (j != inst.classIndex()) {
	    assertEquals(inst.value(j), newInst.value(j));
	  }
	}
      } catch (Exception e) {
	fail("Failed to get instance from vector: " + e);
      }
    }
  }
}