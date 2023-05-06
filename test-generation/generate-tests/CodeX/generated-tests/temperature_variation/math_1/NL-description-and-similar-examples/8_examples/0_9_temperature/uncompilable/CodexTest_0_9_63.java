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


public class CodexTest_0_9_63 { 
  @Test
    public void testConstantVector() {
        Vector1D v1 = new Vector1D(0);
        Vector1D v2 = new Vector1D(1);
        Vector1D v3 = new Vector1D(2);
        Vector1D v4 = v3.scalarMultiply(-1);
        Vector1D v5 = new Vector1D(v4.getX());
        Vector1D v6 = new Vector1D(v4.getY());
        Vector1D v7 = new Vector1D(v4.getZ());
        Assert.assertEquals(0.0, Vector1D.angle(v1, v2), 1.0e-15);
        Assert.assertEquals(0.0, Vector1D.angle(v1, v3), 1.0e-15);
        Assert.assertEquals(0.0, Vector1D.angle(v1, v4), 1.0e-15);
        Assert.assertEquals(0.0, Vector1D.angle(v1, v5), 1.0e-15);
        Assert.assertEquals(0.0, Vector1D.angle(v1, v6), 1.0e-15);
        Assert.assertEquals(0.0, Vector1D.angle(v1, v7), 1.0e-15);
        Assert.assertEquals(0.0, Vector1D.angle(v2, v1), 1.0e-15);
        Assert.assertEquals(0.0, Vector1D.angle(v2, v3), 1.0e-15);
        Assert.assertEquals(0.0, Vector1D.angle(v2, v4), 1.0e-15);
        Assert.assertEquals(0.0, Vector1D.angle(v2, v5), 1.0e-15);
        Assert.assertEquals(0.0, Vector1D.angle(v2, v6), 1.0e-15);
        Assert.assertEquals(0.0, Vector1D.
}