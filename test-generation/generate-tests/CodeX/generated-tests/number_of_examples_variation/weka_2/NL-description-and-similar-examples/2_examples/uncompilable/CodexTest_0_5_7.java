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


public class CodexTest_0_5_7 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances insts = new Instances(new BufferedReader(new StringReader(m_Instances)));
      AlgVector v = new AlgVector(insts.numAttributes());
      v.setElement(0, 1.0);
      v.setElement(1, 2.0);
      v.setElement(2, 3.0);
      v.setElement(3, 4.0);
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals("First attribute incorrect", 1.0, inst.value(0));
      assertEquals("Second attribute incorrect", 2.0, inst.value(1));
      assertEquals("Third attribute incorrect", 3.0, inst.value(2));
      assertEquals("Fourth attribute incorrect", 4.0, inst.value(3));
    }
    catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}