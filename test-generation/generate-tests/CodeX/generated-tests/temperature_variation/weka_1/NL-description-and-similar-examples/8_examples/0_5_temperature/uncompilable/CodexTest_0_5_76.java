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


public class CodexTest_0_5_76 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(5);
    for(int i = 0; i < 5; i++) {
      a.m_Elements[i] = i;
    }
    AlgVector b = new AlgVector(5);
    for(int i = 0; i < 5; i++) {
      b.m_Elements[i] = 10 - i;
    }
    AlgVector c = a.add(b);
    for(int i = 0; i < 5; i++) {
      assertEquals("Element " + i + " differs", 10, c.m_Elements[i]);
    }
  }
}