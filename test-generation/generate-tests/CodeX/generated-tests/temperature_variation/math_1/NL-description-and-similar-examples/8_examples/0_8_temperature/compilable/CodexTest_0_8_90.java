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


public class CodexTest_0_8_90 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v1 = new Vector1D(1);
        Assert.assertEquals(v1, v1.scalarMultiply(1));
        Assert.assertEquals(v1, v1.scalarMultiply(0.0).scalarMultiply(1.0 / 0.0));
        Assert.assertEquals(v1.scalarMultiply(-1), v1.scalarMultiply(1).scalarMultiply(-1));
        Assert.assertEquals(Vector1D.NaN, v1.scalarMultiply(0.0).scalarMultiply(1.0 / 0.0));
        Assert.assertEquals(Vector1D.NaN, v1.scalarMultiply(Double.NaN));
        Assert.assertEquals(Vector1D.NaN, Vector1D.NaN.scalarMultiply(2));
        Assert.assertEquals(Vector1D.NaN, Vector1D.NaN.scalarMultiply(Double.NaN));
    }
}