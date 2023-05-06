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


public class CodexTest_0_5_56 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances inst = new Instances(new StringReader(
						      "Relation test\n" +
						      "  NumAttributes=2\n" +
						      "  NumInstances=0\n" +
						      "  \n" +
						      "  Attribute att1 numeric\n" +
						      "  Attribute att2 {val1, val2, val3}\n" +
						      "  \n" +
						      "  Data\n"));
      double[] values = {1.0, 2.0, 3.0};
      AlgVector av = new AlgVector(values);
      Instance instA = av.getAsInstance(inst, new Random(1));
      assertEquals("Wrong value for attribute 1", 1.0, instA.value(0), 1e-6);
      assertEquals("Wrong value for attribute 2", 1.0, instA.value(1), 1e-6);
      Instance instB = av.getAsInstance(inst, new Random(2));
      assertEquals("Wrong value for attribute 1", 2.0, instB.value(0), 1e-6);
      assertEquals("Wrong value for attribute 2", 0.0, instB.value(1), 1e-6);
      Instance instC = av.getAsInstance(inst, new Random(3));
      assertEquals("Wrong value for attribute 1", 3.0, instC.value(0), 1e-6);
      assertEquals("Wrong value for attribute 2", 2.0, instC.value(1), 1e-6);
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}