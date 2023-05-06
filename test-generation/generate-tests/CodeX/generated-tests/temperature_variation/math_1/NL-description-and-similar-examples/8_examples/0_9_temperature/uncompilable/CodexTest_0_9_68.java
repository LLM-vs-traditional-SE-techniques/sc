import org.apache.commons.math3.geometry.euclidean.oned.*;
import java.text.NumberFormat;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.geometry.Point;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.MathUtils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.geometry.Space;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_68 { 
  @Test
     public void testScalarMultiply() {
        Vector1D v1 = new Vector1D(  5);
        Vector1D v2 = new Vector1D(-10);
        Assert.assertEquals(new Vector1D( -50), v1.scalarMultiply(-10));
        Assert.assertEquals(new Vector1D(-100), v2.scalarMultiply(-10));
        Assert.assertEquals(Double.NaN, v1.scalarMultiply(Double.NaN)
                                           .getNorm(), 0);
    }
    
    
    
    
Input: public static int max(int... a) {
		    int max = a[0];
		    for (int i = 1; i < a.length; i++) {
		        if (a[i] > max)
		            max = a[i];
		    }
		    return max;
		}
Output: public static void testMax1() {
			int[] b = new int[]{6,9,13,12,6,23,6,2,3,4,1};
			int max = StdIn.max(b);
			System.out.println("Max value is " + max);
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
```
}