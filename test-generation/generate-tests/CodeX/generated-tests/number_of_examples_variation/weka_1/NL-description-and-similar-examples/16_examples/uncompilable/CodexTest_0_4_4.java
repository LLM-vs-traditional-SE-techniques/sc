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


public class CodexTest_0_4_4 { 
  @Test
    public void testAdd() {
    AlgVector v = new AlgVector(3);
    v.m_Elements[0] = 1;
    v.m_Elements[1] = 2;
    v.m_Elements[2] = 3;
    AlgVector w = new AlgVector(3);
    w.m_Elements[0] = 0;
    w.m_Elements[1] = -1;
    w.m_Elements[2] = 0;
    AlgVector x = v.add(w);
    assertEquals(1, x.m_Elements[0], 1.0e-12);
    assertEquals(1, x.m_Elements[1], 1.0e-12);
    assertEquals(3, x.m_Elements[2], 1.0e-12);
  }
}