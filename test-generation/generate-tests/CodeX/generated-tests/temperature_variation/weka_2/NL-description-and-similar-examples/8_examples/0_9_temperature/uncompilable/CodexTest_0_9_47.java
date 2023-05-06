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


public class CodexTest_0_9_47 { 
  @Test
  public void testLikeWithOneCoreAttr() {
    double[] v = new double[] {2.3, -5.5, 1.2};
    AlgVector vec = new AlgVector(v);
    AlgVector vec2 = (AlgVector) vec.like();
    assertEquals("length differs", v.length, vec2.m_Elements.length);
    for (int i = 0; i < vec2.m_Elements.length; i++)
      assertEquals("values differs", v[i], vec2.m_Elements[i]);
  }
}