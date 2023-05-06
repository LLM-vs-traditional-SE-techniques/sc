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


public class CodexTest_0_3_4 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(2);
    a.m_Elements[0] = 1.0;
    a.m_Elements[1] = 2.0;
    AlgVector b = new AlgVector(2);
    b.m_Elements[0] = 3.0;
    b.m_Elements[1] = 4.0;
    AlgVector c = a.add(b);
    assertEquals(4.0, c.m_Elements[0], 0.0);
    assertEquals(6.0, c.m_Elements[1], 0.0);
  }
}