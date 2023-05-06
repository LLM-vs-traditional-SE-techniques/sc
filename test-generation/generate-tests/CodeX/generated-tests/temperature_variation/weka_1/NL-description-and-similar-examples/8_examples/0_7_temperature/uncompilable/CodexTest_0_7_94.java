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


public class CodexTest_0_7_94 { 
  @Test
    public void testAdd() {
    final int size = 7;
    final double[] data = {1,2,3,4,5,6,7};
    AlgVector v = new AlgVector(size);
    AlgVector w = new AlgVector(size);
    for (int i = 0; i < size; i++) {
        v.setElement(i, data[i]);
        w.setElement(i, data[size - i - 1]);
    }
    AlgVector x = v.add(w);
    for (int i = 0; i < size; i++) {
        assertEquals("i: " + i, 2 * data[i], x.getElement(i), EPS);
    }
}
}