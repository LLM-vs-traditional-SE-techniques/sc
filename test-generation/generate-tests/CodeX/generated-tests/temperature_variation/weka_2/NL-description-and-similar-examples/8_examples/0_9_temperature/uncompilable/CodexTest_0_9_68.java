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


public class CodexTest_0_9_68 { 
  @Test
  public void testToInstance() {
    try {
      Random random = new Random();
      int n = 10;
      double[][] matrix = new double[n][n];
      for (int i = 0; i < n; i++) {
	for (int j = 0; j < n; j++) {
	  matrix[i][j] = random.nextDouble();
	}
      }
      double[] vector = new double[n];
      for (int i = 0; i < n; i++) {
	vector[i] = random.nextDouble();
      }
      Matrix A = new DenseDoubleMatrix2D(matrix);
      Vector b = new DenseDoubleMatrix1D(vector);
      Vector x = new DenseDoubleMatrix1D(n);
      AbstractLinearRegression.solve(A, b, x);
     Instance inst = x.toInstance(new Instances(new StringReader(
								  weather.arff())));
    } catch (Exception e) {
      e.printStackTrace();
      fail();
    }
  }
}