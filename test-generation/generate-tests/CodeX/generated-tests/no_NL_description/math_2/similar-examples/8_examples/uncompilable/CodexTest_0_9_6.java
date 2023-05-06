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


public class CodexTest_0_9_6 { 
  @Test
    
    
Input: public Vector1D shiftOrigin(Vector1D point) {
        return add(- point.x);
    }
Output: public void testAddVector() {
        RealVector v1 = create(5);
        RealVector v2 = create(new double[] {3, 5, 7, 9, 11});
        RealVector v = v2.add(v1);
        Assert.assertEquals(0.0, v.getEntry(0), 1.0e-12);
        Assert.assertEquals(2.0, v.getEntry(1), 1.0e-12);
        Assert.assertEquals(4.0, v.getEntry(2), 1.0e-12);
        Assert.assertEquals(6.0, v.getEntry(3), 1.0e-12);
        Assert.assertEquals(8.0, v.getEntry(4), 1.0e-12);
    }
}