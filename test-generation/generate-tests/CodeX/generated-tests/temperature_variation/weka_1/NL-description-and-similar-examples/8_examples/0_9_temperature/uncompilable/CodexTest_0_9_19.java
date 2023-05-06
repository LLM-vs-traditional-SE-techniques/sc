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


public class CodexTest_0_9_19 { 
  @Test
   public void testDivideShouldSucceed() {
      Random rnd = new Random(3);
      for (int i = 0; i < ITERATIONS; i++) {
        double[] d = new double[1];
        d[0] = rnd.nextDouble();
        double[] e = new double[1];
        e[0] = rnd.nextDouble();
        DoubleVector dv = DoubleVector.fromArray(d);
        DoubleVector ev = DoubleVector.fromArray(e);
        DoubleVector dvRes = dv.divide(ev);
        double[] expectedArr = new double[1];
        expectedArr[0] = d[0] / e[0];
        assertArrayEquals("Single item", expectedArr, dvRes.toArray(), PRECISION);
      }
    }
}