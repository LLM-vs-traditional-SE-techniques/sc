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


public class CodexTest_0_6_76 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(m_Instances, 0);
    data.setClassIndex(data.numAttributes()-1);
    AlgVector v = new AlgVector(data.numAttributes()-1);
    for (int i = 0; i < data.numAttributes()-1; i++)
      v.setElement(i, i);
    try {
      Instance inst = v.getAsInstance(data, new Random(1));
      for (int i = 0; i < data.numAttributes()-1; i++)
	assertEquals((i+1) + ". value differs", i, inst.value(i));
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}