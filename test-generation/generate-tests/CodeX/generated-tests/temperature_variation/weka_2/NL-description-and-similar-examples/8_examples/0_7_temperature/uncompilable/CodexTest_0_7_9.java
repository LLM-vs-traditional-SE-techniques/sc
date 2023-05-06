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


public class CodexTest_0_7_9 { 
  @Test
  public void testGetAsInstance() {
    Test test = new Test();
    try {
      test.setUp();
    } catch (Exception e) {
      e.printStackTrace();
    }
    Random random = new Random();
    Instances instances = test.getInst();
    AlgVector alg = new AlgVector(new double[]{1, 2, 3});
    Instance instance = null;
    try {
      instance = alg.getAsInstance(instances, random);
    } catch (Exception e) {
      e.printStackTrace();
    }
    assertTrue(instance.toString().equals("1,2,3,0"));
  }
}