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


public class CodexTest_0_9_1 { 
  @Test
    public void testMultiply() {
        Vector1D v1 = new Vector1D(0);
        Vector1D v2 = new Vector1D(8);
        Vector1D v3 = new Vector1D(27);
        Assert.assertEquals(new Vector1D(0), v1.scalarMultiply(0));
        Assert.assertEquals(v3, v3.scalarMultiply(1));
        Assert.assertEquals(new Vector1D(24), v2.scalarMultiply(3));
        Assert.assertEquals(new Vector1D(-71.5), v3.scalarMultiply(-2.5));
        try {
            v3.scalarMultiply(Double.NaN);
            Assert.fail("an exception should have been thrown");
        } catch (MathRuntimeException mre) {
            // expected behavior
        }
        try {
            v3.scalarMultiply(Double.POSITIVE_INFINITY);
            Assert.fail("an exception should have been thrown");
        } catch (MathRuntimeException mre) {
            // expected behavior
        }
        try {
            v3.scalarMultiply(Double.NEGATIVE_INFINITY);
            Assert.fail("an exception should have been thrown");
        } catch (MathRuntimeException mre) {
            // expected behavior
        }
    }
}