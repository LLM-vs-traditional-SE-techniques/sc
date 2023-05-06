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


public class CodexTest_0_9_3 { 
  @Test
    public static void doubleTest16 (){
			
			double[] values = {1,2,3,4,5,6};
			DoubleMatrix1D dense= new DenseDoubleMatrix1D(values);
			DoubleMatrix1D dense1= new DenseDoubleMatrix1D(values);
			DoubleMatrix1D denseResult=dense.add(dense1);
			
			
			System.out.println (denseResult);
			
		}
}