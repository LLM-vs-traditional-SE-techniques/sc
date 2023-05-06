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


public class CodexTest_0_6_4 { 
  @Test
    public void testAddAttribute1() throws Exception {
		
		Instances inst = new Instances(m_Instances, 0);
		inst.setClassIndex(0);
		inst.add(getAsInstance(inst, new Random(1)));
		assertEquals(inst.numAttributes(), m_Instances.numAttributes());
		assertEquals(inst.numInstances(), m_Instances.numInstances() + 1);
		for (int i = 0; i < inst.numInstances(); i++) {
		  for (int j = 0; j < inst.numAttributes(); j++) {
		    assertEquals(inst.instance(i).value(j),
				 m_Instances.instance(i % m_Instances.numInstances()).value(j));
		  }
		}
	  }
}