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


public class CodexTest_0_8_4 { 
    @Test
    public void test_add_1_1_1() {
        AlgVector a = new AlgVector(1, 1);
        AlgVector b = new AlgVector(1, 1);
        AlgVector expected = new AlgVector(new double[]{2});
        AlgVector actual = a.add(b);
        assertEquals(expected, actual);
    }
}