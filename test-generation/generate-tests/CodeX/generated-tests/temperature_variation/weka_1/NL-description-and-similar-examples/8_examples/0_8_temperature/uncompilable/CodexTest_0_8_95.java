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


public class CodexTest_0_8_95 { 
  @Test
  public void testAdd() {
    int n = 20;
    AlgVector v1 = new AlgVector(n);
    AlgVector v2 = new AlgVector(n);
    AlgVector v3 = v1.add(v2);
    for (int i = 0; i < n; i++) {
      assertEquals(v2.getElement(i), v3.m_Elements[i]);
    }
  }
}