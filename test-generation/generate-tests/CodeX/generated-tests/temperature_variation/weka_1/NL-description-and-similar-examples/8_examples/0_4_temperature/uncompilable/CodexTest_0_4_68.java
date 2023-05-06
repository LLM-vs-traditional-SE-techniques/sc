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


public class CodexTest_0_4_68 { 
  @Test
  public void testAdd() {
    int n = 10;
    AlgVector v1 = new AlgVector(n);
    AlgVector v2 = new AlgVector(n);
    for(int i = 0; i < n; i++) {
      v1.m_Elements[i] = i;
      v2.m_Elements[i] = i;
    }
    AlgVector v3 = v1.add(v2);
    for(int i = 0; i < n; i++) {
      assertEquals("" + i + ". value differs", 2.0 * i, v3.m_Elements[i]);
    }
  }
}