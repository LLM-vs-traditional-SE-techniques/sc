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
  public void testAdd() {
        double elements[] = {1, 1, 1, 1, 1};
        AlgVector vec1 = new AlgVector(elements);
        AlgVector vec2 = new AlgVector(elements);
        AlgVector vecSum = new AlgVector(elements);
        vecSum = vecSum.add(vec1);
        AlgVector vec3 = new AlgVector(5);
        assertEquals("Add",vecSum.m_Elements[0], 2, 1e-8);
        assertEquals("Add",vecSum.m_Elements[1], 2, 1e-8);
        assertEquals("Add",vecSum.m_Elements[2], 2, 1e-8);
        assertEquals("Add",vecSum.m_Elements[3], 2, 1e-8);
        assertEquals("Add",vecSum.m_Elements[4], 2, 1e-8);
    }
}