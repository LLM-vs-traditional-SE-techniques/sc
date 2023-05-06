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


public class CodexTest_0_1_2 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances insts = new Instances(new BufferedReader(new StringReader(
									  InstancesTest.simpleData)));
      insts.setClassIndex(insts.numAttributes() - 1);
      AlgVector v = new AlgVector(insts.numAttributes());
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals(insts.numAttributes(), inst.numAttributes());
      assertEquals(insts.numClasses(), inst.numClasses());
      assertEquals(insts.classAttribute().value((int) inst.classValue()),
		   inst.classAttribute().value((int) inst.classValue()));
    } catch (Exception e) {
      fail("Problem with getAsInstance: " + e.getMessage());
    }
  }
}