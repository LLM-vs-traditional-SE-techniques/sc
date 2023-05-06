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


public class CodexTest_0_3_6 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(new double[]{1.0, 2.0});
      Instances model = new Instances(new BufferedReader(new StringReader(
									  "@relation test\n"
									  + "@attribute a numeric\n"
									  + "@attribute b numeric\n"
									  + "@attribute c {0,1}\n"
									  + "@data\n")));
      model.setClassIndex(2);
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Wrong number of attributes", 3, inst.numAttributes());
      assertEquals("Wrong value for attribute a", 1.0, inst.value(0));
      assertEquals("Wrong value for attribute b", 2.0, inst.value(1));
      assertEquals("Wrong value for attribute c", 0, inst.value(2));
    } catch (Exception e) {
      fail("Exception thrown: " + e.toString());
    }
  }
}