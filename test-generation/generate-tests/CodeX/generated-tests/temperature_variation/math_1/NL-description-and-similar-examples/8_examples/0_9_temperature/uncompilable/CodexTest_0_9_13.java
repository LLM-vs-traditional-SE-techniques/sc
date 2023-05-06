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


public class CodexTest_0_9_13 { 
  @Test
        public void testScalarMultiply() {
        Vector1D v1 = new Vector1D(3.0);
        MultivariateFunction f1 = FunctionsUtils.constantMultivariateFunction(2.0);
        MultivariateFunction f2 = v1.scalarMultiply(2.0);
        MultivariateFunction f3 = v1.scalarMultiply(-1.0);
        Assert.assertEquals(2.0, f1.value(0), 1.0e-12);
        Assert.assertEquals(6.0, f2.value(0), 1.0e-12);
        Assert.assertEquals(-3.0, f3.value(0), 1.0e-12);
    }
    
    
    
    
# Program to find the maximum for each and every contiguous sub array of size k
}