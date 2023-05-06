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


public class CodexTest_0_6_66 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    AlgVector w = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v.m_Elements[i] = i;
      w.m_Elements[i] = i + len;
    }
    AlgVector u = v.add(w);
    assertEquals("Length differs", len, u.numElements());
    for (int i = 0; i < len; i++) {
      assertEquals((i+1) + ". element differs", i+i+len, u.m_Elements[i]);
    }
  }
}