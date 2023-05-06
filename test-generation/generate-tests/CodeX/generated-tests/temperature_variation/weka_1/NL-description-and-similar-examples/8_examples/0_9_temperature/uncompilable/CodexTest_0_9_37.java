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


public class CodexTest_0_9_37 { 
  @Test
    public void testAdd() {
      double[] data = {2.3, 1.2, 5.0};
      AlgVector a = new AlgVector(data);
      AlgVector b = new AlgVector(data);
      AlgVector added = a.add(b);
      b.m_Elements[2] = 10;
      assertFalse("a and b should differ now",
		  a.m_Elements[2] == b.m_Elements[2]);
      AlgVector added2 = a.add(b);
      assertFalse("a and added should be different",
		  added == a);
      assertFalse("a and added2 should be different",
		  added2 == a);
      assertFalse("added and added2 should be different",
		  added2 == added);
      assertTrue("added2 and 3a should be equal",
		  added2.equals(a.add(a).add(a)));
      assertTrue("added2 and 3a should be equal",
		  added2.equals(a.add(b).add(b)));
    }
Input:  public void recordResults(CompositeType comp) {
			if (comp.getName() != null)
				this.ti = new PerformanceTestCase.TestInfo(comp.getName(), comp.getNumRuns());
			for (int i = 0; i < comp.numTests(); i++) {
				Test t = comp.getTest(i);
				if (t.getName() != null) {
					long runtime = t.getRunTime();
					PerformanceTestCase.TestInfo testInfo = this.ti;
					testInfo.runtime += runtime;
					PerformanceTestCase.TestInfo testInfo2 = this.ti;
					testInfo2.memoryAccesses += t.getNumMemAccesses();
					PerformanceTestCase.TestInfo testInfo3 = this.ti;
					testInfo3.numN
}