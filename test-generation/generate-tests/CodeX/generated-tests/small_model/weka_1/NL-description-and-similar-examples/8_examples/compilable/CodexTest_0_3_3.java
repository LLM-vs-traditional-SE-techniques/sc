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
        double[] data1 = {1, 2, 3, 4, 5, 6};
        double[] data2 = {2, 3, 4, 5, 6, 7};
        AlgVector v1 = new AlgVector(data1);
        AlgVector v2 = new AlgVector(data2);
        AlgVector res = v1.add(v2);
        assertEquals(v1.numElements(), res.numElements());
        for (int i = 0; i < v1.numElements(); i++) {
            assertEquals(data1[i] + data2[i], res.getElement(i));
        }
    }
}