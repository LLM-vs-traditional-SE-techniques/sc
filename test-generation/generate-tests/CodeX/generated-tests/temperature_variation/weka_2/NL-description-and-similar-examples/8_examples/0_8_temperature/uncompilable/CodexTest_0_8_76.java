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


public class CodexTest_0_8_76 { 
  @Test
    public void testGetAsInstance() throws Exception {
		Random random = new Random(42);
		DenseInstance inst = new DenseInstance(2);
		inst.setValue(0, 1);
		inst.setValue(1, 2);
		DenseInstance instNew = (DenseInstance) inst.getAsInstance(inst.dataset(), random);
		assertEquals(inst.value(0), instNew.value(0), 0.0001);
		assertEquals(inst.value(1), instNew.value(1), 0.0001);
	}
}