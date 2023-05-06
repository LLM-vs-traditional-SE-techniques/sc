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


public class CodexTest_0_5_28 { 
  @Test
	public void testGetAsInstance() {
		Instance inst = new DenseInstance(3);
		inst.setDataset(new Instances(m_Instances, 0));
		inst.setValue(0, 0);
		inst.setValue(1, 1);
		inst.setValue(2, 2);
		AlgVector vector = new AlgVector(inst);
		try {
			Instance newInst = vector.getAsInstance(m_Instances, new Random(1));
			assertEquals("Datatypes are not compatible.", inst, newInst);
		} catch (Exception e) {
			fail("Exception occurred: " + e.getMessage());
		}
	}
}