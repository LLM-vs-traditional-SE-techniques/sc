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


public class CodexTest_0_7_63 { 
     @Test
     public void testAdd() {
         AlgVector o1 = new AlgVector(3);
         o1.m_Elements[0] = 0.1;
         o1.m_Elements[1] = 0.2;
         o1.m_Elements[2] = 0.3;
         AlgVector o2 = new AlgVector(3);
         o2.m_Elements[0] = 0.4;
         o2.m_Elements[1] = 0.5;
         o2.m_Elements[2] = 0.6;
         AlgVector result = o1.add(o2);
         assertEquals(0.5, result.m_Elements[0], 1e-9);
         assertEquals(0.7, result.m_Elements[1], 1e-9);
         assertEquals(0.9, result.m_Elements[2], 1e-9);
     }
}