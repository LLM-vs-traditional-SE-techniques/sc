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


public class CodexTest_0_7_10 { 
  @Test
    public void testGetAsInstance() {
    m_Elements = new double[5];
    for (int i = 0; i < m_Elements.length; i++) {
      m_Elements[i] = 1.0 * i;
    }
    AlgVector algVector = new AlgVector(m_Elements);
    Instances model = new Instances(new DenseInstance(5), 10);
    model.setClassIndex(4);
    model.insertAttributeAt(new Attribute("test"), 0);
    model.insertAttributeAt(new Attribute("test2", (FastVector) null), 0);
    model.insertAttributeAt(new Attribute("test3",(FastVector) null), 0);
    Instance instance = null;
    try {
      instance = algVector.getAsInstance(model, new Random(1));
    } catch (Exception ex) {
      fail("Exception occured: " + ex);
    }
    assertEquals("wrong num attributes", 5, instance.numAttributes());
    assertEquals("wrong value", 3.0, instance.value(0));
    assertEquals("wrong value", 4.0, instance.value(1));
  }
}