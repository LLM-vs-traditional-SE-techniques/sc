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


public class CodexTest_0_2_1 { 
  @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(3);
        v1.m_Elements[0] = 1;
        v1.m_Elements[1] = 2;
        v1.m_Elements[2] = 3;
        AlgVector v2 = new AlgVector(3);
        v2.m_Elements[0] = 4;
        v2.m_Elements[1] = 5;
        v2.m_Elements[2] = 6;
        AlgVector v3 = v1.add(v2);
        Assert.assertEquals(v3.m_Elements[0], 5, 1.0e-12);
        Assert.assertEquals(v3.m_Elements[1], 7, 1.0e-12);
        Assert.assertEquals(v3.m_Elements[2], 9, 1.0e-12);
    }
}