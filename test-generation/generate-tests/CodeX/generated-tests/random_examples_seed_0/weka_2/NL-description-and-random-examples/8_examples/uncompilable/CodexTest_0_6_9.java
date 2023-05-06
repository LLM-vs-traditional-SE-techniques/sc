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


public class CodexTest_0_6_9 { 
  @Test
  public void testGetAsInstance() {
    Instances model = InstancesTest.makeTestInstances();
    Instance inst = new Instance(model.numAttributes());
    inst.setDataset(model);
    inst.setValue(0, 0);
    inst.setValue(1, 1);
    for (int i = 2; i < inst.numAttributes(); i++) {
      inst.setValue(i, i);
    }
    Instance newInst = inst.getAsInstance(model, new Random(1));
    assertNotNull(newInst);
    assertEquals(model, newInst.dataset());
    assertEquals(inst.classValue(), newInst.classValue());
    for (int i = 0; i < inst.numAttributes(); i++) {
      if (inst.attribute(i).isNumeric()) {
	assertEquals(inst.value(i), newInst.value(i), 1e-6);
      } else {
	assertTrue(inst.value(i) != newInst.value(i));
      }
    }
  }
}