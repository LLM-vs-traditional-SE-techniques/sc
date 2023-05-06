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


public class CodexTest_0_8_66 { 
  @Test
    public void testScalarMultiply() {
        Vector1D v1 = new Vector1D(1);
        Vector1D v2 = new Vector1D(-4);
        Vector1D v3 = v1.scalarMultiply(-1);
        Assert.assertEquals(-v1.getX(), v3.getX(), 1.0e-15);
        v1 = new Vector1D(2);
        v2 = v1.scalarMultiply(1.5);
        v3 = v1.scalarMultiply(1.5e-15);
        Assert.assertEquals(2 * 1.5, v2.getX(), 1.0e-15);
        Assert.assertEquals(2 * 1.5e-15, v3.getX(), 1.0e-15);
        v3 = v1.scalarMultiply(1.5e-15);
        Assert.assertTrue(v2.isNaN());
        Assert.assertTrue(Double.isNaN(v2.getX()));
    }
}