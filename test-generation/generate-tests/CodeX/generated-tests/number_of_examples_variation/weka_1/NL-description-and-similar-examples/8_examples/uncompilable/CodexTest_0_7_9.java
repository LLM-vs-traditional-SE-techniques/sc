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


public class CodexTest_0_7_9 { 
    @Test
    public void testAddVectors() {
        // initialize vector with values
        double[] values1 = {1, 2, 3, 4, 5};
        double[] values2 = {6, 7, 8, 9, 10};
        AlgVector vector1 = new AlgVector(values1);
        AlgVector vector2 = new AlgVector(values2);
}