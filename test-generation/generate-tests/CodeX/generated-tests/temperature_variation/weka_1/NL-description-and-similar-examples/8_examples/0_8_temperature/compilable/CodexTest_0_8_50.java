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


public class CodexTest_0_8_50 { 
  @Test
      public void testAddNegative() {
	AlgVector v = new AlgVector(2);
	v.setElement(0, 1.2); v.setElement(1, 2.3);
	AlgVector w = new AlgVector(2);
	w.setElement(0, 2.2); w.setElement(1, 5.1);
	AlgVector z = v.add(w);
	assertEquals("z(0) differs", z.getElement(0), v.getElement(0) + w.getElement(0));
	assertEquals("z(1) differs", z.getElement(1), v.getElement(1) + w.getElement(1));
      }
}