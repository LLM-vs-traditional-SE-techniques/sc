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
  public void testDistanceFunction() {
		  int n = 5;
		  double blendFactor = 1.0;
		  double[] values = new double[n+1];
		  for (int i = 1; i <= n; i++) {
		    values[i] = i;
		  }
		  Instances data = makeTestDataset(1, n);
		  AlgVector v = new AlgVector(values);
		  DistanceFunction distF = new EuclideanDistance();
		  double result = distF.distance(v, data.instance(0), blendFactor, Double.POSITIVE_INFINITY);
		  assertTrue("distance incorrect", result == 5.0);
		}
}