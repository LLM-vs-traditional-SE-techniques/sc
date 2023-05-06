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


public class CodexTest_0_7_28 { 
  @Test
    public void testZero() {
        Vector1D zero = Vector1D.ZERO;
        Assert.assertEquals(0, zero.getX(), 1.0e-12);
        Assert.assertEquals(0.0, zero.distance(zero), 1.0e-12);
        Assert.assertEquals(0.0, zero.getNorm(), 1.0e-12);
        Assert.assertEquals(zero, Vector1D.ZERO);
        zero = Vector1D.ZERO.scalarMultiply(2);
        Assert.assertTrue(Vector1D.ZERO.equals(zero));
    }
}