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


public class CodexTest_0_9_25 { 
  @Test
    public void testMultiply() {
        Vector1D v1 = new Vector1D(1);
        Vector1D v4 = new Vector1D(4);
        Vector1D p1 = v1.scalarMultiply(2.3);
        double[] tab = {2.3};
        Assert.assertArrayEquals(tab, p1.toArray(), 1.0e-14);
        Assert.assertEquals(v1.scalarMultiply(2.3).getNorm(), v1.getNorm() * 2.3, 1.0e-15);
        Assert.assertEquals(v1.scalarMultiply(-2).add(v1.scalarMultiply(2)).getNorm(), 0.0, 1.0e-15);
        Assert.assertEquals(v1.scalarMultiply(0).scalarProduct(v1), 0.0, 1.0e-15);
        Assert.assertEquals(v1.scalarMultiply(4).scalarProduct(v4.scalarMultiply(0.25)), 1, 1.0e-15);
    }
}