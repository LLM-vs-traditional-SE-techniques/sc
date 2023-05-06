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


public class CodexTest_0_5_74 { 
  @Test
    public void testGetAsInstance() {
    Instances data = new Instances(m_Instances, 0);
    AlgVector v1 = new AlgVector(m_Instances.numAttributes());
    AlgVector v2 = new AlgVector(m_Instances.numAttributes());
    for (int i = 0; i < m_Instances.numInstances(); i++) {
      v1.setTo(m_Instances.instance(i));
      v2.setTo(v1.getAsInstance(data, new Random(1)));
      assertEquals("Instance " + (i+1) + " differs",
		   v1.getAsString(), v2.getAsString());
    }
  }
}