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


public class CodexTest_0_8_25 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    AlgVector v2 = new AlgVector(len);
    AlgVector v3 = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v.m_Elements[i] = i;
      v2.m_Elements[i] = len - i;
      v3.m_Elements[i] = v.m_Elements[i] + v2.m_Elements[i];
    }
    AlgVector v4 = v.add(v2);
    assertTrue("Length differs", v.numElements() == v4.numElements());
    for (int i = 0; i < len; i++) {
      assertTrue((i+1) + ". value differs", v3.m_Elements[i] == v4.m_Elements[i]);
    }
  }
}