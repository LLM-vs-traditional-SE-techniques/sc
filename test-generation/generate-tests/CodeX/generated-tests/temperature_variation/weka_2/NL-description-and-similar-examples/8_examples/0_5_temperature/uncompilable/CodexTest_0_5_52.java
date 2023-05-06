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


public class CodexTest_0_5_52 { 
  @Test
  public void testGetAsInstance() {
    try {
      int numAtt = 4;
      Instances inst = new Instances(new BufferedReader(new StringReader(
									 InstancesTest.instancesData)), 0);
      inst.setClassIndex(3);
      AlgVector v = new AlgVector(inst.numAttributes());
      Instance newInst = v.getAsInstance(inst, new Random());
      assertEquals(numAtt, newInst.numAttributes());
      assertEquals(inst.classIndex(), newInst.classIndex());
      assertEquals(inst.classAttribute(), newInst.classAttribute());
    } catch (Exception ex) {
      fail("Exception thrown.");
    }
  }
}