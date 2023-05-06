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


public class CodexTest_0_8_92 { 
  @Test
  public void addSubTest(int i, int j) {
    int n = 5;
    AlgVector a = new AlgVector(n);
    AlgVector b = new AlgVector(n);
    AlgVector c = new AlgVector(n);
    for(int k = 0; k < n; k++) {
      a.m_Elements[k] = i + k;
      b.m_Elements[k] = j + k;
    }
    c = c.add(a);
    c = c.subtract(b);
    for(int k = 0; k < n; k++) {
      assertEquals("Error in element " + k, (i - j), c.m_Elements[k]);
    }
  }
}