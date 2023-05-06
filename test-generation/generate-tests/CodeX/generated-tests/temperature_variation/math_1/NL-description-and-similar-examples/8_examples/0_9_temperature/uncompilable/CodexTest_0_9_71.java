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


public class CodexTest_0_9_71 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v = new Vector1D(1);
        Assert.assertEquals(2.0, v.scalarMultiply(2.0).getX(), 1.0e-15);
        Assert.assertEquals(0.0, v.scalarMultiply(0.0).getX(), 1.0e-15);
        Assert.assertEquals(v.scalarMultiply(2.0), v.scalarMultiply(1.0).scalarMultiply(2.0));
        Assert.assertEquals(v, v.scalarMultiply(1.0));
        try {
            v.scalarMultiply(Double.NaN);
            Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // expected behavior
        }
        try {
            Vector1D.scalarMultiply(v, Double.NaN);
            Assert.fail("an exception should have been thrown");
        } catch (MathIllegalArgumentException e) {
            // expected behavior
        }
    }
}