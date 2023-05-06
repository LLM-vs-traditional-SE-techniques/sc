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


public class CodexTest_0_8_75 { 
  @Test
  public static void doubleTest22() {
			double[] data={1,2,3,4,5,6};
			DoubleFactory1D f = DoubleFactory1D.dense;
			DoubleMatrix1D vector = f.make(data);
			vector.assign(2);
					System.out.println(vector);
		}
}