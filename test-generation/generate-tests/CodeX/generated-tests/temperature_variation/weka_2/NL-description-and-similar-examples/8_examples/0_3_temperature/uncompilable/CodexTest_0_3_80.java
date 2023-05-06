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


public class CodexTest_0_3_80 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(m_Instances, 0);
    model.setClassIndex(model.numAttributes() - 1);
    assertEquals(m_Instances.numAttributes(), model.numAttributes());
    assertEquals(m_Instances.numInstances(), model.numInstances());
    assertEquals(m_Instances.numClasses(), model.numClasses());
    assertEquals(m_Instances.classIndex(), model.classIndex());
    assertEquals(m_Instances.classAttribute(), model.classAttribute());
    assertEquals(m_Instances.classAttribute().isNominal(), 
		 model.classAttribute().isNominal());
    assertEquals(m_Instances.classAttribute().isNumeric(), 
		 model.classAttribute().isNumeric());
    assertEquals(m_Instances.classAttribute().isString(), 
		 model.classAttribute().isString());
    assertEquals(m_Instances.classAttribute().isRelationValued(), 
		 model.classAttribute().isRelationValued());
    assertEquals(m_Instances.classAttribute().numValues(), 
		 model.classAttribute().numValues());
    assertEquals(m_Instances.classAttribute().value((int)m_Instances.instance(0).classValue()), 
		 model.classAttribute().value((int)m_Instances.instance(0).classValue()));
    assertEquals(m_Instances.classAttribute().value((int)m_Instances.instance(1).classValue()), 
		 model.classAttribute().value((int)m_Instances.instance(1).classValue()));
    assertEquals(m_Instances.classAttribute().value((int)m_Instances.instance(2).classValue()), 
		 model.classAttribute().value((int)m_Instances.instance(2).classValue()));
    assertEquals(m_Instances.classAttribute().value((int)m_Instances.instance(3).classValue()),
}