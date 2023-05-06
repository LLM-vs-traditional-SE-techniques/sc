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


public class CodexTest_0_8_10 { 
  @Test
    public static void doubleTest3() {
			double[] data={1.2, 2.3, 2.11, 2.23, 2.31, 2.32, 2.33};
			DoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
			double min_value = vector.aggregate(DoubleFunctions.min,DoubleFunctions.identity);
			double max_value = vector.aggregate(DoubleFunctions.max,DoubleFunctions.identity);
			double len = vector.aggregate(DoubleFunctions.plus,DoubleFunctions.square);
			double avg = vector.aggregate(DoubleFunctions.plus,DoubleFunctions.identity)/vector.size();
			//System.out.println(len);
			vector = vector.assign(DoubleFunctions.minus(avg));
			vector = vector.assign(DoubleFunctions.div(Math.sqrt(len)));
			System.out.println(vector);
		}
}