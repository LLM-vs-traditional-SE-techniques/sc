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


public class CodexTest_0_8_19 { 
  @Test
  public static void doubleTest6() {
		double[] data={1,2,3,4,5,6};
		double[] data2={1,2,3,4,5,6};
		double[] data3={0,0,0,0,0,0};
		DenseDoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
		DenseDoubleMatrix1D vector2 = new DenseDoubleMatrix1D(data2);
		DenseDoubleMatrix1D vector3 = new DenseDoubleMatrix1D(data3);
		vector.assign(vector2, Functions.plus);
		vector3.assign(vector, Functions.plus);
		System.out.println(vector3);
	}
}