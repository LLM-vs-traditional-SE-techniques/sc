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


public class CodexTest_0_5_1 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(3);
    v1.m_Elements[0] = 1;
    v1.m_Elements[1] = 2;
    v1.m_Elements[2] = 3;
    AlgVector v2 = new AlgVector(3);
    v2.m_Elements[0] = 0.5;
    v2.m_Elements[1] = 4.2;
    v2.m_Elements[2] = -3.1;
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", v1.numElements(), v3.numElements());
    assertEquals("1. value differs", 1.5, v3.getElement(0));
    assertEquals("2. value differs", 6.2, v3.getElement(1));
    assertEquals("3. value differs", -0.1, v3.getElement(2));
  }
}