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


public class CodexTest_0_8_9 { 
  @Test
      public void testAdd() {
	AlgVector v = new AlgVector(2);
	v.setElement(0, 1.);
	v.setElement(1, 1.);
	AlgVector v2 = new AlgVector(2);
	v2.setElement(0, 1.);
	v2.setElement(1, 1.);
	AlgVector v3 = v2.add(v);
	assertTrue(v3.getElement(0) == 2.);
	assertTrue(v3.getElement(1) == 2.);
      }
}