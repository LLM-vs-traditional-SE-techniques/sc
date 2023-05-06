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


public class CodexTest_0_9_6 { 
  @Test
   public void testAdd() {
        double[] aData = {
                1, 2, 3
        };
        double[] bData = {
                4, 5, 6
        };
        double[] eData = {
                5, 7, 9
        };
        AlgVector a = new AlgVector(aData);
        AlgVector b = new AlgVector(bData);
        AlgVector expected = new AlgVector(eData);
        AlgVector e = (AlgVector) a.add(b);
        assertEquals("Result does not match: ", expected, e);
    }
}