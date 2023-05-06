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


public class CodexTest_0_6_1 { 
  @Test
  public void testGetAsInstanceWithNominalAttributes() throws Exception {
    AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0, 4.0});
    Instances insts = TestInstances.createNumericAndNominalInstances();
    Random random = new Random(1);
    Instance inst = v.getAsInstance(insts, random);
    assertEquals("Wrong number of attributes", insts.numAttributes(), inst.numAttributes());
    assertEquals("Wrong number of values", insts.numAttributes(), inst.numValues());
    assertEquals("Wrong number of instances", 1, inst.numInstances());
    assertEquals("Wrong class index", insts.classIndex(), inst.classIndex());
    assertEquals("Wrong dataset", insts, inst.dataset());
    assertEquals("Wrong value for att 1", 1.0, inst.value(0), 1e-6);
    assertEquals("Wrong value for att 2", 2.0, inst.value(1), 1e-6);
    assertEquals("Wrong value for att 3", 3.0, inst.value(2), 1e-6);
    assertEquals("Wrong value for att 4", 4.0, inst.value(3), 1e-6);
    assertEquals("Wrong value for att 5", 2, inst.value(4));
    assertEquals("Wrong value for att 6", 0, inst.value(5));
  }
}