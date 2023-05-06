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


public class CodexTest_0_9_8 { 
    @Test
    public void testGetAsInstance() {
        double[] values = new double[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = i + 1;
        }
        AlgVector vector = new AlgVector(values);
        Instance inst = vector.getAsInstance(m_Data, new Random(1));
        assertEquals("instance length differs", values.length, inst.numAttributes());
        assertEquals("instance class differs", Instance.class, inst.getClass());
        assertEquals("1. instance value differs", 1.0, inst.value(0), 0.0);
        assertEquals("2. instance value differs", 2.0, inst.value(1), 0.0);
        assertEquals("3. instance value differs", 3.0, inst.value(2), 0.0);
        assertEquals("4. instance value differs", 4.0, inst.value(3), 0.0);
        assertEquals("5. instance value differs", 5.0, inst.value(4), 0.0);
        assertEquals("6. instance value differs", 6.0, inst.value(5), 0.0);
        assertEquals("7. instance value differs", 7.0, inst.value(6), 0.0);
        assertEquals("8. instance value differs", 8.0, inst.value(7), 0.0);
        assertEquals("9. instance value differs", 9.0, inst.value(8), 0.0);
        assertEquals("10. instance value differs", 10.0, inst.value(9), 0.0);
    }
}