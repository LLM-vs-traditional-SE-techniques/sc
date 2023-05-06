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


public class CodexTest_0_5_7 { 
  @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(2);
        v1.m_Elements[0] = 1;
        v1.m_Elements[1] = 2;
        AlgVector v2 = new AlgVector(2);
        v2.m_Elements[0] = 10;
        v2.m_Elements[1] = 20;
        AlgVector v3 = v1.add(v2);
        Assert.assertEquals(v3.m_Elements[0], 11, 1.0e-12);
        Assert.assertEquals(v3.m_Elements[1], 22, 1.0e-12);
    }
}