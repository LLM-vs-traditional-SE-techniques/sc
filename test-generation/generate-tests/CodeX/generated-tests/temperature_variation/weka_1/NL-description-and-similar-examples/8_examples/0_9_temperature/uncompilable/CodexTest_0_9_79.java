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


public class CodexTest_0_9_79 { 
  @Test
          public void testAdd() {
              AlgVector v = new AlgVector(4);
              double[] data = new double[4];
              for (int i = 0; i < data.length; i++) {
                  data[i] = Math.random();
                  v.setElement(i, data[i]);
              }
              AlgVector v2 = new AlgVector(4);
              double[] data2 = new double[4];
              for (int i = 0; i < data2.length; i++) {
                  data2[i] = Math.random();
                  v2.setElement(i, data2[i]);
              }
              AlgVector res = v.add(v2);
              for (int i = 0; i < data.length; i++)
            assertEquals(res.getElement(i), data[i]+data2[i], TestUtils.precision);
          }
}