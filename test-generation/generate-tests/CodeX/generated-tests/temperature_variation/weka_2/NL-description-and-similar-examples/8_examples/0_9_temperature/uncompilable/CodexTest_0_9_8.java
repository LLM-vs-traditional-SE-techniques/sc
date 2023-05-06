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


public class CodexTest_0_9_8 { 
  @Test
      /**
     * Tests if numValues is working.
     */
  public void testNumValues() {
    Instances inst = new Instances(this.m_Instances);
    m_Instances.setClassIndex(m_Instances.numAttributes() - 1);
    for (int i = 0; i < m_Instances.numAttributes(); i++) {
      if (m_Instances.classIndex() == i) {
	assertEquals("Test num values, class index",
		     m_Instances.attribute(i).numValues(),
		     m_Instances.numClasses());
      } else if (m_Instances.attribute(i).isNominal()) {
	assertEquals("Test num values, nominals",
		     m_Instances.attribute(i).numValues(),
		     m_Instances.attributeStats(i).nominalCounts.length);
      } else if (m_Instances.attribute(i).isString()) {
	assertEquals("Test num values, string",
		     1, m_Instances.attributeStats(i).nominalCounts.length);
      } else {
	assertEquals("Test num values, other",
		     0, m_Instances.attributeStats(i).nominalCounts.length);
      }
    }
  }
}