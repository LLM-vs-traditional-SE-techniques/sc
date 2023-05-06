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


public class CodexTest_0_9_35 { 
  @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(5);
        AlgVector v2 = new AlgVector(5);
        AlgVector test = v1.add(v2);
        assertEquals(v1.m_Elements[0], test.m_Elements[0], 0);
        assertEquals(v1.m_Elements[1], test.m_Elements[1], 0);
        assertEquals(v1.m_Elements[2], test.m_Elements[2], 0);
        assertEquals(v1.m_Elements[3], test.m_Elements[3], 0);
        assertEquals(v1.m_Elements[4], test.m_Elements[4], 0);
}