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


public class CodexTest_0_9_71 { 
  @Test
  public void testAdd() {
      double[] dataA = {1.2, 3.4, 5.6};
      double[] dataB = {2.2, 3.0, 4.1};
      AlgVector a = new AlgVector(dataA);
      AlgVector b = new AlgVector(dataB);
      AlgVector result = a.add(b);
      assertVectorAndDataMatch(result,
        new double[]{1.2 + 2.2, 3.4 + 3.0, 5.6 + 4.1});
  }
}