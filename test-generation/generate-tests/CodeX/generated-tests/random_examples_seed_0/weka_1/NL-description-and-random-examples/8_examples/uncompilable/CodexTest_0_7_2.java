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


public class CodexTest_0_7_2 { 
  @Test
    public void testAdd() {
      AlgVector v1 = new AlgVector(2);
    v1.m_Elements[0] = 1;
    v1.m_Elements[1] = 2;
    AlgVector v2 = new AlgVector(2);
    v2.m_Elements[0] = 3;
    v2.m_Elements[1] = 4;
    v1.add(v2);
    assertEquals(v1.m_Elements[0], 4, 0.0);
    assertEquals(v1.m_Elements[1], 6, 0.0);
    }
}