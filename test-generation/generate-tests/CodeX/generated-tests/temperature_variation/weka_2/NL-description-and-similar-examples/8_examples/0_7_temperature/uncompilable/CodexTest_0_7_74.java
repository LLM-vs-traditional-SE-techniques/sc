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


public class CodexTest_0_7_74 { 
  @Test
    public void testGetAsInstance() {
    
    DenseInstance i1 = new DenseInstance(4);
    i1.setDataset(m_Instances);
    i1.setValue(0, 1.0);
    i1.setValue(1, 0.0);
    i1.setValue(2, 1.0);
    i1.setValue(3, 1.0);
    Random r = new Random(1);
    Instance i2 = m_V1.getAsInstance(m_Instances, r);
    assertTrue("Instance 1 and 2 are not equal", i1.equals(i2));
  }

}