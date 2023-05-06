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


public class CodexTest_0_9_2 { 
  @Test
  public void testadd() {
	int length = 3;
	AlgVector vec = new AlgVector(length);
	AlgVector vec2 = new AlgVector(length);
	double[] arr = {1, 2, 3};
	vec.init(arr[0], arr[2], arr[3])
	vec2.init(arr[1], arr[2], arr[3])
	AlgVector res = vec.add(vec2);
	assertEquals(res.m_Elements[1], vec2.m_Elements[1] + vec.m_Elements[1], TOLERANCE); 
	assertEquals(res.m_Elements[0], vec2.m_Elements[0] + vec.m_Elements[0], TOLERANCE);
	assertEquals(res.m_Elements[2], vec2.m_Elements[2] + vec.m_Elements[2], TOLERANCE);
  }
}