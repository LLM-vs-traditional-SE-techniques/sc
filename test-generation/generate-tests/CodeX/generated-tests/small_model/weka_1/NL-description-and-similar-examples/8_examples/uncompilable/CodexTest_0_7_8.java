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


public class CodexTest_0_7_8 { 
  @Test
  public void testAdd() {
		DoubleMatrix2D m = DoubleFactory2D.dense.make(1, 2);
		m.setQuick(0, 0, 1.0);
		m.setQuick(0, 1, 2.0);
		assertEquals(m.getQuick(0, 0) + m.getQuick(0, 1), m.zSum());
		DoubleMatrix2D m2 = DoubleFactory2D.dense.make(1, 2);
		m2.set(0, 0, 1.0);
		m2.set(0, 1, 2.0);
		assertEquals(m2.get(0, 0) + m2.get(0, 1), m2.zSum());
	}
}