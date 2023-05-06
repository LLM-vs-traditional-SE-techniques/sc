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


public class CodexTest_0_8_8 { 
  @Test
    public void getAsInstance(Instances model, Random random) {
        double[] data = {-1.0, 1.0, 0.0, -1.0, 0.0, 0.0};
        double[][] arrMatrix = 
			{ 
				{ -1.0, 1.0, 0.0, -1.0, 0.0, 0.0}
			};
        AlgVector algVector = new AlgVector(data);
        DoubleMatrix1D vector = new DenseDoubleMatrix1D(arrMatrix[0]);
        DoubleMatrix2D matrix = f.make(arrMatrix);
        DoubleMatrix1D res = vector.like(matrix.rows());
        matrix.zMult(vector,res);
        System.out.println(res);
    }
}