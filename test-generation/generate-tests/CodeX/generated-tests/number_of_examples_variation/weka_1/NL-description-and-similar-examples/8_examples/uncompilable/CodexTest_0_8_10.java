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


public class CodexTest_0_8_10 { 
  @Test
  /**
     * Performs the scalar multiplication of this vector by the given factor and
     * stores the result in the given new vector.
     * @param factor factor by which this vector is to be multiplied
     * @param result result vector
     * @return result vector with multiplied elements
     */
    public AlgVector scalarMultiply(double factor, AlgVector result) {
        result = result.clone();
        for (int i = 0; i < m_Elements.length; i++) {
            m_Elements[i] = factor * result.m_Elements[i];
        }
        return result;
    }
}