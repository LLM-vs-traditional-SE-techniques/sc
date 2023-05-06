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


public class CodexTest_0_6_90 { 
  @Test
  /**
   * Tests whether the instance is compatible with the given dataset.
   */
  public void testIsCompatibleWith() {
    Instances data = new Instances(m_Instances, 0);
    data.setClassIndex(1);
    Instance instance = new Instance(1.0, data.numAttributes());
    instance.setDataset(data);
    assertTrue(data.checkInstance(instance));
    instance.setDataset(m_Instances);
    assertTrue(data.checkInstance(instance));
    instance.setDataset(null);
    assertFalse(data.checkInstance(instance));
    data = new Instances(m_Instances, 0);
    data.setClassIndex(0);
    instance.setDataset(data);
    assertFalse(data.checkInstance(instance));
    instance.setDataset(m_Instances);
    assertFalse(data.checkInstance(instance));
    data = new Instances(m_Instances, 0);
    instance.setDataset(data);
    assertFalse(data.checkInstance(instance));
  }
}