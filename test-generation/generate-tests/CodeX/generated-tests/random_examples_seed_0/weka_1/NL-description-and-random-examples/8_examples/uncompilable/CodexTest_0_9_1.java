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


public class CodexTest_0_9_1 { 
  @Test
  public void testAdd() {
		AlgVector a = new AlgVector(3);
		a.m_Elements[0] = 0.0;
		a.m_Elements[1] = 0.0;
		a.m_Elements[2] = 0.0;
		AlgVector b = new AlgVector(3);
		b.m_Elements[0] = 4.0;
		b.m_Elements[1] = 7.0;
		b.m_Elements[2] = 9.0;
		double expected[] = {4.0, 7.0, 9.0};
		AlgVector result = a.add(b);
		a.equals(result.m_Elements, expected);
	}
}