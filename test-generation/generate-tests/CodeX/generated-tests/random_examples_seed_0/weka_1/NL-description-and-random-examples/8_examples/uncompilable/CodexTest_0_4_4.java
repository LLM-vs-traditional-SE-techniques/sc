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


public class CodexTest_0_4_4 { 
  @Test
   public void testAdd() {
    AlgVector v1 = new AlgVector(1);
    AlgVector v2 = new AlgVector(1);
    v1.m_Elements[0] = 1;
    v2.m_Elements[0] = 2;
    AlgVector v3 = v1.add(v2);
    Assert.assertEquals(3, v3.m_Elements[0], 1.0e-12);
  }
}