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


public class CodexTest_0_4_4 { 
  @Test
    public void testGetAsInstance() {
    Instances model = null;
    try {
      model = new Instances(new java.io.StringReader(
						     "SparseInstanceTest\n" +
						     "4\n" +
						     "a numeric\n" +
						     "b numeric\n" +
						     "c numeric\n" +
						     "d numeric\n"));
      SparseInstance inst = new SparseInstance(3);
      inst.setValue(0, 1.0);
      inst.setValue(1, 2.0);
      inst.setValue(2, 3.0);
      inst.setDataset(model);
      Instance newInst = inst.getAsInstance(model, new Random(0));
      assertTrue(newInst instanceof DenseInstance);
      assertEquals(1.0, newInst.value(0), 1e-15);
      assertEquals(2.0, newInst.value(1), 1e-15);
      assertEquals(3.0, newInst.value(2), 1e-15);
      assertEquals(0.0, newInst.value(3), 1e-15);
    } catch (Exception e) {
      fail("Problem with getAsInstance: " + e.getMessage());
    }
  }
}