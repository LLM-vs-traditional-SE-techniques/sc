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


public class CodexTest_0_6_2 { 
  @Test
  public void testInstance() {
    m_NominalP = new NominalPrediction(1, new double[2]);
    m_NominalP.distribution()[0] = 0.5;
    m_NominalP.distribution()[1] = 0.5;
    m_NumericP = new NumericPrediction(1, 0);
    m_StringP = new StringPrediction(1, "a string", 1);
    m_NoClassP = new NoClassPrediction(1);
    m_MissingP = new MissingPrediction(1, null);
    m_NominalP.addDistribution(1.0, "class 1");
    m_NominalP.addDistribution(2.0, "class 2");
    assertEquals(m_NominalP.distribution()[0], 0.5);
    assertEquals(m_NominalP.distribution()[1], 0.5);
    assertEquals(m_NominalP.distribution()[0], 0.5);
    assertEquals(m_NominalP.distribution()[1], 0.5);
    assertEquals(m_NominalP.predicted(), 1);
    assertEquals(m_NominalP.actual(), 1);
    assertEquals(m_NominalP.predicted(), 1);
    assertEquals(m_NominalP.actual(), 1);
    assertEquals(m_NominalP.numOutputAttributes(), 2);
    assertEquals(m_NominalP.numOutputAttributes(), 2);
    assertEquals(m_NominalP.numOutputAttributes(), 2);
    assertEquals(m_NominalP.numOutputAttributes(), 2);
    assertEquals(m_NominalP.numOutputAttributes(), 2);
    assertEquals(m_NominalP.numOutputAttributes(), 2);
    assertEquals(m_NominalP.numOutputAttributes(), 2);
    assertEquals(m_NominalP.numOutputAttributes(), 2);
    assertEquals
}