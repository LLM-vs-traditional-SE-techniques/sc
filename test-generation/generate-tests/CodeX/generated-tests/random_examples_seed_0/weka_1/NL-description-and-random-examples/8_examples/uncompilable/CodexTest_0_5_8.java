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


public class CodexTest_0_5_8 { 
  @Test
    public void testAdd() throws Exception {
		AlgVector a = new AlgVector(3);
		AlgVector b = new AlgVector(3);
		AlgVector c = null;
		a.m_Elements[0] = 1;
		a.m_Elements[1] = 1;
		a.m_Elements[2] = 1;
		b.m_Elements[0] = 1;
		b.m_Elements[1] = 1;
		b.m_Elements[2] = 1;
		c = a.add(b);
		assertEquals(c.m_Elements[0], 2.0, 0);
		assertEquals(c.m_Elements[1], 2.0, 0);
		assertEquals(c.m_Elements[2], 2.0, 0);
	}
}