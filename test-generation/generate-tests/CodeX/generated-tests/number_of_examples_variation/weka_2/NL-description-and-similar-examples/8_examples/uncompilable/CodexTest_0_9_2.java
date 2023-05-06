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


public class CodexTest_0_9_2 { 
  @Test
  public void testGetAsInstance() throws Exception {
    AlgRandomDataGenerator gen = new AlgRandomDataGenerator();
    gen.setSeed(0);
    AlgVector v = gen.getVector(15);
    Instances insts = gen.getInstances(v, 6);
    Instance inst = v.getAsInstance(insts, new Random(0));
    assertNotNull(inst);
    assertEquals(inst.numAttributes(), insts.numAttributes());
  }
}