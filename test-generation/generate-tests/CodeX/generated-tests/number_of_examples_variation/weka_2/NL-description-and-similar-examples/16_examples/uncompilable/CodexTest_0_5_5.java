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


public class CodexTest_0_5_5 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(m_Instances.toString())));
    model.setClassIndex(m_Instances.classIndex());
    AlgVector v = new AlgVector(new double[]{1.0, 2.0});
    try {
      Instance newInst = v.getAsInstance(model, new Random(1));
      assertEquals("Number of attributes differs", model.numAttributes(), newInst.numAttributes());
      assertEquals("Number of values differs", 2, newInst.numValues());
      assertEquals("Value 0 differs", 1.0, newInst.value(0));
      assertEquals("Value 1 differs", 2.0, newInst.value(1));
      assertEquals("Class index differs", model.classIndex(), newInst.classIndex());
      assertEquals("Class value differs", 0.0, newInst.classValue());
    } catch (Exception e) {
      fail("Exception: " + e);
    }
  }
}