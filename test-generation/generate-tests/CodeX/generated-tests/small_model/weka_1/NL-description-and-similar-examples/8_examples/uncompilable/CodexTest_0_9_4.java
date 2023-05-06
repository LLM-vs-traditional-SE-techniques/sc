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


public class CodexTest_0_9_4 { 
    @Test
    public void testAddOperator() {
        assertEquals(1.0, m_Elements[0]);
        assertEquals(2.0, m_Elements[1]);
        AlgVector second = new AlgVector(1.0, 2.0);
        m_Elements = m_Elements.add(second);
}