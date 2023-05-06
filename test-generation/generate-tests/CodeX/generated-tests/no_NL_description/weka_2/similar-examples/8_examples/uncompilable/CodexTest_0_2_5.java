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


public class CodexTest_0_2_5 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(m_Instances, 0);
    model.setClassIndex(model.numAttributes() - 1);
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    Instance inst = v.getAsInstance(model, new Random(1));
    assertEquals("Number of attributes differ", model.numAttributes(), 
		 inst.numAttributes());
    assertEquals("Number of values differ", model.numAttributes(), 
		 inst.numValues());
    assertEquals("Class value differs", 0, (int) inst.classValue());
    assertEquals("1. value differs", 1.0, inst.value(0));
    assertEquals("2. value differs", 2.0, inst.value(1));
    assertEquals("3. value differs", 3.0, inst.value(2));
  }
}