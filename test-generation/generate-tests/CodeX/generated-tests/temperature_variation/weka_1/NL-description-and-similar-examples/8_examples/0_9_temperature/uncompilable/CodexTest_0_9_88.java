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


public class CodexTest_0_9_88 { 
  @Test
  public void testSubtract()
  {
    Random random = new Random();
    double[] u = new double[3];
    double[] v = new double[3];
    for (int i = 0; i < 3; i++) {
      u[i] = random.nextDouble();
      v[i] = random.nextDouble();
    }
    AlgVector uVec = new AlgVector(u);
    AlgVector vVec = new AlgVector(v);
    AlgVector wVec = uVec.subtract(vVec);
    AlgVector wTestVec = new AlgVector(wVec);
    double[] w = new double[3];
    for (int i = 0; i < 3; i++) {
      w[i] = u[i] - v[i];
    }
    AlgVector wAnswer = new AlgVector(w);
    Assert.assertEquals(wAnswer, wTestVec);
  }
	
#### 16.4 Suggest a test for a method with the AlgVector subtract(AlgVector other) signature.	
}