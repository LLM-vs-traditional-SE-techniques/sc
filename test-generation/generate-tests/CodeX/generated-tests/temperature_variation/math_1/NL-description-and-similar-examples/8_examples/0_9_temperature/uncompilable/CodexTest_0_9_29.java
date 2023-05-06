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


public class CodexTest_0_9_29 { 
  @Test
    public void testScalarMultiply() {
        Vector1D u = new Vector1D(1.0, 2.0, 3.0);
        Vector1D v = new Vector1D(-4.0, 5.0, -6.0);
        Assert.assertEquals(0, u.scalarMultiply(0).distance(new Vector1D(0.0, 0.0, 0.0)), 1.0e-10);
        Assert.assertEquals(v.distance(Vector1D.ZERO), u.scalarMultiply(-1).distance(v), 1.0e-10);
        Vector1D w = u.scalarMultiply(2);
        Assert.assertEquals(2.0, w.getX(), 1.0e-10);
        Assert.assertEquals(4.0, w.getY(), 1.0e-10);
        Assert.assertEquals(6.0, w.getZ(), 1.0e-10);
}