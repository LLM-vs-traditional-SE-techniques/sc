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


public class CodexTest_0_6_94 { 
  @Test
     public void testAdd() {
    int n = 3;
    AlgVector v1 = new AlgVector(n);
    AlgVector v2 = new AlgVector(n);
    for(int i = 0; i < n; i++) {
      v1.m_Elements[i] = i;
      v2.m_Elements[i] = 2*i;
    }
    AlgVector v = v1.add(v2);
    for(int i = 0; i < n; i++) {
      assertEquals((i+1) + ". element differs",
		   2*i+i, v.m_Elements[i]);
    }
  }
}