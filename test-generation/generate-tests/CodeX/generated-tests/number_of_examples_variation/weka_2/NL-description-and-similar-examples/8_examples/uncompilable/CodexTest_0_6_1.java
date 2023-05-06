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


public class CodexTest_0_6_1 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances model = new Instances(m_Instances, 0);
    m_Filter.setInputFormat(model);
    model = Filter.useFilter(model, m_Filter);
    AlgVector algVector = new AlgVector(m_Instances.numAttributes());
    for (int i = 0; i < m_Instances.numAttributes(); i++)
      algVector.setElement(i, m_Instances.instance(0).value(i));
    Instance instance = algVector.getAsInstance(model, new Random(1));
    assertEquals("Wrong number of attributes", m_Instances.numAttributes(), instance.numAttributes());
    assertEquals("Wrong number of classes", m_Instances.numClasses(), instance.numClasses());
    assertEquals("Wrong class index", m_Instances.classIndex(), instance.classIndex());
    assertEquals("Wrong number of values", m_Instances.numAttributes(), instance.numValues());
    assertEquals("Wrong weight", m_Instances.instance(0).weight(), instance.weight());
    assertEquals("Wrong class value", m_Instances.instance(0).classValue(), instance.classValue());
    for (int i = 0; i < m_Instances.numAttributes(); i++)
      assertEquals("Wrong value for attribute " + (i+1), m_Instances.instance(0).value(i), instance.value(i));
    assertEquals("Wrong string representation", m_Instances.instance(0).toString(), instance.toString());
  }
}