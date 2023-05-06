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


public class CodexTest_0_6_43 { 
  @Test
    public void testMultiply() {
        Vector1D v1 = new Vector1D(1);
        Vector1D v2 = new Vector1D(2);
        Vector1D v3 = new Vector1D(3);
        Vector1D v4 = new Vector1D(4);
        Vector1D v5 = new Vector1D(5);
        Vector1D v6 = new Vector1D(6);
        Vector1D v7 = new Vector1D(7);
        Vector1D v8 = new Vector1D(8);
        Vector1D v9 = new Vector1D(9);
        Vector1D v10 = new Vector1D(10);
        Assert.assertEquals(2.0, v1.scalarMultiply(2).getNorm(), 1.0e-12);
        Assert.assertEquals(3.0, v2.scalarMultiply(3).getNorm(), 1.0e-12);
        Assert.assertEquals(4.0, v3.scalarMultiply(4).getNorm(), 1.0e-12);
        Assert.assertEquals(5.0, v4.scalarMultiply(5).getNorm(), 1.0e-12);
        Assert.assertEquals(6.0, v5.scalarMultiply(6).getNorm(), 1.0e-12);
        Assert.assertEquals(7.0, v6.scalarMultiply(7).getNorm(), 1.0e-12);
        Assert.assertEquals(8.0, v7.scalarMultiply(8).getNorm(), 1.0e-12);
        Assert.assertEquals(9.0, v8.scalarMultiply(9).getNorm(), 1.0e-12);
        Assert.assertEquals(10.0, v9.scalarMultiply(10).getNorm(), 1.0e-12);
        Assert.assertEquals(11.0, v10.scalarMultiply(11).get
}