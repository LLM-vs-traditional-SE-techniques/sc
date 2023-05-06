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


public class CodexTest_0_6_17 { 
  @Test
    public void testGetAsInstance() {
    Instance inst = null;
    try {
      inst = m_Classifier.getAsInstance(m_Data, new Random(1));
    } catch (Exception ex) {
      fail("Error during getAsInstance: " + ex.getMessage());
    }
    assertEquals("Number of attributes differ", m_Data.numAttributes(), inst.numAttributes());
    assertEquals("Number of classes differ", m_Data.numClasses(), inst.numClasses());
    assertEquals("Number of values differ", m_Data.numValues(), inst.numValues());
    assertEquals("Class index differs", m_Data.classIndex(), inst.classIndex());
    assertEquals("Missing value differs", m_Data.hasMissingValue(), inst.hasMissingValue());
    assertEquals("Missing value differs", m_Data.isMissing(m_Data.classIndex()), inst.isMissing(m_Data.classIndex()));
    assertEquals("Class value differs", m_Data.classValue(), inst.classValue());
    assertEquals("Class is missing differs", m_Data.classIsMissing(), inst.classIsMissing());
    assertEquals("Instance weight differs", m_Data.weight(), inst.weight());
    assertEquals("Instance value differs", m_Data.value(0), inst.value(0));
    assertEquals("Instance value differs", m_Data.valueSparse(0), inst.valueSparse(0));
    assertEquals("Instance value differs", m_Data.value(1), inst.value(1));
    assertEquals("Instance value differs", m_Data.valueSparse(1), inst.valueSparse(1));
    assertEquals("Instance value differs", m_Data.value(2), inst.value(2));
    assertEquals("Instance value differs", m_Data.valueSparse(2), inst.valueSparse(2));
    assertEquals("Instance value differs", m_Data.value(3), inst.value(3));
    assertEquals("Instance value differs", m_Data.valueSparse(3), inst.valueSparse(
}