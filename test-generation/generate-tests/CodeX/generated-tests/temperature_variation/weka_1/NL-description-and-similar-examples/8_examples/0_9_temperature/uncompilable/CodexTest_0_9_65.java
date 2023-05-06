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


public class CodexTest_0_9_65 { 
      @Test
      public void testAddition() {
	int n = m_V1.numElements();
	AlgVector v1 = m_V1.add(m_V2);
	assertEquals("Dimensions differ", n, v1.numElements());
	for (int i = 0; i < n; i++) {
	  assertEquals("Values differ", (double)(i+1) + (double)(i+2), v1.getElement(i));
	}
      }
}