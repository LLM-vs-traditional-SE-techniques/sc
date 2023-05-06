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


public class CodexTest_0_6_50 { 
  @Test
    public static void doubleTest() {
			double[] data={1,2,3,4,5,6};
			DoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
			DoubleMatrix1D vector2 = new DenseDoubleMatrix1D(data);
			System.out.println(vector.add(vector2));
		}
}