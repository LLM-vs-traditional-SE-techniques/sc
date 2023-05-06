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


public class CodexTest_0_7_40 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances insts = TestInstances.makeTestDataset(10, 5, 2, 1, false,
						    false);
    AlgVector v = new AlgVector(10);
    for (int i = 0; i < 10; i++) {
      v.setElement(i, i);
    }
    Instance inst = v.getAsInstance(insts, new Random(1));
    assertEquals("Number of values differs", insts.numAttributes(), 
		 inst.numValues());
    assertEquals("Dataset differs", insts, inst.dataset());
    assertEquals("1st value differs", 0, inst.value(0), 0);
    assertEquals("2nd value differs", 1, inst.value(1), 0);
    assertEquals("3rd value differs", 2, inst.value(2), 0);
    assertEquals("4th value differs", 3, inst.value(3), 0);
    assertEquals("5th value differs", 4, inst.value(4), 0);
    assertEquals("6th value differs", 0, inst.value(5), 0);
    assertEquals("7th value differs", 1, inst.value(6), 0);
    assertEquals("8th value differs", 0, inst.value(7), 0);
    assertEquals("9th value differs", 1, inst.value(8), 0);
    assertEquals("10th value differs", 0, inst.value(9), 0);
  }
}