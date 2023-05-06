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


public class CodexTest_0_8_29 { 
     @Test
     public void testAddition() {
         double[] data = {2, 3, 4, 5};
         AlgVector v = new AlgVector(data);
         AlgVector v1 = new AlgVector(data);
         AlgVector sum = v.add(v1);
         double[] expected = {4, 6, 8, 10};
         AlgVector expectedVector = new AlgVector(expected);
         assertEquals(expectedVector, sum);
     }
}