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


public class CodexTest_0_7_5 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v = new Vector1D(1);
        Vector1D w = new Vector1D(2);
        Vector1D u = new Vector1D(0);
        Assert.assertEquals(0.0, v.scalarMultiply(0).getNorm(), 0);
        Assert.assertEquals(2.0, v.scalarMultiply(2).getNorm(), 0);
        Assert.assertEquals(FastMath.sqrt(8.0), v.scalarMultiply(2).distance(w), 1.0e-12);
        Assert.assertEquals(new Vector1D(2).getNorm(), v.scalarMultiply(2).distance(w), 1.0e-12);
        Assert.assertEquals(new Vector1D(2).getNorm(), v.scalarMultiply(-2).distance(u), 1.0e-12);
    }
}