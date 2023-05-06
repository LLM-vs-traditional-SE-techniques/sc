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


public class CodexTest_0_3_7 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v = new Vector1D(1);
        Assert.assertEquals(0.0, v.scalarMultiply(0).getX(), 1.0e-12);
        Assert.assertEquals(1.0, v.scalarMultiply(1).getX(), 1.0e-12);
        Assert.assertEquals(2.0, v.scalarMultiply(2).getX(), 1.0e-12);
        Assert.assertEquals(3.0, v.scalarMultiply(3).getX(), 1.0e-12);
        Assert.assertEquals(4.0, v.scalarMultiply(4).getX(), 1.0e-12);
        Assert.assertEquals(5.0, v.scalarMultiply(5).getX(), 1.0e-12);
        Assert.assertEquals(6.0, v.scalarMultiply(6).getX(), 1.0e-12);
        Assert.assertEquals(7.0, v.scalarMultiply(7).getX(), 1.0e-12);
        Assert.assertEquals(8.0, v.scalarMultiply(8).getX(), 1.0e-12);
        Assert.assertEquals(9.0, v.scalarMultiply(9).getX(), 1.0e-12);
        Assert.assertEquals(10.0, v.scalarMultiply(10).getX(), 1.0e-12);
        Assert.assertEquals(11.0, v.scalarMultiply(11).getX(), 1.0e-12);
        Assert.assertEquals(12.0, v.scalarMultiply(12).getX(), 1.0e-12);
        Assert.assertEquals(13.0, v.scalarMultiply(13).getX(), 1.0e-
}