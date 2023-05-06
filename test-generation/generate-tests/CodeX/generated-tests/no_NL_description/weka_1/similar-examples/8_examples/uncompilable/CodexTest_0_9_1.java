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


public class CodexTest_0_9_1 { 
  @Test
          public void testSub() {
              double[] data = {1.5, 0.5, 4.5};
              double[] otherdata = {2.3, 1.2, 5.0};
              AlgVector v = new AlgVector(data);
              AlgVector vother = new AlgVector(otherdata);
              AlgVector vres = new AlgVector(data);
              for(int i = 0; i < data.length; i++) {
                  vres.setElement(i,data[i] - otherdata[i]);
              }
              assertEquals(v.sub(vother),vres);
          }
}