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


public class CodexTest_0_6_1 { 
  @Test
    public void testAdd() {
    int len = 22;
    AlgVector a = new AlgVector(len);
    AlgVector b = new AlgVector(len);
    for (int i = 0; i < len; i++) {
	a.m_Elements[i] = i;
	b.m_Elements[i] = i;
    }
    AlgVector c = a.add(b);
    for (int i = 0; i < len; i++) {
	assertEquals(i + i, c.m_Elements[i]);
    }
  }
}