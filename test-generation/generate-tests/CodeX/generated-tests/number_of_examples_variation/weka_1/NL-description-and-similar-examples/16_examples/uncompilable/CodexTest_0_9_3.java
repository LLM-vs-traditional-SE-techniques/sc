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


public class CodexTest_0_9_3 { 
  @Test
    public void testAdd() throws Exception {
    AlgVector a = new AlgVector(7);
    a.m_Elements[0] = 3.2;
    a.m_Elements[1] = -1.7;
    a.m_Elements[2] = -2.1;
       AlgVector b = new AlgVector(7);
        b.m_Elements[0] = -0.7;
       b.m_Elements[1] = 12.32;
       b.m_Elements[2] = 9.9;
       AlgVector v = a.add(b);
      assertEquals(a.m_Elements[0] + b.m_Elements[0], v.m_Elements[0], 1e-6);
      assertEquals(a.m_Elements[1] + b.m_Elements[1], v.m_Elements[1], 1e-6);
      assertEquals(a.m_Elements[2] + b.m_Elements[2], v.m_Elements[2], 1e-6);
  }
}