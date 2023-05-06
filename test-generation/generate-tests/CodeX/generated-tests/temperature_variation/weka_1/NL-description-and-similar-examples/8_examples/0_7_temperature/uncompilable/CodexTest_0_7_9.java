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


public class CodexTest_0_7_9 { 
  @Test
  public void testAdd() {
    int n = 7;
    AlgVector a = new AlgVector(n);
    AlgVector b = new AlgVector(n);
    for (int i = 0; i < n; i++) {
      double x = i + 1;
      a.m_Elements[i] = x;
      b.m_Elements[i] = x * x;
    }
     AlgVector c = a.add(b);
    for (int i = 0; i < n; i++) {
      double x = i + 1;
      assertEquals((x * x) + x, c.m_Elements[i]);
    }
  }
}