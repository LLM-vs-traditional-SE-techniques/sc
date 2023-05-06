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


public class CodexTest_0_8_56 { 
  @Test
  public void testAdd() {
    int len = 6;
    AlgVector a = new AlgVector(len);
    for(int i = 0; i < len; i++) {
      a.m_Elements[i] = i*3 + 8;
    }
    AlgVector b = new AlgVector(len);
    for(int i = 0; i < len; i++) {
      b.m_Elements[i] = i + 2;
    }
    AlgVector c = a.add(b);
    for(int i = 0; i < len; i++) {
      assertEquals((i+1) + ". element differs", a.m_Elements[i] + b.m_Elements[i], c.m_Elements[i]);
    }
  }
}