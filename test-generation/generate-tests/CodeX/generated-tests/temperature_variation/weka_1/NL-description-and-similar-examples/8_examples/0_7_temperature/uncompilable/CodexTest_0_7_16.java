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


public class CodexTest_0_7_16 { 
  @Test
  public void testAdd() {
    AlgVector b = new AlgVector(3);
    b.m_Elements[0] = 1;
    b.m_Elements[1] = 2;
    b.m_Elements[2] = 3;
    AlgVector c = new AlgVector(3);
    c.m_Elements[0] = 10;
    c.m_Elements[1] = 20;
    c.m_Elements[2] = 30;
    AlgVector d = b.add(c);
    assertEquals("Size differs", 3, d.numElements());
    assertEquals("1. Element differs", 11, d.getElement(0), 0.0);
    assertEquals("2. Element differs", 22, d.getElement(1), 0.0);
    assertEquals("3. Element differs", 33, d.getElement(2), 0.0);
  }
}