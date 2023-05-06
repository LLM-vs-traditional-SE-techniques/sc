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


public class CodexTest_0_6_2 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(2);
      v.setElement(0, 3.5);
      v.setElement(1, 5.1);
      Random random = new Random(1);
      Instances model = new Instances(new BufferedReader(new StringReader(instances)));
      Instance newInst = v.getAsInstance(model, random);
      assertEquals(3.5, newInst.value(0), 1.0e-6);
      assertEquals(5.1, newInst.value(1), 1.0e-6);
      assertEquals(1.0, newInst.value(2), 1.0e-6);
      assertEquals(2.0, newInst.value(3), 1.0e-6);
    } catch (Exception e) {
      fail();
    }
  }
}