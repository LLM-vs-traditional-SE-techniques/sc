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


public class CodexTest_0_8_2 { 
    @Test
    public void testClone() {
        try {
            AlgVector v1 = new AlgVector(1);
            v1.m_Elements[0] = 1;
            AlgVector v2 = v1.clone();
            v2.m_Elements[0] = 2;
            assertEquals(1, v1.m_Elements[0], 0.0);
            assertEquals(2, v2.m_Elements[0], 0.0);
        } catch (CloneNotSupportedException ex) {
            fail("cloning failed");
        }
    }
}