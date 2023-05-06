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


public class CodexTest_0_6_85 { 
  @Test
    public void testAdd() {
        Vector1D v1 = new Vector1D(1);
        Vector1D v2 = new Vector1D(-4);
        Vector1D v3 = v1.scalarMultiply(1);
        Assert.assertTrue(v1.scalarMultiply(0).isZero());
        Assert.assertEquals(v1, v1.scalarMultiply(1));
        Assert.assertEquals(v1.scalarMultiply(2), v1.add(v1));
        Assert.assertEquals(v1.scalarMultiply(1.5), v1.scalarMultiply(0.5).add(v1));
        Assert.assertEquals(v1.scalarMultiply(3), v1.add(v2).scalarMultiply(3).subtract(v2));
        Assert.assertEquals(v1.scalarMultiply(2), v1.add(v1.scalarMultiply(-1)));
        Assert.assertEquals(v1.scalarMultiply(2), v3.add(v3));
    }
}