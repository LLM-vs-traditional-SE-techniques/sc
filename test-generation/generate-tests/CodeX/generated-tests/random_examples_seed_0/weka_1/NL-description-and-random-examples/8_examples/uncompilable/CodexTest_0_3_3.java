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


public class CodexTest_0_3_3 { 
  @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(3);
        v1.m_Elements[0] = 1;
        v1.m_Elements[1] = 2;
        v1.m_Elements[2] = 3;
        AlgVector v2 = new AlgVector(3);
        v2.m_Elements[0] = 1;
        v2.m_Elements[1] = 2;
        v2.m_Elements[2] = 3;
        AlgVector v3 = v1.add(v2);
        Assert.assertEquals(2, v3.m_Elements[0], 1.0e-12);
        Assert.assertEquals(4, v3.m_Elements[1], 1.0e-12);
        Assert.assertEquals(6, v3.m_Elements[2], 1.0e-12);
    }
}