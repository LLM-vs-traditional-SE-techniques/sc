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


public class CodexTest_0_3_1 { 
  @Test
    public void testGetAsInstance() {
    try {
      double[] values = {1.0, 2.0, 3.0};
      Instances insts = new Instances(new BufferedReader(new StringReader(
									       InstancesTest.irisHeader + InstancesTest.irisData)));
      AlgVector v = new AlgVector(values);
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals(inst.toString(), "1.0,2.0,3.0,Iris-setosa");
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }

}