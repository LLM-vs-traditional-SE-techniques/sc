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


public class CodexTest_0_9_54 { 
  @Test
   public void testAdd() {
	  int n = 22;
    AlgVector v1 = new AlgVector(n);
    AlgVector v2 = new AlgVector(n);
    for (int ii = 0; ii < n; ii++) {
      v1.m_Elements[ii] = Math.random() * 10;
      v2.m_Elements[ii] = Math.random() * 10;
    }
    AlgVector v3 = v1.add(v2);
    for (int ii = 0; ii < n; ii++) {
      assertEquals((ii+1) + "th element in vector differs", v1.m_Elements[ii] + v2.m_Elements[ii], v3.m_Elements[ii]);
    }
  }
}