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


public class CodexTest_0_8_3 { 
  @Test
    public void testZeroVector() {
        Assert.assertEquals(0.0, Vector1D.distance(new Vector1D(-1), new Vector1D(-1)), 0);
        // The zero vector is invariant under scalar multiplication
        Assert.assertEquals(0.0, Vector1D.ZERO.scalarMultiply(1.0).getNorm(), 0);
        Assert.assertEquals(0.0, Vector1D.ZERO.scalarMultiply(0.0).getNorm(), 0);
        Assert.assertTrue(Double.isNaN(Vector1D.ZERO.scalarMultiply(Double.NaN).getNorm()));
        Assert.assertEquals(0.0, Vector1D.ZERO.scalarMultiply(-1.0).getNorm(), 0);
        Assert.assertEquals(0.0, Vector1D.ZERO.scalarMultiply(Double.POSITIVE_INFINITY).getNorm(), 0);
        Assert.assertEquals(0.0, Vector1D.ZERO.scalarMultiply(Double.NEGATIVE_INFINITY).getNorm(), 0);
        // The setX() and scalarMultiply() methods should be consistent
        Vector1D v1 = new Vector1D(1);
        Vector1D v2 = new Vector1D(2);
        // v1 and v2 are not the zero vector
        Assert.assertTrue(Double.isNaN(v1.scalarMultiply(Double.NaN).getNorm()));
        Assert.assertTrue(Double.isNaN(v2.scalarMultiply(Double.NaN).getNorm()));
        Assert.assertEquals(1.0, v1.scalarMultiply(1.0).getNorm(), 1.0e-12);
        Assert.assertEquals(0.0, v1.scalarMultiply(0.0).getNorm(), 1.0e-12);
        Assert.assertEquals(1.0, v
}