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


public class CodexTest_0_8_4 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(l);
	
    for (int i = 0; i < l; i++) {
      v.m_Elements[i] = (double)(i+1);
    }
    for (int i = 0; i < l; i++) {
      assertEquals(i+1, v.m_Elements[i], 1e-10);
    }
  }
}