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


public class CodexTest_0_7_90 { 
  @Test
  public static AlgVector add(AlgVector a, AlgVector b) {
    int n = (a == null ? 0 : a.numElements());
    int m = (b == null ? 0 : b.numElements());
    int p = Math.max(n,m);
    if (p > 0) {
      AlgVector c = new AlgVector(p);
      if (n > 0) {
	for (int i = 0; i < n; i++) {
	  c.m_Elements[i] = a.m_Elements[i];
	}
      }
      if (m > 0) {
	for (int i = 0; i < m; i++) {
	  c.m_Elements[i] += b.m_Elements[i];
	}
      }
      return c;
    }
    return null;
  }
}