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


public class CodexTest_0_6_3 { 
  @Test
    public void testGetAsInstance() throws Exception {
    AlgVector v = new AlgVector(m_Data);
    Instances dataSet = new Instances(m_Instances, 0);
    Instance inst = v.getAsInstance(dataSet, m_Random);
    assertEquals("Wrong number of attributes!", m_Data.length, inst.numAttributes());
    assertEquals("Wrong number of values!", m_Data.length, inst.numValues());
    for (int i = 0; i < m_Data.length; i++)
      assertEquals((i+1) + ". value differs", m_Data[i], inst.value(i));
  }
}