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


public class CodexTest_0_7_42 { 
  @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(1);
        AlgVector v2 = new AlgVector(1);
        v1.m_Elements = new double[] {1.0};
        v2.m_Elements = new double[] {2.0};
        AlgVector result = v1.add(v2);
        assertEquals(3.0, result.m_Elements[0], 0.0);
    }
}