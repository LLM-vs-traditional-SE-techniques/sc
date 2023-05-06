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


public class CodexTest_0_5_8 { 
  @Test
    public AlgVector add(AlgVector other) {
        AlgVector b = null;
        if (m_Elements != null) {
            int n = m_Elements.length;
            b = new AlgVector(n);
            for(int i = 0; i < n; i++) {
                b.m_Elements[i] = m_Elements[i] + other.m_Elements[i];
            }
        }
        return b;
    }
}