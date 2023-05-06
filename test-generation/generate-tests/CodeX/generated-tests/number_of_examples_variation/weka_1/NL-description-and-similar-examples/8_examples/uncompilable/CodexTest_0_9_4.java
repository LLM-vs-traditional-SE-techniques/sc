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


public class CodexTest_0_9_4 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(m_dArr);
    AlgVector v2 = new AlgVector(m_dArr);
    AlgVector v3 = v1.add(v2);
    for(int i = 0; i < m_dArr.length; i++) {
      assertEquals("Value differs", m_dArr[i] + m_dArr[i], v3.m_Elements[i]);
    }
  }
}