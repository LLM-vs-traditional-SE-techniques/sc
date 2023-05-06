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


public class CodexTest_0_6_25 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(7);
    v1.m_Elements[0] = 2.1;
    v1.m_Elements[1] = 1.2;
    v1.m_Elements[2] = 4.2;
    v1.m_Elements[3] = 0.0;
    v1.m_Elements[4] = -3.3;
    v1.m_Elements[5] = -1.1;
    v1.m_Elements[6] = 2.9;
    AlgVector v2 = new AlgVector(7);
    v2.m_Elements[0] = -2.0;
    v2.m_Elements[1] = -0.1;
    v2.m_Elements[2] = 4.0;
    v2.m_Elements[3] = 0.1;
    v2.m_Elements[4] = 3.7;
    v2.m_Elements[5] = -2.2;
    v2.m_Elements[6] = 1.1;
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", 7, v3.numElements());
    assertEquals("1. value differs", 0.1, v3.getElement(0), 0.0001);
    assertEquals("2. value differs", 1.1, v3.getElement(1), 0.0001);
    assertEquals("3. value differs", 8.2, v3.getElement(2), 0.0001);
    assertEquals("4. value differs", 0.1, v3.getElement(3), 0.0001);
    assertEquals("5. value differs", 0.4, v3.getElement(4), 0.0001);
    assertEquals("6. value differs", -3.3, v3.getElement(5), 0.0001);
    assertEquals("7. value differs", 4.0, v3.getElement(6),
}