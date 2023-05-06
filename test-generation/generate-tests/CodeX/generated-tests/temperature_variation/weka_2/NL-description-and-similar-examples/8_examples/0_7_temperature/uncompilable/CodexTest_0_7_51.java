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


public class CodexTest_0_7_51 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(m_Instances, 0);
    Random rand = new Random(0);
    try {
      Instance i = m_AlgVector.getAsInstance(model, rand);
      assertEquals(3, i.numAttributes());
      assertEquals(1.0, i.value(0), 0.001);
      assertEquals(2.0, i.value(1), 0.001);
      assertEquals(3.0, i.value(2), 0.001);
    } catch (Exception e) {
      fail("Problem: " + e.toString());
    }
  }
}