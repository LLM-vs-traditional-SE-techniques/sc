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


public class CodexTest_0_9_65 { 
  @Test
    public static void testMultiply1(double x, double y, int iterations) {
        org.apache.commons.math3.linear.ArrayRealVector vx = new org.apache.commons.math3.linear.ArrayRealVector(new double[]{x});
        org.apache.commons.math3.linear.ArrayRealVector vy = new org.apache.commons.math3.linear.ArrayRealVector(new double[]{y});
        org.apache.commons.math3.linear.ArrayRealVector vz = vx.ebeMultiply(vy);
        for (int i = 0; i < iterations; i++) {
            Assert.assertSame("org.apache.commons.math3.linear.ArrayRealVector.ebeMultiply()", vz, vx.ebeMultiply(vy));
        }
    }
}